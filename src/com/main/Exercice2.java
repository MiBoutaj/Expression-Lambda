package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercice2 {

    private static List<Apple> apples = Arrays.asList(new Apple(120, Color.RED),
            new Apple(110, Color.GREEN),
            new Apple(90, Color.GREEN),
            new Apple(30, Color.RED),
            new Apple(170, Color.GREEN)
    );



    public static void main(String[] args) {
        System.out.println();
        System.out.println("***********************Q1*********************************");
        afficher(apple -> System.out.println("An apple of " + apple.getWeight() + "g" ));

        System.out.println();
        System.out.println("***********************Q2*********************************");
        afficher(apple -> {
            if(apple.getWeight()>=150){
                System.out.println("Heavy Apple");
            }else {
                System.out.println("Light Apple");
            }
        });

        System.out.println();
        System.out.println("***********************Q3*********************************");








    }

    public static void afficher(Consumer<Apple> consumer){
        apples.forEach(consumer);
    }


    public enum Color {
        RED, GREEN;
    }

    public static class Apple {
        private int weight;
        private Color color;


        public Apple(int weight, Color color) {
            super();
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }


        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", color=" + color +
                    '}';
        }


    }

}
