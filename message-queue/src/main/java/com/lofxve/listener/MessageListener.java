package com.lofxve.listener;

import com.lofxve.consumer.AbstractMessageHandle;
import com.lofxve.factory.MessageFactory;
import com.lofxve.message.Message;
import com.lofxve.producer.MessageHandler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 消息监听者
 *
 * @ClassName MessageListener
 * @Author lofxve
 * @Date 2021/4/8 15:45
 * @Version 1.0
 */
public class MessageListener {
    /**
     * 消息处理器线程池
     */
    private static ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);
    /**
     * 监听者实例
     */
    private static MessageListener instance = null;
    private boolean flag = false;

    // 双检索创建单例模式
    public static MessageListener getInstance() {
        if (instance == null) {
            synchronized (MessageListener.class) {
                if (instance == null) {
                    instance = new MessageListener();
                    return instance;
                }
            }
        }
        return instance;
    }

    /**
     * @param
     * @Method start
     * @Author lofxve
     * @Description 开始处理消息
     * @Date 2021/4/8 17:23
     * @Return void
     */
    public void start() throws Exception {
        if (!this.flag) {
            flag = true;
        } else {
            throw new Exception("【队列消息监听】消息队列已启动，不可重复启动");
        }
        // 获取消息生产者
        MessageHandler alarmHandle = MessageHandler.getInstance();
        // 提交任务
        executorService.execute(() -> {
            while (flag) {
                // 获取消息生产者队列中的消息
                Message message = alarmHandle.take();
                try {
                    if (message != null) {
                        // 从消息工厂中获取获取消息的处理器
                        AbstractMessageHandle handle = MessageFactory.getHandle(message.getType());
                        // 把消息给处理器
                        handle.setMessageField(message);
                        // 提交任务
                        executorService.execute(handle);
                    }
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void stop() {
        this.flag = false;
    }
}
