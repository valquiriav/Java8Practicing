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

        Comparator comparator = new br.com.letscode.Comparator();
        fruits.sort(comparator);

        MyConsumer consumer = new MyConsumer();
        fruits.forEach(consumer);

    }
}