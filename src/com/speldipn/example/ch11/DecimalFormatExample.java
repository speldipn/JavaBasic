package com.speldipn.example.ch11;

import java.text.DecimalFormat;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class DecimalFormatExample {
  public static void main(String[] args) {
    double num = 12345789.56;

    DecimalFormat df = new DecimalFormat("0");
    System.out.println(df.format(num));

    df = new DecimalFormat("0.0");
    System.out.println(df.format(num));

    df = new DecimalFormat("00000000000.00000");
    System.out.println(df.format(num));

    df = new DecimalFormat("#");
    System.out.println(df.format(num));

    df = new DecimalFormat("#.#");
    System.out.println(df.format(num));

    df = new DecimalFormat("##########.#####");
    System.out.println(df.format(num));

    df = new DecimalFormat("#.0");
    System.out.println(df.format(num));

    df = new DecimalFormat("-#.0");
    System.out.println(df.format(num));

    df = new DecimalFormat("#,###.0");
    System.out.println(df.format(num));

    df = new DecimalFormat("0.0E0");
    System.out.println(df.format(num));

//    df = new DecimalFormat("+#,### ; -#,###");
//    System.out.println(df.format(df));

    df = new DecimalFormat("#.# %");
    System.out.println(df.format(num));

    df = new DecimalFormat("\u00A4 #,###");
    System.out.println(df.format(num));
  }
}
