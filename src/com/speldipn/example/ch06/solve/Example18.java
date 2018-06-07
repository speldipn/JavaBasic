package com.speldipn.example.ch06.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-20
 */
class ShopService {
  private static ShopService singleton = new ShopService();
  static ShopService getInstance() {
    return singleton;
  }
}

public class Example18 {
  public static void main(String[] args) {
    ShopService obj1 = ShopService.getInstance();
    ShopService obj2 = ShopService.getInstance();

    if(obj1 == obj2) {
      System.out.println("같은 ShopService 객체입니다.");
    } else {
      System.out.println("다른 ShopService 객체입니다.");
    }
  }
}
