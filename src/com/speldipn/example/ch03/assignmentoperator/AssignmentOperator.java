package com.speldipn.example.ch03.assignmentoperator;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class AssignmentOperator {
    public static void main(String[] args) {
        int result = 0;
        result += 10;
        System.out.println("result: " + result);
        result -= 5;
        System.out.println("result: " + result);
        result *= 3;
        System.out.println("result: " + result);
        result /= 5;
        System.out.println("result: " + result);
        result %= 3;
        System.out.println("result: " + result);

    }
}
