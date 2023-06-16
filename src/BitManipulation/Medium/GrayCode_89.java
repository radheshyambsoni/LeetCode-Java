package BitManipulation.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 89. Gray Code
// https://leetcode.com/problems/gray-code/
// Runtime 13 ms Beats 23.29%
// Memory 48.5 MB Beats 71.44%
// June 16, 2023

public class GrayCode_89 {
    // Explanation
    // It is not very intuitive to come up with a solution for this problem in an interview if you haven't solved this already. But there is a simple formula/ technique to remember to solve this one without much hassle !!
    // If n = 0 => {0}
    // If n = 1 => {0,1} {0 , 0 + pow(2,0)}
    // If n = 2 => {0,1,3,2} {0 , 1 , 1 + pow(2,1) , 0 + pow(2,1)}
    // If n = 3 => {0,1,3,2,6,7,5,4} {0 , 1 , 3 , 2 , 2 + pow(2,2) , 3 + pow(2,2) , 1 + pow(2,2) , 0 + pow(2,2)}
    // Here you can observe a pattern !!
    // At each step where we're supposed to calculate the gray code of i , Reverse the gray code list of i-1 and add the value pow(2,i-1) to all the elements of the reversed list. Append the modified and reversed list to the (i-1) list.
    public List<Integer> grayCode(int n) {
        List<Integer> ans=new ArrayList<>();
        ans.add(0);

        for(int i = 1; i <= n; i++){
            List<Integer> temp=new ArrayList<>(ans);
            Collections.reverse(temp);
            int val=(int)Math.pow(2,i-1);
            for(int v:temp) ans.add(v+val);
        }
        
        return ans;
    }
}

// Backtracking code - gave TLE
// class Solution{
//     public List<Integer> grayCode(int n) {
//         List<Integer> ans = new LinkedList<>();
//         int[] pow = new int[n];
//         pow[0] = 1;
//         for (int i = 1; i < n; i++) {
//             pow[i] = pow[i - 1] * 2;
//         }
//         ans.add(0);
//         helper(ans, pow[n - 1] * 2 - 1, 0, pow);
//         return ans;
//     }

//     boolean helper(List<Integer> l, int n, int prev, int[] pow) {
//         if (n <= 0) {
//             for (int i = 0; i < pow.length; i++) {
//                 boolean set = (prev & pow[i]) != 0;
//                 int num = (set?(prev & (~pow[i])): (prev | pow[i]));
//                 if (num == 0)
//                     return true;
//             }
//             return false;
//         }

//         for (int i = 0; i < pow.length; i++) {
//             boolean set = (prev & pow[i]) != 0 ? true : false;
//             int num = (set?(prev & (~pow[i])): (prev | pow[i]));
//             if (!l.contains(num)) {
//                 l.add(num);
//                 if (helper(l, n - 1, num, pow))
//                     return true;
//                 l.remove(l.size() - 1);
//             }
//         }
//         return false;
//     }
// }