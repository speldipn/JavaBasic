package com.speldipn.example.ch11;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-12
 */
public class SmartPhone {
  private String company;
  private String os;

  public SmartPhone(String company, String os) {
    this.company = company;
    this.os = os;
  }

  @Override
  public String toString() {
    return company + " " + os;
  }
}
