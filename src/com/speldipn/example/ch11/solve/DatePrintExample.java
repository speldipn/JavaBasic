package com.speldipn.example.ch11.solve;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-17
 */
public class DatePrintExample {
  public static void main(String[] args) {
    Date now = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
    System.out.println(sdf.format(now));
  }
}
