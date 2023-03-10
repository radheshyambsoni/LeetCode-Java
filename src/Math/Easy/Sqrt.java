package Math.Easy;

// https://leetcode.com/problems/sqrtx/
// December 05, 2022

public class Sqrt{
	public int mySqrt(int x) {
		// return (int)Math.sqrt(x);

		// Runtime 1 ms Beats 100%
		// Memory 39.4 MB Beats 92.58%
		// Binary Search
		if(x==0 || x==1){
            return x;
        }
        int start=1,end=x/2;
        while(start<=end){
            long mid=start+(end-start)/2;            
            if(mid*mid==x){
                return (int)mid;
            }
            if(mid*mid<x){
                start=(int)mid+1;
            }else{
                end=(int)mid-1;
            }
        }
        return end;
	}
}