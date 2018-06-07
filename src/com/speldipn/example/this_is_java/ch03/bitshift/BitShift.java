package com.speldipn.example.this_is_java.ch03.bitshift;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class BitShift {
    public static void main(String[] args) {
        System.out.println("1 << 3 = " + (1<<3));
        System.out.println("-8 >> 3 = " + (-8 >> 3)); // 최상위 비트는 MSB를 따름.
        System.out.println("-8 >>> 3 = " + (-8 >>> 3)); // 최상위 비트는 0으로 채움.
    }
}
