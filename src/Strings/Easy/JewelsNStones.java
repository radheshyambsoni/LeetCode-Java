package Strings.Easy;

// https://leetcode.com/problems/jewels-and-stones/

public class JewelsNStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int ans=0;

        // Runtime 1 ms Beats 97.46%
        // Memory 42.5 MB Beats 43.8%
        // boolean[] alphs=new boolean[58];
        // for(char c:jewels.toCharArray()){
        //     alphs[c-'A']=true;
        // }
        // for(char c:stones.toCharArray()){
        //     if(alphs[c-'A']){ans++;}
        // }
        
        // Runtime 0 ms Beats 100%
        // Memory 40.8 MB Beats 86.74%
        for(char c:stones.toCharArray()){
            if(jewels.indexOf(c)!=-1){
                ++ans;
            }
        }
        return ans;
    }
}