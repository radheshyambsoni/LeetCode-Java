package NumbersNMath.Easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/self-dividing-numbers/
// Runtime 2 ms Beats 99.93%
// Memory 39.9 MB Beats 94.18%
// December 08, 2022

public class SelfDividingNum {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            boolean flag=true;
            while(num>0){
                int digit=num%10;
                if(digit==0){
                    flag=false;
                    break;
                }else if(i%digit!=0){
                    flag=false;
                    break;
                }
                num/=10;
            }
            if(flag){
                ans.add(i);
            }
        }
        return ans;
    }
}