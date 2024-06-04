package main.java.com.panish.interview;

import java.util.ArrayList;
import java.util.List;

public class JavaPassByValue {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        process(list);
        System.out.println(list);
    }

    public static void process(List list) {
        list.add("second");
    }
}
