package Strings.Easy;

import java.util.HashMap;

// 205. Isomorphic Strings
// https://leetcode.com/problems/isomorphic-strings/
// Runtime 11 ms Beats 51.13%
// Memory 41.32 MB Beats 55.52%
// Nov 12, 2023

public class IsomorphicStrings_205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1)) {
                if (c2 != map.get(c1)) {
                    return false;
                }
            } else if (!map.containsValue(c2)) {
                map.put(c1, c2);
            } else {
                return false;
            }
        }

        return true;
    }
}