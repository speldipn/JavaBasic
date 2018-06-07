package com.speldipn.example.this_is_java.ch11;

public class StringSubstringExample {
  public static void main(String[] args) {
    String ssn = "880525-1234567";

    String firstNum = ssn.substring(0, 6);
    System.out.println(firstNum);

    String lastNum = ssn.substring(7, 14); // begin to end index.
    System.out.println(lastNum);
  }
}
