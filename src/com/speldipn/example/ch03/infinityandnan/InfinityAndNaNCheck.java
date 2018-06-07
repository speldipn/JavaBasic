package com.speldipn.example.ch03.infinityandnan;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class InfinityAndNaNCheck {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;

        double z = x / y;
        // double z = x % y;

        System.out.println(Double.isInfinite(z));
        System.out.println(Double.isNaN(z)); // NaN : Not A Number

        // Infinity 이므로 어떠한 수와 연산을 하더라도 Infinity..
        System.out.println(z + 2); // 문제가 되는 코드

    }
}
