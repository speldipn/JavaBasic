package com.speldipn.example.this_is_java.ch03.Accuracy;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class Accuracy {
    public static void main(String[] args) {
//        int apple = 1;
//        double pieceUnit = 0.1;
//        int number = 7;
//
//        double result = apple - number * pieceUnit;
//
//        System.out.println("사과 한개에서 ");
//        System.out.println("0.7 조각을 빼면, ");
//        System.out.println(result + "조각이 남는다.");

        ///////////////////////////////////
        int apple = 1;

        int totalPieces = apple * 10;
        int number = 7;
        int temp = totalPieces - number;

        double result = temp/10.0;
        System.out.println("사과 한개에서 ");
        System.out.println("0.7 조각을 빼면, ");
        System.out.println(result + "조각이 남는다.");
    }
}
