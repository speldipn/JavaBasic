package com.speldipn.example.this_is_java.ch05;

import java.util.Calendar;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-18
 */
public class CalendarExample {
  public static void main(String[] args) {
    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);
    int month = now.get(Calendar.MONTH)+1;
    int day = now.get(Calendar.DAY_OF_MONTH);
    int week = now.get(Calendar.DAY_OF_WEEK);
    int hour = now.get(Calendar.HOUR);
    int min = now.get(Calendar.MINUTE);
    int sec = now.get(Calendar.SECOND);

    System.out.print(year + "-" + month + "-" + day + " ");
    switch (week) {
      case Calendar.MONDAY:
        System.out.print("월 ");
        break;
      case Calendar.TUESDAY:
        System.out.print("화 ");
        break;
      case Calendar.WEDNESDAY:
        System.out.print("수 ");
        break;
      case Calendar.THURSDAY:
        System.out.print("목 ");
        break;
      case Calendar.FRIDAY:
        System.out.print("금 ");
        break;
      case Calendar.SATURDAY:
        System.out.print("토 ");
        break;
      case Calendar.SUNDAY:
        System.out.print("일 ");
        break;
    }
    System.out.print(hour + ":" + min + ":" + sec);
    System.out.println();
  }
}
