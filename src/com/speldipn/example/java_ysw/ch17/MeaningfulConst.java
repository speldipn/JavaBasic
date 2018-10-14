package com.speldipn.example.java_ysw.ch17;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */

interface Week {
  int MON = 1;
  int TUE = 2;
  int WED = 3;
  int THU = 4;
  int FRI = 5;
  int SAT = 6;
  int SUN = 7;
}

public class MeaningfulConst {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input(1~7): ");
    int sel = in.nextInt();

    switch(sel) {
      case Week.MON:
        System.out.println("Weekly meeting");
        break;
      case Week.TUE:
        System.out.println("Project meeting");
        break;
      case Week.WED:
        System.out.println("Report day");
        break;
      case Week.THU:
        System.out.println("Football day");
        break;
      case Week.FRI:
        System.out.println("Meeting finishing");
        break;
      case Week.SAT:
        System.out.println("Stay with family");
        break;
      case Week.SUN:
        System.out.println("Break time");
        break;
      default:
    }
  }
}
