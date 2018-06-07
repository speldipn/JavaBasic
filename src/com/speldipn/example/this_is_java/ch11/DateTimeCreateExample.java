package com.speldipn.example.this_is_java.ch11;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class DateTimeCreateExample {
  public static void main(String[] args) {
    LocalDate currDate = LocalDate.now();
    System.out.println("현재 날짜: " + currDate);

    LocalDate targetDate = LocalDate.of(2024, 5, 10);
    System.out.println("목표 날짜: " +  targetDate);

    LocalTime currTime = LocalTime.now();
    System.out.println("현재 시간: " + currTime);

    LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
    System.out.println("목표 시간: " + targetTime);

    LocalDateTime currDateTime = LocalDateTime.now();
    System.out.println("현재 날짜와 시간: " + currDateTime);

    LocalDateTime targetDateTime  = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
    System.out.println("목표 날짜와 시간: " + targetDateTime);

    // 협정 세계시와 시간존(TimeZone)
    ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
    System.out.println("협정 세계시: " + utcDateTime);
    ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
    System.out.println("뉴욕 시간존: " + newyorkDateTime);

    try {
      Instant instant1 = Instant.now();
      Thread.sleep(100);
      Instant instant2 = Instant.now();
      if(instant1.isBefore(instant2)) {
        System.out.println("instant1이 빠릅니다.");
      } else if(instant1.isAfter(instant2)) {
        System.out.println("instant2가 빠릅니다.");
      } else {
        System.out.println("동일한 시간입니다.");
      }
      System.out.println("차이(nanos): " + instant1.until(instant2, ChronoUnit.NANOS));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
