package BinarySearch.Easy;

// 374. Guess Number Higher or Lower
// https://leetcode.com/problems/guess-number-higher-or-lower/
// Related Topics - Binary Search, Interactive

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {        
        int start=1,end=n;
        int mid=start+(end-start)/2;
        // following lines are commented as the guess function/API is note available here and is there on leetcode only
        // while(true){
        //     if(guess(mid)==0){
        //         break;
        //     }else if(guess(mid)==1){
        //         start=mid+1;
        //         mid=start+(end-start)/2;
        //     }else{
        //         end=mid-1;
        //         mid=start+(end-start)/2;
        //     }
        // }
        
        return mid;
    }
}
