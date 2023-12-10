package Math.Medium;

import java.util.ArrayList;
import java.util.List;

// 1352. Product of the Last K Numbers
// https://leetcode.com/problems/product-of-the-last-k-numbers/
// Runtime 14 ms Beats 83.50%
// Memory 67.17 MB Beats 52.48%
// Dec 10, 2023

class ProductOfNumbers {
    int prod;
    List<Integer> l;

    public ProductOfNumbers() {
        l = new ArrayList<>();
        prod = 1;
    }

    public void add(int num) {
        if (num == 0) {
            l.clear();
            prod = 0;
            return;
        }

        if (prod == 0) {
            prod = num;
            l.add(prod);
            return;
        }

        prod *= num;
        l.add(prod);
    }

    public int getProduct(int k) {
        if (prod == 0 || l.size() < k) {
            return 0;
        }

        int idx = l.size() - k - 1;
        if (idx < 0) {
            return prod;
        }

        return prod / l.get(l.size() - k - 1);
    }
}