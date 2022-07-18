package BinarySearch;

// 278. First Bad Version
// https://leetcode.com/problems/first-bad-version/
// Related Topics - Binary Search, Interactive

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start=1,end=n;
        int mid=start+(end-start)/2;
        // following lines are commented as the isBadVersion function/API is note available here and is there on leetcode only
        // while(start<end){
        //     if(isBadVersion(mid)){
        //         end=mid;
        //         mid=start+(end-start)/2;
        //     }else{
        //         start=mid+1;
        //         mid=start+(end-start)/2;
        //     }
        // }
        
        return end;
    }
}
