package Graphs.Medium;

import java.util.List;

// https://leetcode.com/problems/keys-and-rooms/
// Runtime 1 ms Beats 94.27%
// Memory 45.3 MB Beats 13.69%
// December 20, 2022 - Daily Challenge

public class KeysNRooms{
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // DFS
        boolean[] visited=new boolean[rooms.size()];
        dfs(0,visited,rooms);
        for(boolean b:visited){
            if(!b){
                return false;
            }
        }
        return true;
    }
    public void dfs(int index,boolean[] visited,List<List<Integer>> rooms){
        visited[index]=true;
        for(int i:rooms.get(index)){
            if(!visited[i]){
                dfs(i,visited,rooms);
            }
        }
    }
}