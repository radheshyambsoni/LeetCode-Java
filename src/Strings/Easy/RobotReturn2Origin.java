package Strings.Easy;

// https://leetcode.com/problems/robot-return-to-origin/
// Runtime 6 ms Beats 90.44%
// Memory 45.9 MB Beats 5.8%

public class RobotReturn2Origin {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                y++;
            }else if(c=='D'){
                y--;
            }else if(c=='L'){
                x--;
            }else{
                x++;
            }
        }
        return (x|y)==0;
    }
}
