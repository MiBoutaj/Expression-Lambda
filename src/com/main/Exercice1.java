package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercice1 {


    public static void main(String[] args) {

        System.out.println("*************************Q1*********************************");
        int i = 5;
        System.out.println(i);
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        Consumer<Integer> consumer2 = t -> System.out.println(t);
        consumer2.accept(i);
        System.out.println("*************************Q2*********************************");
        List<Integer> list = Arrays.asList(3,3,3,3,6,7);
        afficher(list,k-> System.out.print(k+" "));
        System.out.println();

        System.out.println("*************************Q3*********************************");

        afficher(list,k-> System.out.print(k*2+" "));


    }


    public static void afficher(List<Integer> liste , Consumer<Integer> consumer){
        liste.forEach(consumer);
        //list.foreach(k->consumer.accept(K)
    }

}
