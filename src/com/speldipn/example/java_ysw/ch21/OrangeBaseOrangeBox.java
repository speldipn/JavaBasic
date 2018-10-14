package com.speldipn.example.java_ysw.ch21;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class OrangeBaseOrangeBox {
    static class Orange {
        int sugarContent;

        public Orange(int sugar) {
            sugarContent = sugar;
        }

        public void showSugraContent() {
            System.out.println("당도 : " + sugarContent);
        }
    }

    static class OrangeBox {
        Orange item;

        public void store(Orange item) {
            this.item = item;
        }

        public Orange pullOut() {
            return item;
        }
    }

    public static void main(String[] args) {
        OrangeBox fBox1 = new OrangeBox();
        fBox1.store(new Orange(10));
        Orange org1 = fBox1.pullOut();
        org1.showSugraContent();

        OrangeBox fBox2 = new OrangeBox();
//        fBox2.store("오렌지");
//        Orange org2 = fBox2.pullOut();
//        org2.showSugraContent();
    }
}
