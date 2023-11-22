package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for (int i = 0; i < strs.length; i++) {
            char[] asArray = strs[i].toCharArray();
            Arrays.sort(asArray);
            String key = new String(asArray);
            if (map.containsKey(key)) {
                map.get(key).add(strs[i]);
            } else {
                ArrayList<String> value = new ArrayList<String>();
                value.add(strs[i]);
                map.put(key, value);
            }
        }
        return new ArrayList<>(map.values());
    }
}
