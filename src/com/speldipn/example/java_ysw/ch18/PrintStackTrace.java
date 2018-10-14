package com.speldipn.example.java_ysw.ch18;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-12
 */
public class PrintStackTrace {
  static class AgeInputException extends Exception {
    public AgeInputException() {
      super("유효하지 않은 나이가 입력되었습니다.");
    }
  }

  static class NameLengthException extends Exception {
    String wrongName;

    public NameLengthException(String name) {
      super("잘못된 이름이 입력됬습니다.");
      wrongName = name;
    }
    public void showWrongName() {
      System.out.println("잘못 입력된 이름: " + wrongName);
    }
  }

  static class PersonalInfo {
    String name;
    int age;

    public PersonalInfo(String name, int age) {
      this.name = name;
      this.age = age;
    }
    public void showPersonalInfo() {
      System.out.println("이름: " + name);
      System.out.println("나이: " + age);
    }
  }

  public static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    try {
      PersonalInfo readInfo = readPersonalInfo();
      readInfo.showPersonalInfo();
    } catch (AgeInputException e) {
      e.printStackTrace();
    } catch (NameLengthException e) {
      e.printStackTrace();
    }
  }

  private static PersonalInfo readPersonalInfo() throws NameLengthException, AgeInputException {
    String name = readName();
    int age = readAge();
    return new PersonalInfo(name, age);
  }

  private static String readName() throws NameLengthException {
    System.out.print("입력) 이름 : ");
    String name = in.nextLine();
    if(name.length() == 0) {
      NameLengthException e = new NameLengthException("");
      throw e;
    }
    return name;
  }

  private static int readAge() throws AgeInputException {
    System.out.print("입력) 나이 : ");
    int age = in.nextInt();
    if (age < 0) {
      AgeInputException e = new AgeInputException();
      throw e;
    }
    return age;
  }
}
