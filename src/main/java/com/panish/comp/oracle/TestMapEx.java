package oracle;

import java.util.*;
import java.util.stream.Collectors;

public class TestMapEx {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");

        System.out.println("----- Approach 1 -----");
        Iterator iterator = map.entrySet().iterator();
        for (Integer i: map.keySet()  ) {
            System.out.println(map.get(i));
        }

        System.out.println("----- Approach 2 -----");
        for (Map.Entry<Integer, String> set: map.entrySet()) {
            System.out.println(set.getKey()+": "+set.getValue());
        }

        System.out.println("----- Approach 3 -----");
        map.forEach((key,value) -> System.out.println(key+": "+value));

        System.out.println("----- Approach 4 -----");
        map.entrySet().stream().forEach( set -> System.out.println(set.getKey()+": "+set.getValue()));

        List<String> list = Arrays.asList("bb", "dd", "aa");
        List<String> list1 = list.stream().sorted().collect(Collectors.toList());
        //System.out.println(list1);
    }
}
