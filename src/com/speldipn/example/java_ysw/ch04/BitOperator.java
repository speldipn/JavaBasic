package com.speldipn.example.java_ysw.ch04;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class BitOperator {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 3;
    int num3 = -1;

    System.out.println(getBinaryString(num1 & num2));
    System.out.println(getBinaryString(num1 | num2));
    System.out.println(getBinaryString(num1 ^ num2));
    System.out.println(getBinaryString(~num3));

    System.out.println(getBinaryString(-1));
    System.out.println(getBinaryString(-1 >>> 1));
    System.out.println(-1 >>> 1);


  }

  public static String getBinaryString(int x) {
    StringBuilder sb = new StringBuilder();
    for (int i = Integer.SIZE - 1; i >= 0; --i) {
      sb.append((((x >> i) & 0x01) == 0x01) ? "1" : "0");
    }
    return sb.toString();
  }

}
