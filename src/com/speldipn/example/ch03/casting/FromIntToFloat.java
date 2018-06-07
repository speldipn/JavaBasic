package com.speldipn.example.ch03.casting;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-16
 */
public class FromIntToFloat {
    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;

        // float는 부호 1bit+ 지수 8bit + 가수 23bit
        // 손실이 발생하므로 float로 계산시 잘못된 값이 나온다
        // => -4가 출력됨..
        // double로 연산시 정상출력
        double num3 = num2;
        num2 = (int)num3;

        int result = num1 - num2;
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
        System.out.println(result);
    }
}
