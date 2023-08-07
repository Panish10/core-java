package com.panish.comp.mdocs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {

    public static void main(String[] args) {
        //List<String> list = Arrays.asList("test1" , "test123", "test456");
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("f1", "f2", "f3"),
                Arrays.asList("s1", "s2", "s3"),
                Arrays.asList("t1", "t2", "t3")
        );

        List<String> list2 = listOfList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(list2);
    }
}