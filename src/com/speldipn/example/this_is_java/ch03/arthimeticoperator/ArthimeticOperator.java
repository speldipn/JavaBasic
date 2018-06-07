package com.speldipn.example.this_is_java.ch03.arthimeticoperator;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class ArthimeticOperator {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result1 = v1 + v2;
        System.out.println("result1: " + result1);

        int result2 = v1 - v2;
        System.out.println("result2: " + result2);

        int result3 = v1 * v2;
        System.out.println("result3: " + result3);

        int result4 = v1 / v2;
        System.out.println("result4: " + result4);

        int result5 = v1 % v2;
        System.out.println("result5: " + result5);

//      피연산자중에 하나가 double이므로 실수 연산을 수행한다.
        double result6 = (double) v1 / v2;
        System.out.println("result6: " + result6);
    }
}
