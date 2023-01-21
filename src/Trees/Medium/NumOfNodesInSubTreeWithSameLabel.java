package Trees.Medium;

import java.util.ArrayList;

// https://leetcode.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/ - Medium
// Runtime 57 ms Beats 100%
// Memory 115.1 MB Beats 95.65%
// January 12, 2023 - Daily Challenge

public class NumOfNodesInSubTreeWithSameLabel {    
    ArrayList<Integer>[] adjL; //adjacency list
    char[] l;
    int[] ans;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        adjL=new ArrayList[n];
        for(int i=0;i<n;i++){
            adjL[i]=new ArrayList<>();
        }
        
        l=labels.toCharArray();
        ans=new int[n]; //answer

        for(int[] i:edges){
            adjL[i[0]].add(i[1]);
            adjL[i[1]].add(i[0]);
        }
        
        dfs(-1,0);
        
        return ans;
    }
    int[] dfs(int prev,int curr){
        int[] c=new int[26];
        for(int i:adjL[curr]){
            if(prev!=i){
                int[] temp=dfs(curr,i);
                for(int j=0;j<c.length;j++){
                    c[j]+=temp[j];
                }
            }
        }
        ans[curr]=++c[l[curr]-'a'];
        return c;
    }
}