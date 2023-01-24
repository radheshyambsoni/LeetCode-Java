package Arrays.Easy;

import java.util.List;

// https://leetcode.com/problems/count-items-matching-a-rule/submissions/
// Runtime: 3 ms, faster than 99.57% of Java online submissions for Count Items Matching a Rule.
// Memory Usage: 46.9 MB, less than 98.35% of Java online submissions for Count Items Matching a Rule.

public class CountItemsMatchingARule {    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0,idx;
        if(ruleKey.equals("type")){
            idx=0;
        }else if(ruleKey.equals("color")){
            idx=1;           
        }else{idx=2;}        
        
        for(List<String> i:items){            
            if(i.get(idx).equals(ruleValue)){
                count++;
            }
        }        
        return count;
                
        // int count=0;
        // switch(ruleKey){
        //     case "type":
        //     for(List<String> s:items){            
        //         if(s.get(0).equals(ruleValue)){count++;};
        //     }break;
        //     case "color":
        //     for(List<String> s:items){            
        //         if(s.get(1).equals(ruleValue)){count++;};
        //     }break;
        //     case "name":
        //     for(List<String> s:items){            
        //         if(s.get(2).equals(ruleValue)){count++;};
        //     }break;
        // }        
        // return count;
    }
}
