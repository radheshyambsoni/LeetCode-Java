package Arrays;

import java.util.List;

// 1773. Count Items Matching a Rule
// https://leetcode.com/problems/count-items-matching-a-rule/
// Related Topics - Array, Strings

public class CountItemsMatchingRule{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int k=2;
        if(ruleKey.equals("type")){k=0;}
        else if(ruleKey.equals("color")){k=1;}
        for(List<String> i:items){
            if(ruleValue.equals(i.get(k))){
                count++;
            }
        }
        return count;
    }
}