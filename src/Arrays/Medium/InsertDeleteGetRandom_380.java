package Arrays.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

// 380. Insert Delete GetRandom O(1)
// https://leetcode.com/problems/insert-delete-getrandom-o1/
// Runtime 24 ms Beats 74.04%
// Memory 93.84 MB Beats 12.00%
// Jan 16, 2024

class RandomizedSet {
    private List<Integer> l;
    private Map<Integer, Integer> map;
    private Random rand;

    public RandomizedSet() {
        l = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        map.put(val, l.size());
        l.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int idx = map.get(val);
        if (idx < l.size() - 1) {
            int last = l.get(l.size() - 1);
            l.set(idx, last);
            map.put(last, idx);
        }
        map.remove(val);
        l.remove(l.size() - 1);

        return true;
    }

    public int getRandom() {
        return l.get(rand.nextInt(l.size()));
    }
}