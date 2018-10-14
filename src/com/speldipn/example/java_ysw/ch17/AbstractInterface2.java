package com.speldipn.example.java_ysw.ch17;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */

interface PersonalNumberStorage {
  void addPersonalInfo(String name, String perNum);
  String searchName(String perNum);
}

class PersonalNumInfo {
  String name;
  String number;

  PersonalNumInfo(String name, String number) {
    this.name = name;
    this.number = number;
  }

  String getName() {
    return name;
  }

  String getNumber() {
    return number;
  }
}

class PersonalNumberStorageImpl implements PersonalNumberStorage {

  PersonalNumInfo[] perArr;
  int numOfPerInfo;

  public PersonalNumberStorageImpl(int sz) {
    perArr = new PersonalNumInfo[sz];
    numOfPerInfo = 0;
  }

  @Override
  public void addPersonalInfo(String name, String perNum) {
    perArr[numOfPerInfo++] = new PersonalNumInfo(name, perNum);
  }

  @Override
  public String searchName(String perNum) {
    for (int i = 0; i < numOfPerInfo; ++i) {
      if (perArr[i].number.equals(perNum)) {
        return perArr[i].name;
      }
    }
    return null;
  }
}

public class AbstractInterface2 {
  public static void main(String[] args) {
    PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
    storage.addPersonalInfo("Kim", "901220-1122333");
    storage.addPersonalInfo("Oh", "880710-1122333");

    System.out.println(storage.searchName("901220-1122333"));
    System.out.println(storage.searchName("880710-1122333"));
  }
}
