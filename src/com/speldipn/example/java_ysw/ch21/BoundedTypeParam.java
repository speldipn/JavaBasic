package com.speldipn.example.java_ysw.ch21;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class BoundedTypeParam {
    interface SimpleInterface {
        public void showYourName();
    }

    static class UpperClass {
        public void showYourAncestor() {
            System.out.println("UpperClass");
        }
    }

    static class AAA extends UpperClass implements SimpleInterface {
        @Override
        public void showYourName() {
            System.out.println("Class AAA");
        }
    }

    static class BBB extends UpperClass implements SimpleInterface {
        @Override
        public void showYourName() {
            System.out.println("Class BBB");
        }
    }

    public static <T> void showInstanceAncestor(T param) {
        ((SimpleInterface) param).showYourName();
    }

    public static <T> void showInstanceName(T param) {
        ((UpperClass) param).showYourAncestor();
    }

    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();

        showInstanceAncestor(aaa);
        showInstanceName(aaa);
        showInstanceAncestor(bbb);
        showInstanceName(bbb);

    }
}
