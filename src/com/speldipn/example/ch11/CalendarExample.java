package com.speldipn.example.ch11;

import java.util.Calendar;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class CalendarExample {
  public static void main(String[] args) {
    Calendar now = Calendar.getInstance();

    int year = now.get(Calendar.YEAR);
    int month = now.get(Calendar.MONTH) + 1;
    int day = now.get(Calendar.DAY_OF_MONTH);

    int hour = now.get(Calendar.HOUR_OF_DAY);
    int min = now.get(Calendar.MINUTE);
    int sec = now.get(Calendar.SECOND);

    System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + min + ":" + sec);

    switch (now.get(Calendar.DAY_OF_WEEK)) {
      case Calendar.SUNDAY:
        System.out.println("일요일");
        break;
      case Calendar.MONDAY:
        System.out.println("월요일");
        break;
      case Calendar.TUESDAY:
        System.out.println("화요일");
        break;
      case Calendar.WEDNESDAY:
        System.out.println("수요일");
        break;
      case Calendar.THURSDAY:
        System.out.println("목요일");
        break;
      case Calendar.FRIDAY:
        System.out.println("금요일");
        break;
      case Calendar.SATURDAY:
        System.out.println("일요일");
        break;
      default:
        break;
    }

    int amPm = now.get(Calendar.AM_PM);
    if(amPm == Calendar.AM) {
      System.out.println("오전");
    } else {
      System.out.println("오후");
    }
  }
}
