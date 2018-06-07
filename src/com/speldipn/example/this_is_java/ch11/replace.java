package com.speldipn.example.this_is_java.ch11;

public class replace {
  public static void main(String[] args) {
    String oldStr = "자바 프로그래밍";
    String newStr = oldStr.replace("자바", "JAVA");

    System.out.println(oldStr);
    System.out.println(newStr);
  }
}
