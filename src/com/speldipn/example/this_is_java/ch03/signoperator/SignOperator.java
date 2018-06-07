package com.speldipn.example.this_is_java.ch03.signoperator;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class SignOperator {
    public static void main(String[] args) {
        int x = 100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

        short s = 100;
        // int로 바뀌기 때문에 명시적 형변환하지 않으면 컴파일 에러!!
        short result3 = (short)+s;
        short result4 = (short)-s;
        System.out.println(result3);
        System.out.println(result4);


    }
}
