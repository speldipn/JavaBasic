package com.speldipn.example.ch03.compareoperator;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class StringEquals {
    public static void main(String[] args) {
        String strVar1 = "오준영";  // intern pool
        String strVar2 = "오준영";  // intern pool
        String strVar3 = new String("오준영");

        System.out.println(strVar1 == strVar2);
        System.out.println(strVar1 == strVar3);
        System.out.println();
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar1.equals(strVar3));

    }
}
