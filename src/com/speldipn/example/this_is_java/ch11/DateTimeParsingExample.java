package com.speldipn.example.this_is_java.ch11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-16
 */
public class DateTimeParsingExample {
  public static void main(String[] args) {
    DateTimeFormatter formatter;
    LocalDate localDate;

    localDate = LocalDate.parse("2024-05-21");
    System.out.println(localDate);

    formatter = DateTimeFormatter.ISO_LOCAL_DATE;
    localDate = LocalDate.parse("2024-05-21", formatter);
    System.out.println(localDate);

    formatter = DateTimeFormatter.ofPattern("yyyy*MM*dd");
    localDate = LocalDate.parse("2024-05-21", formatter);
    System.out.println(localDate);

    formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    localDate = LocalDate.parse("2024-05-21", formatter);
    System.out.println(localDate);
  }
}
