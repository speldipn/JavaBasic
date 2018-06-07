package com.speldipn.example.this_is_java.ch11;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class DateTimeChangeExample {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    System.out.println("현재: " + now);

    LocalDateTime targetDateTime = null;

    // 직접 변경
    targetDateTime =
      now.withYear(2024)
        .withMonth(10)
        .withDayOfMonth(5)
        .withHour(3)
        .withMinute(30)
        .withSecond(20);
    System.out.println("직접 변경: " + targetDateTime);

    // 년도 상대 변경
    targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
    System.out.println("이번 해의 첫 일: " + targetDateTime);
    targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
    System.out.println("이번 해의 마지막 일: " + targetDateTime);
    targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
    System.out.println(targetDateTime);

    // 월 상대 변경
    targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
    System.out.println("이번 달의 첫 일: " + targetDateTime);
    targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
    System.out.println("이번 달의 마지막 일: " + targetDateTime);
    targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
    System.out.println("다음 달의 첫 일: " + targetDateTime);

    // 요일 상대 변겨
    targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
    System.out.println("이번 달의 첫 월요일 : " + targetDateTime);
    targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    System.out.println("돌아오는 월요일: " + targetDateTime);
    targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
    System.out.println("지난 월요일: " + targetDateTime);
  }
}
