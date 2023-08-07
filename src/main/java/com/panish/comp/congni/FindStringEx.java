package com.panish.comp.congni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindStringEx {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("act","bat","tac","cta","gta","caat");

        System.out.println(check("cat", list));
    }

    private static List<String> check(String s1, List<String> list){

        boolean found = false;
        List<String> foundList  = new ArrayList<>();
        for(String item : list) {

            found = false;
            if(s1.length() == item.length()) {

                for(int i=0; i<item.length(); i++) {

                    for(int j=0; j<s1.length(); j++) {
                        if(s1.charAt(i) == item.charAt(j)) {
                            found = true;
                            break;
                        }
                    }
                }

                if(found)
                    foundList.add(item);
            }
        }
        return foundList;
    }
}

