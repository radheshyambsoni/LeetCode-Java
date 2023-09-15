package Stacks.Medium;

import java.util.Stack;

// 735. Asteroid Collision
// https://leetcode.com/problems/asteroid-collision/
// Runtime 7 ms Beats 66.98%
// Memory 43.8 MB Beats 88.71%
// Sep 15, 2023

public class AsteroidCollision_735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        st.push(asteroids[0]);
        for (int i = 1; i < asteroids.length; i++) {
            if (st.isEmpty()) {
                st.push(asteroids[i]);
                continue;
            }

            int top = st.peek();
            if (top > 0) {
                // value > 0 => direction = right
                if (asteroids[i] > 0) {
                    st.push(asteroids[i]);
                } else {
                    if (top + asteroids[i] == 0) {
                        st.pop();
                        continue;
                    }

                    boolean noNeed = false;
                    if (Math.abs(asteroids[i]) > top) {
                        while (!st.isEmpty() && st.peek() > 0) {
                            if (Math.abs(asteroids[i]) > st.peek())
                                st.pop();
                            else if (Math.abs(asteroids[i]) == st.peek()) {
                                st.pop();
                                noNeed = true;
                                break;
                            } else {
                                break;
                            }
                        }

                        if (!noNeed && (st.isEmpty() || st.peek() < 0))
                            st.push(asteroids[i]);

                    }
                }
            } else {
                st.push(asteroids[i]);
            }
        }

        int[] ans = new int[st.size()];
        int idx = 0;
        for (int e : st) {
            ans[idx++] = e;
        }

        return ans;
    }
}