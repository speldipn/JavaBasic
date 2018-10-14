package com.speldipn.example.java_ysw.ch23;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class PriorityTestThread {
    static class MessageSendingThread extends Thread {
        String message;

        public MessageSendingThread(String msg, int prio) {
            message = msg;
            setPriority(prio);
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000000; ++i) {
                System.out.println(message + "(" + getPriority() + ")");
                try { sleep(100); } catch (Exception e) { e.printStackTrace(); }
            }
        }
    }

    public static void main(String[] args) {
        MessageSendingThread th1 = new MessageSendingThread("First", Thread.MAX_PRIORITY);
        MessageSendingThread th2 = new MessageSendingThread("Second", Thread.NORM_PRIORITY);
        MessageSendingThread th3 = new MessageSendingThread("Third", Thread.MIN_PRIORITY);

        th1.start();
        th2.start();
        th3.start();
    }
}
