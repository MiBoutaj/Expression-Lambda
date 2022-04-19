package com.main;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Exercice3 {


    public static void main(String[] args) {
        System.out.println();
        System.out.println("***********************Q1*********************************");

        List<Integer> list = Arrays.asList(1, 3, 2);

        ajouter4(list, i -> i + 4);
        System.out.println(list);


        System.out.println();
        System.out.println("***********************Q2*********************************");
        List<String> stringList = Arrays.asList("Emsi", "Marrif", "Centre");
        // List<Integer> calculeString= map(stringList,s->s.length()); autrement
        List<Integer> calculeString = map(stringList, String::length);
        System.out.println(stringList);
        System.out.println(calculeString);

        System.out.println();
        System.out.println("***********************Q3*********************************");
        Map<Color, String> colorStringMap = map2(color -> color.name().toLowerCase());
        for (Map.Entry<Color,String> entry : colorStringMap.entrySet() ){
            System.out.println(entry.getKey() + " => "+entry.getValue());
        }


    }

    public static void ajouter4(List<Integer> listInt, Function<Integer, Integer> function) {
        for (int i = 0; i < listInt.size(); i++) {
            listInt.set(i, function.apply(listInt.get(i)));
        }
    }

    //generique
    public static List<Integer> map(List<String> listeString, Function<String, Integer> function) {
        List<Integer> taille = new ArrayList<Integer>();
        listeString.forEach(s -> taille.add(function.apply(s)));
        return taille;

    }

    public static enum Color {
        RED, GREEN;
    }

    public static Map<Color, String> map2(Function<Color, String> function) {

        Map<Color, String> map = new HashMap<Color, String>();
        for (Color color : Color.values()) {
            map.put(color, function.apply(color));
        }
        return map;

    }


}
