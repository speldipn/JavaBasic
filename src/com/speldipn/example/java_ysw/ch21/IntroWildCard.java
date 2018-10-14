package com.speldipn.example.java_ysw.ch21;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class IntroWildCard {
    static class Fruit {
        public void showYou() {
            System.out.println("난 과일입니다.");
        }
    }

    static class Apple extends Fruit {
        @Override
        public void showYou() {
            super.showYou();
            System.out.println("난 붉은 과일입니다.");
        }
    }

    static class FruitBox<T> {
        T item;

        public void store(T item) {
            this.item = item;
        }

        public T pullOut() {
            return item;
        }
    }

    public static void openAndShowFruitBox(FruitBox<? extends Fruit> box) {
        Fruit fruit = box.pullOut();
        fruit.showYou();
    }

    public static void main(String[] args) {
        FruitBox<Fruit> box1 = new FruitBox<>();
        box1.store(new Fruit());

        FruitBox<Apple> box2 = new FruitBox<Apple>();
        box2.store(new Apple());

        openAndShowFruitBox(box1);
        openAndShowFruitBox(box2);
    }
}
