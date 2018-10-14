package com.speldipn.example.java_ysw.ch23;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class PriorityTestTwo {
    static class MessageSendingThread extends Thread {
        private String message;
        private int sum = 0;

        public MessageSendingThread(String msg) {
            message = msg;
        }

        public MessageSendingThread(String s, int priority) {
            this(s);
            setPriority(priority);
        }

        @Override
        public void run() {
            final int max = 1000000;
            for (int i = 0; i < max; ++i) {
                System.out.println(message + "(" + getPriority() + ")");
                sum += 1;
//                if(i == max-1) {
//                    System.out.println(message + ": end !!!!");
//                }
            }
        }

        public String getMessage() { return message; }
        public int getSum() { return sum; }
    }

    public static void showSum(MessageSendingThread m) {
        System.out.println(m.getMessage() + ": " + m.getSum());
    }

    public static void main(String[] args) {
        MessageSendingThread tr1 = new MessageSendingThread("First", Thread.MAX_PRIORITY);
        MessageSendingThread tr2 = new MessageSendingThread("Second", Thread.NORM_PRIORITY);
        MessageSendingThread tr3 = new MessageSendingThread("Third", Thread.MIN_PRIORITY);

        tr1.start();
        tr2.start();
        tr3.start();

        try {
            tr1.join();
            tr2.join();
            tr3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        showSum(tr1);
        showSum(tr2);
        showSum(tr3);
    }
}
