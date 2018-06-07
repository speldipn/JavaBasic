package com.speldipn.example.this_is_java.ch08;

public class CallListener implements Button.OnClickListener {
  @Override
  public void onClick() {
    System.out.println("전화를 겁니다.");
  }
}
