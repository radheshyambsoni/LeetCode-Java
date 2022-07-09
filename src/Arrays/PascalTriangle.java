package Arrays;

import java.util.ArrayList;
import java.util.List;

// 118. Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/
// Related Topics - Arrays, DP

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(j!=0 && j!=i){
                    ans.get(i).add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }else{
                    ans.get(i).add(1);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
