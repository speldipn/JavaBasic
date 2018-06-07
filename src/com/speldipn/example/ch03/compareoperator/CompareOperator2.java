package com.speldipn.example.ch03.compareoperator;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class CompareOperator2 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3); // true

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5); // false
        System.out.println((float)v4 == v5); // true;
        System.out.println((int)v4 == (int)v5);  // true

    }
}
