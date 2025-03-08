package StringQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharCountInString {
    public static void main(String[] args) {
        String str ="java coding question practice";

        Map<Character,Integer> charMap = new HashMap<>();

        for(char a: str.toCharArray()){
            if(!charMap.containsKey(a)){
                charMap.put(a,1);
            }else{
                charMap.put(a,charMap.get(a)+1);
            }
        }
        Set<Map.Entry<Character,Integer>> mapSet = charMap.entrySet();

        for(Map.Entry<Character,Integer> entry: mapSet){
            if(entry.getValue()>1){
                System.out.println( entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
