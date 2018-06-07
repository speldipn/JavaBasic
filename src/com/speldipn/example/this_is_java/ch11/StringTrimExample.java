package com.speldipn.example.this_is_java.ch11;

public class StringTrimExample {
  public static void main(String[] args) {
    String tel1 = "  02";
    String tel2 = "123   ";
    String tel3 = "   123   ";
    String tel4 = "   1 2 3   ";

    String tel = tel1.trim() + "/" + tel2.trim() + "/" + tel3.trim() + "/" + tel4.trim();
    System.out.println(tel);
  }
}
