package com.speldipn.example.ch11;

import java.util.Objects;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-12
 */
public class ToStringExample {
  public static void main(String[] args) {
    String str1 = "홍길동";
    String str2 = null;

    System.out.println(Objects.toString(str1));
    System.out.println(Objects.toString(str2));
    System.out.println(Objects.toString(str2, "이름이 없습니다"));
  }
}
