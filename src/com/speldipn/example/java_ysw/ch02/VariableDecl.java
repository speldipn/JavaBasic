package com.speldipn.example.java_ysw.ch02;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-09
 */
public class VariableDecl {
  public static void main(String[] args) {
    double num1, num2, result;
    num1 = 1.0000001;
    num2 = 1.0000001;
    result = num1 + num2;
    float num3, num4, result1;
    num3 = (float) 1.0000001;
    num4 = (float) 1.0000001;
    result1 = num3 + num4;

//    System.out.println(result);
//    System.out.println(result1);

    int x = -2;
    System.out.println(showBinary(x));
    System.out.println(showBinary(x >>> 1));
    System.out.println(showBinary(x >> 1));
    System.out.println(showBinary(-2147483648));
  }

  public static String showBinary(int x) {
    StringBuilder sb = new StringBuilder();
    System.out.println(x);
    for (int i = Integer.SIZE - 1; i >= 0; --i) {
      sb.append((((x >> i) & 0x01) == 0x01) ? "1" : "0");
    }
    return sb.toString();
  }

}
