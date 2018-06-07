package com.speldipn.example.this_is_java.ch08;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class Audio implements RemoteControl {
  // 필드
  private int volume;
  private boolean mute;

  // turnOn() 메소드의 실체 메소드
  @Override
  public void turnOn() {
    System.out.println("Audio를 켭니다.");
  }

  // turnOff() 메소드의 실체 메소드
  @Override
  public void turnOff() {
    System.out.println("Audio를 끕니다.");
  }

  // setVolume 추상 메소드의 실체 메소드
  @Override
  public void setVolume(int volume) {
    if(volume > MAX_VOLUME) {
      this.volume = MAX_VOLUME;
    } else if(volume < MIN_VOLUME) {
      this.volume = MIN_VOLUME;
    } else {
      this.volume = volume;
    }
    System.out.println("현재 Audio 볼륨: " + volume);
  }

  @Override
  public void setMute(boolean mute) {
    this.mute = mute;
    if(mute) {
      System.out.println("Audio를 무음 처리합니다.");
    } else {
      System.out.println("Audio를 무음 해제합니다.");
    }
  }
}
