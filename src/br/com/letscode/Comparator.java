package br.com.letscode;

public class Comparator implements java.util.Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() > s2.length()){
            return -1;
        } else {
            return 1;
        }
    }
}