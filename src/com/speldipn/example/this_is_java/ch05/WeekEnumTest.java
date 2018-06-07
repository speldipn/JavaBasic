package com.speldipn.example.this_is_java.ch05;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-18
 */
public class WeekEnumTest {
  public static void main(String[] args) {
    Week week = Week.SATURDAY;
    switch (week) {
      case MONDAY:
        System.out.println("월요일 입니다.");
        break;
      case TUESDAY:
        System.out.println("화요일 입니다.");
        break;
      case WEDNESDAY:
        System.out.println("수요일 입니다.");
        break;
      case THURSDAY:
        System.out.println("목요일 입니다.");
        break;
      case FRIDAY:
        System.out.println("금요일 입니다.");
        break;
      case SATURDAY:
        System.out.println("토요일 입니다.");
        break;
      case SUNDAY:
        System.out.println("일요일 입니다.");
        break;
      default:
    }
  }
}
