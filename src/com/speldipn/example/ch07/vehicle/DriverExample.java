package com.speldipn.example.ch07.vehicle;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class DriverExample {
  public static void main(String[] args) {
    Driver driver = new Driver();

    Bus bus = new Bus();
    Taxi taxi = new Taxi();

    driver.drive(bus);
    driver.drive(taxi);
  }
}
