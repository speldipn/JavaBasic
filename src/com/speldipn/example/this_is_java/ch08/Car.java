package com.speldipn.example.this_is_java.ch08;

public class Car {
  Tire[] tires = new Tire[] {
    new HankookTire(),
    new HankookTire(),
    new HankookTire(),
    new HankookTire()
  };

  void run() {
    for(int i = 0; i < tires.length; ++i) {
      tires[i].roll();
    }
  }
}
