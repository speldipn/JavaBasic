package com.speldipn.example.ch11;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class PrintTimeZoneID {
  public static void main(String[] args) {
    String[] availableIDs = TimeZone.getAvailableIDs();
    for(int i = 0; i < availableIDs.length; ++i) {
      String id = availableIDs[i];
      System.out.println("[" + i + "]: " + id);
    }

    TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
    Calendar now = Calendar.getInstance(timeZone);
    int year = now.get(Calendar.YEAR);
    int month = now.get(Calendar.MONTH) + 1;
    int day = now.get(Calendar.DAY_OF_MONTH);

    int hour = now.get(Calendar.HOUR_OF_DAY);
    int min = now.get(Calendar.MINUTE);
    int sec = now.get(Calendar.SECOND);

    System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + min + ":" + sec);
  }
}
