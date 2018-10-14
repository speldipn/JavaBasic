package com.speldipn.example.java_ysw.ch21;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-13
 */
public class GenericsBaseFruitBox {
    static class Orange {
        int sugarContent;

        public Orange(int sugar) {
            sugarContent = sugar;
        }

        public void showSugarContent() {
            System.out.println("당도: " + sugarContent);
        }
    }

    static class Apple {
        int weight;

        public Apple(int weight) {
            this.weight = weight;
        }

        public void showAppleWeight() {
            System.out.println("무게: " + weight);
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

    public static void main(String[] args) {
        FruitBox<Orange> orBox = new FruitBox<Orange>();
        orBox.store(new Orange(10));
        Orange org = orBox.pullOut();
        org.showSugarContent();

        FruitBox<Apple> apBox = new FruitBox<Apple>();
        apBox.store(new Apple(20));
        Apple app = apBox.pullOut();
        app.showAppleWeight();
    }
}
