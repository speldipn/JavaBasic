package com.speldipn.example.java_ysw.ch23;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class SyncObjectKey {
    static class IHaveTwoNum {
        int num1 = 0;
        int num2 = 0;

        public synchronized void addOneNum1() { num1 += 1;}
        public synchronized void addTwoNum1() { num1 += 2;}

        public synchronized void addOneNum2() { num2 += 1;}
        public synchronized void addTwoNum2() { num2 += 2;}

        public void showAllNums() {
            System.out.println("num1=" + num1);
            System.out.println("num2=" + num2);
        }
    }

    static class AccessThread extends Thread {
        IHaveTwoNum twoNumInst;

        public AccessThread(IHaveTwoNum inst) {
            twoNumInst = inst;
        }

        @Override
        public void run() {
            twoNumInst.addOneNum1();
            twoNumInst.addTwoNum1();
            twoNumInst.addOneNum2();
            twoNumInst.addTwoNum2();
        }
    }

    public static void main(String[] args) {
        IHaveTwoNum numInst = new IHaveTwoNum();

        AccessThread at1 = new AccessThread(numInst);
        AccessThread at2 = new AccessThread(numInst);

        at1.start();
        at2.start();

        try {
            at1.join();
            at2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        numInst.showAllNums();
    }
}
