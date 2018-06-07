package com.speldipn.example.ch05;

import java.util.Calendar;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-18
 */
public class EnumWeekExample {
  public static void main(String[] args) {
    Week today = null;

    Calendar now = Calendar.getInstance();
    int week = now.get(Calendar.DAY_OF_WEEK);

    switch (week) {
      case 1:
        today = Week.SUNDAY;
        break;
      case 2:
        today = Week.MONDAY;
        break;
      case 3:
        today = Week.TUESDAY;
        break;
      case 4:
        today = Week.THURSDAY;
        break;
      case 5:
        today = Week.FRIDAY;
        break;
      case 6:
        today = Week.SATURDAY;
        break;
      default:
    }
    System.out.println("오늘은 " + today + " 입니다.");

    if(today == Week.SUNDAY) {
      System.out.println("일요일에는 축구를 합니다.");
    } else {
      System.out.println("열심히 자바공부를 합니다.");
    }
  }
}
