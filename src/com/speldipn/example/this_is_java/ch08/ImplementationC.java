package com.speldipn.example.this_is_java.ch08;

public class ImplementationC implements InterfaceC {
  @Override
  public void methodC() {
    System.out.println("methodC() 호출.");
  }

  @Override
  public void methodA() {
    System.out.println("methodA() 호출.");
  }

  @Override
  public void methodB() {
    System.out.println("methodB() 호출.");
  }
}
