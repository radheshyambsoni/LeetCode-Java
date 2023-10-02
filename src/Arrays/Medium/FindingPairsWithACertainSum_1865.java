package Arrays.Medium;

import java.util.HashMap;

// 1865. Finding Pairs With a Certain Sum
// https://leetcode.com/problems/finding-pairs-with-a-certain-sum/
// Runtime 164 ms Beats 12.50%
// Memory 80.2 MB Beats 28.29%

public class FindingPairsWithACertainSum_1865 {
    int[] nums1, nums2;
    HashMap<Integer, Integer> m1;
    HashMap<Integer, Integer> m2;

    // changing constructor name for the sake of removing error and to fit the name
    // in my convention
    // original class name - FindSumPairs
    public FindingPairsWithACertainSum_1865(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        m1 = new HashMap<>();
        for (int i : nums1) {
            m1.put(i, m1.getOrDefault(i, 0) + 1);
        }
        m2 = new HashMap<>();
        for (int i : nums2) {
            m2.put(i, m2.getOrDefault(i, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int v = nums2[index];
        int cnt = m2.get(v);
        if (cnt == 1)
            m2.remove(v);
        else
            m2.put(v, m2.getOrDefault(v, 0) - 1);

        nums2[index] += val;
        m2.put(nums2[index], m2.getOrDefault(nums2[index], 0) + 1);
    }

    public int count(int tot) {
        int cnt = 0;
        for (int i : m1.keySet()) {
            if (m2.containsKey(tot - i)) {
                cnt += m1.get(i) * m2.get(tot - i);
            }
        }

        return cnt;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */