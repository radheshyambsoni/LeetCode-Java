package Strings.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 49. Group Anagrams
// https://leetcode.com/problems/group-anagrams/
// Runtime 6 ms Beats 97.48%
// Memory 45.5 MB Beats 81.5%
// Apr 19, 2023

public class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] chrs=s.toCharArray();
            Arrays.sort(chrs);
            String temp=String.valueOf(chrs);
            if(map.containsKey(temp)){
                map.get(temp).add(s);
            }else{
                List<String> t=new ArrayList<>();
                t.add(s);
                map.put(temp,t);
            }
        }
        return new ArrayList<>(map.values());
    }
}