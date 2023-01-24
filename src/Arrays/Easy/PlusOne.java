package Arrays.Easy;

// 66. Plus One
// https://leetcode.com/problems/plus-one/

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }
        
        boolean all9=true;
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=9){all9=false;break;}
        }
        
        if(all9){
            int newDigits[]=new int[digits.length+1];
            newDigits[0]=1;
            for(int i=1;i<newDigits.length;i++){newDigits[i]=0;}
            
            return newDigits;
        }
        
        int i=digits.length-1;
        while(digits[i]==9){
            digits[i--]=0;
        }digits[i]++;
        
        return digits;
    }
}
