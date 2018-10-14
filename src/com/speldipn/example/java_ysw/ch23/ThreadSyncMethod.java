package com.speldipn.example.java_ysw.ch23;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class ThreadSyncMethod {

    static class Calculator {
        int opCnt = 0;

        public int add(int n1, int n2) {
            synchronized (this) {
                ++opCnt;
            }
            return n1 + n2;
        }
        public int min(int n1, int n2) {
            synchronized (this) {
                ++opCnt;
            }
            return n1 - n2;
        }
        public void showOpCnt() {
            System.out.println("총 연산 횟수 : " + opCnt);
        }
    }

    static class AddThread extends Thread {
        Calculator cal;

        public AddThread(Calculator cal) { this.cal = cal; }

        @Override
        public void run() {
            System.out.println("1+2=" + cal.add(1, 2));
            System.out.println("2+4=" + cal.add(2, 4));
        }
    }

    static class MinThread extends Thread {
        Calculator cal;

        public MinThread(Calculator cal) { this.cal = cal; }

        @Override
        public void run() {
            System.out.println("2-1=" + cal.min(2, 1));
            System.out.println("4-2=" + cal.min(4, 2));
        }
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        AddThread at = new AddThread(cal);
        MinThread mt = new MinThread(cal);

        at.start(); mt.start();

        try {
            at.join();
            mt.join();
        } catch (InterruptedException e) { e.printStackTrace(); }

        cal.showOpCnt();
    }
}
