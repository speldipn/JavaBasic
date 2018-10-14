package com.speldipn.example.java_ysw.ch18;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-12
 */

public class ThrowsFromMain {
  static class AgeInputException extends Exception {
    public AgeInputException() {
      super("유효하지 않은 나이가 입력되었습니다.");
    }
  }

  public static int readAge() throws AgeInputException {
    Scanner in = new Scanner(System.in);
    int age = in.nextInt();
    if (age < 0) {
      AgeInputException ex = new AgeInputException();
      throw ex;
    }
    return age;
  }

  public static void main(String[] args) throws AgeInputException {
    System.out.print("나이를 입력하세요: ");
    int age = readAge();
    System.out.println("당신은 " + age + "세 입니다.");
  }
}
