package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// Find first longest substring without repeating the characters
public class P9_LongestSubstr {
    public static void longestSubStr(String s) {
        String longestSubstr=null;
        int longestSubStrLength=0;

        Map<Character, Integer> map= new HashMap<>();
        char[]chars = s.toCharArray();

        for (int i=0; i< chars.length; i++){
            if (!map.containsKey(chars[i])){
                map.put(chars[i], i); //here value i represents index
            }
            else {
                i=map.get(chars[i]);
                map.clear();
            }

            if (map.size() > longestSubStrLength){
                longestSubStrLength = map.size();
                String str="";
                longestSubstr=map.keySet().stream().map(ch-> str+ch).collect(Collectors.joining());
            }
        }
        System.out.println("Longest Sustring is " + longestSubstr + " with length " + longestSubStrLength);
    }

    public static void main(String[] args) {
        longestSubStr("pwwkew");
    }
}

