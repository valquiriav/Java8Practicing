package br.com.letscode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("peach");
        fruits.add("grape");

        MyConsumer consumer = new MyConsumer();
        fruits.forEach(consumer);

    }
}