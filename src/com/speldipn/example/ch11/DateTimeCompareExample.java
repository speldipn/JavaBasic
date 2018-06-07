package com.speldipn.example.ch11;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class DateTimeCompareExample {
  public static void main(String[] args) {
    LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
    System.out.println("시작일: " + startDateTime);

    LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
    System.out.println("종료일: " + endDateTime);

    //--------------------------------------------
    if (startDateTime.isBefore(endDateTime)) {
      System.out.println("진행 중입니다.");
    } else if (startDateTime.isEqual(endDateTime)) {
      System.out.println("종료합니다.");
    } else {
      System.out.println("종료했습니다.");
    }
    System.out.println();

    //--------------------------------------------
    System.out.println("[종료까지 남은 시간]");
    long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
    long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
    long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
    long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
    long remainMin = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
    long remainSec = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
    System.out.print(remainYear + " ");
    System.out.print(remainMonth + " ");
    System.out.print(remainDay + " ");
    System.out.print(remainHour + " ");
    System.out.print(remainMin + " ");
    System.out.println(remainSec);

    remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
    remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
    remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
    remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
    remainMin = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
    remainSec = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
    System.out.print(remainYear + " ");
    System.out.print(remainMonth + " ");
    System.out.print(remainDay + " ");
    System.out.print(remainHour + " ");
    System.out.print(remainMin + " ");
    System.out.println(remainSec);
    System.out.println();

    //--------------------------------------------
    System.out.println("[종료까지 남은 시간]");
    Period period =
      Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
    System.out.print("남은 시간: " + period.getYears() + "년 ");
    System.out.print(period.getMonths() + "월 ");
    System.out.println(period.getDays() + "일");
    System.out.println();

    //--------------------------------------------

    try {
      Duration duration = Duration.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
      System.out.println("남은 초: " + duration.getSeconds());
    } catch (Exception e) {
      System.out.println(e.getMessage());
//      e.printStackTrace();
    }
  }
}
