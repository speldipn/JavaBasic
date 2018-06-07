package com.speldipn.example.this_is_java.ch03.arthimeticoperator;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class CharOperator {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        char c3 = (char)(c1 + 1); // 컴파일 에러
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);

    }
}
