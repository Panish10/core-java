package panish;

import java.util.*;

public class TestClass {

    public static void main(String[] args) {
        m2();
    }

    public static void m2() {
        //List<Integer> list = Arrays.asList(2,3,4);
        List<Integer> list = new ArrayList<>();
        list.add(2); list.add(3); list.add(4);
        list.remove(2);
        System.out.println(list);
    }

    public static void citiusTech1() {
        //for (int index = 0; 1; index++) {
        // condition should always return boolean value 1 is not boolean it through compilation error
        // correct condition is as below
        for (int index = 0; true; index++) {
            System.out.println("Welcome");
            break;
        }
    }

    public static void hashMapEx1() {
        Map<String, String> map = new HashMap<>();
        map.put("p1" ,"1");
        map.put("p2" ,"2");
        map.put("p3" ,"3");

        map.entrySet().stream().forEach(set -> System.out.println(set.getKey() +" "+set.getValue()));
    }

    public static void m1() {
        int[] ary = {2,3, 10, 6, 8};
        OptionalInt val = Arrays.stream(ary).max();
        System.out.println(val.getAsInt());
    }
}
