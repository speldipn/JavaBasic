package com.speldipn.example.this_is_java.ch08;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class RemoteControllerExample {
  public static void main(String[] args) {
//    RemoteCnotrol rc = new RemoteCnotrol() {
//      public void turnOn() {
//        System.out.println("turn on");
//      }
//
//      public void turnOff() {
//        System.out.println("turn off");
//      }
//
//      public void setVolume(int volume) {
//        System.out.println("set volume(" + volume + ")");
//      }
//    };
//
//    rc.turnOn();
//    rc.turnOff();
//    rc.setVolume(20);

    RemoteControl rc = null;

    rc = new Television();
    rc.turnOn();
    rc.setMute(true);

    rc = new Audio();
    rc.turnOn();
    rc.setMute(true);

    RemoteControl.changeBattery();

  }
}
