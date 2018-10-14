package com.speldipn.example.java_ysw.ch15;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-11
 */

class Box {
  public void simpleWrap() {
    System.out.println("simple wrap");
  }
}

class PaperBox extends Box {
  public void paperWrap() {
    System.out.println("paper wrap");
  }
}

class GoldPaperBox extends Box {
  public void goldPaperWrap() {
    System.out.println("goldpaper wrap");
  }
}

public class InstanceOf {
  public static void wrapBox(Box box) {
    if (box instanceof GoldPaperBox) {
      ((GoldPaperBox) box).goldPaperWrap();
    } else if (box instanceof PaperBox) {
      ((PaperBox) box).paperWrap();
    } else {
      box.simpleWrap();
    }
  }

  public static void main(String[] args) {
    Box box = new Box();
    PaperBox pb = new PaperBox();
    GoldPaperBox gpb = new GoldPaperBox();

    wrapBox(box);
    wrapBox(pb);
    wrapBox(gpb);
  }
}
