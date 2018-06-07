package com.speldipn.example.this_is_java.ch03.conditionaloperation;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class ConditionalOperation {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
