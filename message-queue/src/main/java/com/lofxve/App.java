package com.lofxve;

import com.lofxve.listener.MessageListener;
import com.lofxve.message.Message;
import com.lofxve.producer.MessageHandler;

import java.util.Random;

/**
 * @ClassName App
 * @Author lofxve
 * @Date 2021/4/8 9:44
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {
        // 创建消息
        new Thread(() -> {
            try {
                while (true) {
                    MessageHandler instance = MessageHandler.getInstance();
                    Message build = Message.builder().type(new Random().nextInt(3) + 1).build();
                    instance.addMessage(build);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // 监听处理消息
        try {
            MessageListener.getInstance().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
