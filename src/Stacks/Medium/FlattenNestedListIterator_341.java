package Stacks.Medium;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

// 341. Flatten Nested List Iterator
// https://leetcode.com/problems/ flatten-nested-list-iterator/
// Runtime 4 ms Beats 30.87%
// Memory 44 MB Beats 92.92%
// Oct 20, 2023

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 * // @return true if this NestedInteger holds a single integer, rather than a
 * nested list.
 * public boolean isInteger();
 *
 * // @return the single integer that this NestedInteger holds, if it holds a
 * single integer
 * // Return null if this NestedInteger holds a nested list
 * public Integer getInteger();
 *
 * // @return the nested list that this NestedInteger holds, if it holds a
 * nested list
 * // Return empty list if this NestedInteger holds a single integer
 * public List<NestedInteger> getList();
 * }
 */
interface NestedInteger { // DUMMY interface
    public boolean isInteger();

    public Integer getInteger();

    public List<NestedInteger> getList();
}

class NestedIterator implements Iterator<Integer> {
    Stack<NestedInteger> st = new Stack<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        buildList(nestedList);
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            return null;
        }

        return st.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!st.isEmpty() && !st.peek().isInteger()) {
            buildList(st.pop().getList());
        }
        return !st.isEmpty();
    }

    void buildList(List<NestedInteger> l) {
        for (int i = l.size() - 1; i >= 0; i--) {
            st.push(l.get(i));
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */