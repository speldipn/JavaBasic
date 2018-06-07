package com.speldipn.example.ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class DateExample {
  public static void main(String[] args) {
    Date now = new Date();
    String strNow1 = now.toString();
    System.out.println("변경전: " + strNow1);

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    String strNow = sdf.format(now);
    System.out.println("변경후: " + strNow);

  }
}
