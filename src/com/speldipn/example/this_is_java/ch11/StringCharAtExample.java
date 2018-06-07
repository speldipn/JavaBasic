package com.speldipn.example.this_is_java.ch11;

public class StringCharAtExample {
  public static void main(String[] args) {
    String ssn = "880525-1234567";
    int sex = Integer.parseInt(ssn.charAt(7) + "");
    switch (sex) {
      case 1: case 3:
        System.out.println("남자입니다.");
        break;
      case 2: case 4:
        System.out.println("여자입니다.");
        break;
      default:
          break;
    }

  }
}
