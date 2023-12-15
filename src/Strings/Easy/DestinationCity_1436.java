package Strings.Easy;

import java.util.HashSet;
import java.util.List;

// 1436. Destination City
// https://leetcode.com/problems/destination-city/
// Runtime 1 ms Beats 100.00%
// Memory 42.72 MB Beats 77.75%
// Dec 15, 2023

public class DestinationCity_1436 {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();
        for (List<String> l : paths) {
            set.add(l.get(0));
        }

        for (List<String> l : paths) {
            if (!set.contains(l.get(1))) {
                return l.get(1);
            }
        }

        return null;
    }
}