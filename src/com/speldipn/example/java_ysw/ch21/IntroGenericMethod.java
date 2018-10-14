package com.speldipn.example.java_ysw.ch21;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class IntroGenericMethod {
    static class AAA {
        public String toString() {
            return "Class AAA";
        }
    }

    static class BBB {
        public String toString() {
            return "Class BBB";
        }
    }

    static class InstanceTypeShower {
        int showCnt = 0;

        public <T> void showInstType(T inst) {
            System.out.println(inst);
            showCnt++;
        }

        void showPrintCnt() {
            System.out.println("Show count : " + showCnt);
        }
    }

    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();

        InstanceTypeShower shower = new InstanceTypeShower();
        shower.<AAA>showInstType(aaa);
        shower.<BBB>showInstType(bbb);
        shower.showInstType(aaa);
        shower.showInstType(bbb);
        shower.showPrintCnt();
    }
}
