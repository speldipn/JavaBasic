package com.speldipn.example.this_is_java.ch03.overflow;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class Overflow {
    public static void main(String[] args) {
        /* 오버플로우가 발생하여 z는 쓰레기값이 저장된다.
            int x = 1000000;
            int y = 1000000;
            int z = x * y;
         */
        long x = 1000000;
        long y = 1000000;
        long z = x * y;
        System.out.println(z);
    }
}
