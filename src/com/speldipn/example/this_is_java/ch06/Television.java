package com.speldipn.example.this_is_java.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class Television {
  static String company = "Samsung";
  static String model = "LCD";
  static String info;

  static {
    info = company + "-" + model;
  }
}
