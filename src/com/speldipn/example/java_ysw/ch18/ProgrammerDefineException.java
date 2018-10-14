package com.speldipn.example.java_ysw.ch18;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-12
 */

class AgeInputException extends Exception {
    public AgeInputException() {
    super("유효하지 않은 나이가 입력되었습니다.");
  }
}

public class ProgrammerDefineException {

  public static int readAge() throws AgeInputException {
    Scanner in = new Scanner(System.in);
    int age = in.nextInt();
    if (age < 0) {
      AgeInputException excpt = new AgeInputException();
      throw excpt;
    }
    return age;
  }

  public static void main(String[] args) {
    try {
      System.out.print("나이를 입력하세요 : ");
      int age = readAge();
      System.out.println("당신은 " + age + "세 입니다.");
    } catch (AgeInputException e) {
      System.out.println(e.getMessage());
    }
  }
}
