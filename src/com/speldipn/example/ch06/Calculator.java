package com.speldipn.example.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class Calculator {
  void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  int plus(int x, int y) {
    int result = x + y;
    return result;
  }

  double avg(int x, int y) {
    double sum = plus(x, y);
    double result = sum /2;
    return result;
  }

  void println(String message) {
    System.out.println(message);
  }

  void execute() {
    double result = avg(7, 10);
    println("실행결과 : " + result);
  }

  double divide(int x, int y) {
    double result = (double) x / y;
    return result;
  }

  void powerOff() {
    System.out.println("전원을 끕니다.");
  }

  double areaRectangle(double width) {
    return width *  width;
  }

  double areaRectangle(double width, double height) {
    return width * height;
  }
}
