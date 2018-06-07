package com.speldipn.example.ch07.calc;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-20
 */
public class ComputerExample {
  public static void main(String[] args) {
    int r = 10;

    Calculator calculator = new Calculator();
    System.out.println("원면적 : " + calculator.areaCircle(r));
    System.out.println();

    Computer computer = new Computer();
    System.out.println("원면적 : " + computer.areaCircle(r));
  }
}
