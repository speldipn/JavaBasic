package com.speldipn.example.this_is_java.ch07.phone;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-20
 */
public class DmbCellPhone extends CellPhone {
  int channel;

  DmbCellPhone(String model, String color, int channel) {
    this.model = model;
    this.color = color;
    this.channel = channel;
  }

  void turnOnDmb() {
    System.out.println("채널: " + channel + "번 DMB 방송 수신을 시작합니다.");
  }

  void changeChannelDmb(int channel) {
    this.channel = channel;
    System.out.println("채널 " + channel + "번으로 바꿉니다.");
  }

  void turnOffDmb() {
    System.out.println("DMB 방송 수신을 멈춥니다.");
  }

}
