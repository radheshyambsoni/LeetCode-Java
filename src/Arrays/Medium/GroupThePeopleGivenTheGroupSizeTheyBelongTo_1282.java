package Arrays.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 1282. Group the People Given the Group Size They Belong To
// https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
// Runtime 5 ms Beats 93.77%
// Memory 44.3 MB Beats 70.67%
// Sep 11, 2023

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo_1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (!map.containsKey(groupSizes[i])) {
                int gs = groupSizes[i];
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(gs, temp);

                if (temp.size() == gs) {
                    ans.add(temp);
                    map.put(gs, new ArrayList<>());
                }
            } else {
                List<Integer> help = map.get(groupSizes[i]);
                help.add(i);

                int gs = groupSizes[i];
                if (help.size() == gs) {
                    ans.add(help);
                    map.put(gs, new ArrayList<>());
                }
            }
        }

        return ans;
    }
}