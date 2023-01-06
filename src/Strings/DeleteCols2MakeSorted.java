package Strings;

// https://leetcode.com/problems/delete-columns-to-make-sorted/ - Easy
// Runtime 14 ms Beats 54.16%
// Memory 50.4 MB Beats 7.42%
// January 03, 2023 - Daily Challenge

public class DeleteCols2MakeSorted {
    public int minDeletionSize(String[] strs) {
        int count=0;
        if(strs.length==1){return count;}
        int n=strs.length,m=strs[0].length();
        for(int i=0;i<m;i++){
            char prev;
            for(int j=1;j<n;j++){
                prev=strs[j-1].charAt(i);
                char curr=strs[j].charAt(i);
                if(prev>curr){
                    count++;
                    break;
                }
                prev=curr;
            }
        }
        return count;
    }
}