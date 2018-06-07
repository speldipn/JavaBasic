package com.speldipn.example.this_is_java.ch11;

import java.time.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class DateTimeInfoExample {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);

    String strDateTime = now.getYear() + "년";
    strDateTime += now.getDayOfMonth() + "월";
    strDateTime += now.getDayOfMonth() + "일 ";
    strDateTime += now.getDayOfWeek() + " ";
    strDateTime += now.getHour() + "시";
    strDateTime += now.getMinute() + "분";
    strDateTime += now.getSecond() + "초";
    strDateTime += now.getNano() + "나노초";
    System.out.println(strDateTime);

    LocalDate nowDate = now.toLocalDate();
    if(nowDate.isLeapYear()) {
      System.out.println("올해는 윤년: 2월은 29일까지 있습니다.");
    } else {
      System.out.println("올해는 평년: 2월은 28일까지 있습니다.");
    }

    // 협정 세계시와 존오프셋
    ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
    System.out.println("협정 세계시: " + utcDateTime);
    ZonedDateTime seouldDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
    System.out.println("서울 타임존: " + seouldDateTime);
    ZoneId seoulZoneId = seouldDateTime.getZone();
    System.out.println("서울 존아이디: " + seoulZoneId);
    ZoneOffset seoulZoneOffset = seouldDateTime.getOffset();
    System.out.println("서울 존오프셋: " + seoulZoneOffset);
    System.out.println();

  }
}
