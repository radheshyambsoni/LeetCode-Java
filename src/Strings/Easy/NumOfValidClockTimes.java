package Strings.Easy;

// 2437. Number of Valid Clock Times
// https://leetcode.com/problems/number-of-valid-clock-times/
// Runtime 0 ms Beats 100%
// Memory 40 MB Beats 79.4%
// January 25, 2023

public class NumOfValidClockTimes {
    public int countTime(String time){
        int mins=1;
        if(time.charAt(4)=='?'){
            if(time.charAt(3)=='?'){
                mins=60;
            }else{
                mins=10;
            }
        }else{
            if(time.charAt(3)=='?'){
                mins=6;
            }
        }
        int hrs=1;
        if(time.charAt(1)=='?'){
            if(time.charAt(0)=='?'){
                hrs=24;
            }else{
                if(time.charAt(0)!='2'){
                    hrs=10;
                }else{
                    hrs=4;
                }
            }
        }else{
            if(time.charAt(0)=='?'){
                if(time.charAt(1)<'4'){
                    hrs=3;
                }else{
                    hrs=2;
                }
            }
        }
        return mins*hrs;
    }
}