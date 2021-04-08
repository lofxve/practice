package com.lofxve.consumer;

import com.lofxve.message.Message;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @ClassName MessageHandler
 * @Author lofxve
 * @Date 2021/4/8 9:47
 * @Version 1.0
 */
@Slf4j
public class MessageHandler {
    private static final int MAX_SIZE = 500;
    private static MessageHandler instance;
    private static ConcurrentLinkedQueue<Message> queue;

    // 单例模式双检索创建
    public static MessageHandler getInstance() {
        if (instance == null) {
            synchronized (MessageHandler.class) {
                if (instance == null) {
                    queue = new ConcurrentLinkedQueue<>();
                    instance = new MessageHandler();
                }
            }
        }
        return instance;
    }

    public void addMessage(Message message) {
        while (queue.size() > MAX_SIZE) {
            try {
                System.out.println("消息队列已满，等待处理，count=" + queue.size());
                queue.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(message);
        queue.notifyAll();
    }

    public Message take() {
        synchronized (this) {
            if (queue == null) {
                return getInstance().take();
            } else {
                return queue.poll();
            }
        }
    }
}
