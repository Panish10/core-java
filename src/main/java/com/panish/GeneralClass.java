package com.panish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneralClass {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        //List list = generate(5);
        list.add(0, 2);
        list.add(1, 8);
        System.out.println(list);
    }

    public static List<List<Integer>> generate(int numRows) {
        int index = 0;
        List<List<Integer>> outer = new ArrayList<>(numRows);

        while (index < numRows) {
            List<Integer> inner = new ArrayList<>(index+1);
            if (index == 0) {
                inner.add(1);
            } else if (index == 1) {
                inner.add(1);
                inner.add(1);
            } else {
                int first = 1;
                int last = index - 1;
                inner.add(0, 1);
                inner.add(last+1, 1);
                while (first < last) {
                    inner.add(first, inner.get(first) + inner.get(first-1));
                    inner.add(last, inner.get(last) + inner.get(last+1));
                    first++;
                    last--;
                }
            }
            outer.add(inner);
            index++;
        }

        return outer;
    }
}
