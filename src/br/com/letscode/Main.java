package br.com.letscode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("pineapple");
        fruits.add("grape");


        fruits.sort((s1, s2) -> {
            if (s1.length() > s2.length()){
                return -1;
            } else {
                return 1;
            }
        });

        fruits.forEach(s -> System.out.println(s));

    }
}