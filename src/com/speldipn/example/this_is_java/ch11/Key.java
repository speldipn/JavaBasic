package com.speldipn.example.this_is_java.ch11;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-12
 */
public class Key {
  public int number;

  public Key(int number) {
    this.number = number;
  }

//  @Override
//  public int hashCode() {
//    return number;
//  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Key) {
      Key key = (Key)obj;
      if(this.number == key.number) {
        return true;
      }
    }
    return false;
  }
}
