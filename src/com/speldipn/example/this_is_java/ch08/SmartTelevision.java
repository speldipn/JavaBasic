package com.speldipn.example.this_is_java.ch08;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-05
 */
public class SmartTelevision implements Searchable, RemoteControl {
  private int volume;
  @Override
  public void turnOn() {
    System.out.println("TV를 켭니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("TV를 끕니다.");
  }

  @Override
  public void setVolume(int volume) {
    if(volume > RemoteControl.MAX_VOLUME) {
      this.volume = RemoteControl.MAX_VOLUME;
    } else if (volume < RemoteControl.MIN_VOLUME) {
      this.volume = RemoteControl.MIN_VOLUME;
    } else {
      this.volume = volume;
    }
  }

  @Override
  public void search(String url) {
    System.out.println(url + "을 검색합니다.");
  }

}
