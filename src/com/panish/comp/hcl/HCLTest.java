package hcl;

import java.util.HashMap;
import java.util.Map;

public class HCLTest {

    public static void main(String[] args) {
        String input = "my name is panish my name is panish";

        String[] inputArry = input.split(" ");
        Map<String, Integer> countMap = new HashMap<>();

        for(int i = 0; i < inputArry.length; i++) {
            String text = inputArry[i];
            if(countMap.containsKey(text)) {
                countMap.put(text, countMap.get(text)+1);
            } else {
                countMap.put(text, 1);
            }
        }

        System.out.println(countMap);
    }
}
