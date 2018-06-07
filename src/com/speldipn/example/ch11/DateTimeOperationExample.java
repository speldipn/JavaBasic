package com.speldipn.example.ch11;

import java.time.LocalDateTime;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class DateTimeOperationExample {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    System.out.println("현재시: " + now);

    LocalDateTime targetDateTime =
      now.plusYears(1)
        .minusMonths(2)
        .plusDays(3)
        .plusHours(4)
        .minusMinutes(5)
        .minusSeconds(6);

    String strTime = targetDateTime.getYear() + "년";
    strTime += targetDateTime.getMonthValue() + "월";
    strTime += targetDateTime.getDayOfMonth() + "일";
    strTime += " ";
    strTime += targetDateTime.getHour() + "시";
    strTime += targetDateTime.getMinute() + "분";
    strTime += targetDateTime.getSecond() + "초";

    System.out.println(targetDateTime);
    System.out.println(strTime);
  }
}
