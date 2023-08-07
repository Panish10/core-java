package com.panish.Java8;

import java.util.Arrays;
import java.util.List;

public class SimpleDemo {

    public static void main(String[] args) {
        List<Long> list = Arrays.asList(1l,2l,3l,4l);
        long s = list.stream().reduce((act, sum) -> act+sum).get();
        System.out.println(s);
    }
}
