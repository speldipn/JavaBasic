package com.speldipn.example.java_ysw.ch20;

import java.math.BigInteger;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class SoBigInteger {
  public static void main(String[] args) {
    System.out.println("최대 정수 : " + Long.MAX_VALUE);
    System.out.println("최소 정수 : " + Long.MIN_VALUE);

    BigInteger bigValue1 = new BigInteger("1000000000000000000");
    BigInteger bigValue2 = new BigInteger("-999999999999999999");

    BigInteger addResult = bigValue1.add(bigValue2);
    BigInteger mulResult = bigValue1.multiply(bigValue2);

    System.out.println("큰 수의 덧셈결과 : " + addResult);
    System.out.println("큰 수의 곱셈결과 : " + mulResult);
  }
}
