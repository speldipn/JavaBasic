package com.speldipn.example.this_is_java.ch03.compareoperator;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class CompareOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2); // 유니코드값으로 비교연산.
        System.out.println("result4: " + result4);
    }
}
