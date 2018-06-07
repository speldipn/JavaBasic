package com.speldipn.example.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class ComputerExample {
  public static void main(String[] args) {
    Computer myCom = new Computer();

    int[] values1 = {1, 2, 3};
    int result1 = myCom.sum1(values1);
    System.out.println("result1: " + result1);

    int result2 = myCom.sum1(new int[]{1, 2, 3, 4, 5});
    System.out.println("result2 : " + result2);

    int result3 = myCom.sum2(1, 2, 3);
    System.out.println("result3 : " + result3);

    int result4 = myCom.sum2(1, 2, 3, 4, 5);
    System.out.println("result4 : " + result4);

  }
}
