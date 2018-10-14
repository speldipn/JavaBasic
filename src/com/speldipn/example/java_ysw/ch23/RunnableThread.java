package com.speldipn.example.java_ysw.ch23;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class RunnableThread {
    static class Sum {
        int num;
        public Sum() { num = 0; }
        public void addNum(int n) { num += n; }
        public int getNum() { return num; }
    }

    static class AdderThread extends Sum implements Runnable {
        int start, end;

        public AdderThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; ++i) {
                addNum(i);
            }
        }
    }

    public static void main(String[] args) {
        AdderThread at1 = new AdderThread(1, 50);
        AdderThread at2 = new AdderThread(51, 100);
        Thread tr1 = new Thread(at1);
        Thread tr2 = new Thread(at2);

        tr1.start();
        tr2.start();

        try {
            tr1.join();
            tr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("1~100까지의 합: " + (at1.getNum() + at2.getNum()));
    }
}
