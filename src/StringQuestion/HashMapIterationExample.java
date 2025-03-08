package StringQuestion;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterationExample {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Apple", 1);
            map.put("Banana", 2);
            map.put("Cherry", 3);
            map.put("Cherry", 4);

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }


