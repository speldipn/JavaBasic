package com.speldipn.example.java_ysw.phone_book;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class Phone {
  private String name;
  private String phoneNumber;
  private String birth;

  public Phone(String name, String phoneNumber, String birth) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.birth = birth;
  }

  public Phone(String name, String phoneNumber) {
    this(name, phoneNumber, null);
  }

  public void showPhone() {
    System.out.println("Name: " + this.name);
    System.out.println("Phone: " + this.phoneNumber);
    if(this.birth != null) { System.out.println("Birth: " + this.birth); }
  }
}
