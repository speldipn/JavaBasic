package com.speldipn.example.java_ysw.ch23;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class ConditionSyncStringReadWrite {
    static class StringComm {
        String newString;
        boolean isNewString = false;

        private final ReentrantLock entLock = new ReentrantLock();
        private final Condition readCond = entLock.newCondition();
        private final Condition writeCond = entLock.newCondition();

        public void setNewString(String news) {
            newString = news;
            entLock.lock();
            try {
                if (isNewString) {
                    writeCond.await();
                }
                newString = news;
                isNewString = true;
                readCond.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                entLock.unlock();
            }
        }

        public String getNewString() {
            String retStr = null;

            entLock.lock();
            try {
                if (isNewString == false) {
                    readCond.await();
                }

                retStr = newString;
                isNewString = false;
                writeCond.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                entLock.unlock();
            }

            return retStr;
        }
    }

    static class StringReader extends Thread {
        StringComm comm;

        public StringReader(StringComm comm) {
            this.comm = comm;
        }

        @Override
        public void run() {
            Scanner in = new Scanner(System.in);
            String readStr;

            for (int i = 0; i < 5; ++i) {
                readStr = in.nextLine();
                comm.setNewString(readStr);
            }
        }
    }

    static class StringWriter extends Thread {
        StringComm comm;

        public StringWriter(StringComm comm) {
            this.comm = comm;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; ++i) {
                System.out.println("read string : " + comm.getNewString());
            }
        }
    }

    public static void main(String[] args) {
        StringComm strComm = new StringComm();
        StringReader sr = new StringReader(strComm);
        StringWriter sw = new StringWriter(strComm);

        System.out.println("입출력 쓰레드의 실행...");
        sr.start();
        sw.start();
    }
}
