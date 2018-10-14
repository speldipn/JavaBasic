package com.speldipn.example.java_ysw.ch21;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class IntroGenericMethod2 {
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

    static class InstanceTypeShower2 {
        public <T, U> void showInstType(T inst1, U inst2) {
            System.out.println(inst1);
            System.out.println(inst2);
        }
    }

    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();

        InstanceTypeShower2 shower = new InstanceTypeShower2();
        shower.<AAA, BBB>showInstType(aaa, bbb);
        shower.showInstType(aaa, bbb);
    }
}
