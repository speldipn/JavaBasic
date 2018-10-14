package com.speldipn.example.java_ysw.ch23;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class ThreadHeapMultiAccess {
    static class Sum {
        int num;

        public Sum() { num = 0; }
        public void addNum(int n) { num += n; }
        public int getNum() { return num; }
    }

    static class AdderThread extends Thread {
        Sum sumInst;
        int start, end;

        public AdderThread(Sum sum, int s, int e) {
            sumInst = sum;
            start = s;
            end = e;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; ++i) {
                sumInst.addNum(i);
            }
        }
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        AdderThread at1 = new AdderThread(s, 0, 50);
        AdderThread at2 = new AdderThread(s, 51, 100);
        at1.start();
        at2.start();

        try {
            at1.join();
            at2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("sum = " + s.getNum());
    }
}
