package Strings.Medium;

// 165. Compare Version Numbers
// https://leetcode.com/problems/compare-version-numbers/
// Runtime 1 ms Beats 84.95%
// Memory 40.7 MB Beats 43.41%
// May 06, 2023

public class CompareVersionNums_165 {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        int i=0,j=0;
        while(i<v1.length && j<v2.length){
            int v1i=Integer.parseInt(v1[i++]);
            int v2i=Integer.parseInt(v2[j++]);
            if(v1i<v2i) return -1;
            else if(v1i>v2i) return 1;
        }
        if(i<v1.length){
            int v1i=Integer.parseInt(v1[i++]);
            if(v1i==0){
                while(i<v1.length && v1i==0){
                    v1i=Integer.parseInt(v1[i++]);
                }
                if(v1i!=0) return 1;
                else return 0;
            }
            return 1;
        }
        if(j<v2.length){
            int v2i=Integer.parseInt(v2[j++]);
            if(v2i==0){
                while(j<v2.length && v2i==0){
                    v2i=Integer.parseInt(v2[j++]);
                }
                if(v2i!=0) return -1;
                else return 0;
            }
            return -1;
        }
        return 0;
    }
}