package com.speldipn.example.this_is_java.ch03.infinityandnan;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class InputDataCheckNaN {
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        double currentBalance = 10000.0;

        currentBalance += val;
        System.out.println(currentBalance);

    }
}
