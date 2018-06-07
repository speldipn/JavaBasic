package com.speldipn.example.ch11.solve;

import java.util.regex.Pattern;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-17
 */
public class PatternMatcherExample {
  public static void main(String[] args) {
    String id = "5Angel1004"; // false
    isMatchID(id);
    id = "Angel10"; // false
    isMatchID(id);
    id = "Angel100"; // true
    isMatchID(id);
    id = "Angel1234567"; // true
    isMatchID(id);
    id = "Angel12345678"; // false
    isMatchID(id);
  }

  public static boolean isMatchID(String id) {
//    String regExp = "[a-zA-Z]{7,11}";
    String regExp = "[a-zA-Z]\\w{7,11}";
    System.out.print(id + "-> ");
    boolean isMatch = Pattern.matches(regExp, id);
    if (isMatch) {
      System.out.println("ID로 사용할 수 있습니다.");
    } else {
      System.out.println("ID로 사용할 수 없습니다.");
    }
    return isMatch;
  }
}
