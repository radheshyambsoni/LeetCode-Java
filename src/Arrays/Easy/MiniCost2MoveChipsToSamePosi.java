package Arrays.Easy;

// 1217. Minimum Cost to Move Chips to The Same Position
// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
// Related Topics - Array, Math, Greedy

public class MiniCost2MoveChipsToSamePosi{
    public int minCostToMoveChips(int[] position) {        
        int oddSum=0;
        int evenSum=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){evenSum++;}
            else{oddSum++;}
        }
        if(evenSum>oddSum){
            return oddSum;
        }
        return evenSum;
    }
}