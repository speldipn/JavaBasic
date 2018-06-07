package com.speldipn.example.ch11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-16
 */
public class DateTimeFormatExample {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
    String nowString = now.format(dateTimeFormatter);
    System.out.println(nowString);
  }
}
