package com.speldipn.example.ch08;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class Television implements RemoteControl {

  private int volume;

  @Override
  public void turnOn() { // 추상메소드의 실체 메소드
    System.out.println("TV를 켭니다.");
  }

  @Override
  public void turnOff() { // 추상메소드의 실체 메소드
    System.out.println("TV를 끕니다.");
  }

  @Override
  public void setVolume(int volume) { // 추상메소드의 실체 메소드
    if(volume > RemoteControl.MAX_VOLUME) {
      this.volume = RemoteControl.MAX_VOLUME;
    } else if(volume < RemoteControl.MIN_VOLUME) {
      this.volume = RemoteControl.MIN_VOLUME;
    } else {
      this.volume = volume;
    }
    System.out.println("현재 TV 볼륨: " + volume);
  }

}
