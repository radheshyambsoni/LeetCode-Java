package Arrays;

import java.util.ArrayList;
import java.util.List;

// 1431. Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// Related Topics - Array

public class KidsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i:candies){
            if(max<i){max=i;}
        }
        
        List<Boolean> ans=new ArrayList<>();
        for(int i:candies){
            ans.add(i+extraCandies>=max);
        }
        
        return ans;
    }
}
