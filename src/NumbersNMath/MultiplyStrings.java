package NumbersNMath;

public class MultiplyStrings{
    StringBuilder ans=new StringBuilder("0");
    public String multiply(String num1,String num2){
        char[] n1=num1.toCharArray();
        char[] n2=num2.toCharArray();
        if(n1.length>n2.length){
            helper(n1,n2);
        }else{
            helper(n2,n1);
        }
        return ans.toString();
    }
    public void helper(char[] n1,char[] n2){
        StringBuilder temp=new StringBuilder("");
        int l1=n1.length,l2=n2.length;
        for(int i=0;i<l2;i++){
            int digit=n2[l2-i-1]-'0';
            if(digit==0){continue;}
            int carry=0;
            for(int j=0;j<l1;j++){
                int digit2=n1[l1-j-1]-'0';
                int val=digit*digit2+carry;
                carry=val/10;
                val%=10;
                temp.insert(0, val);
            }
            if(carry!=0){
                temp.insert(0,carry);
            }
            sum(temp,i);
            temp.setLength(0);
        }
    }
    public void sum(StringBuilder t,int n){
        for(int i=0;i<n;i++){
            t.append('0');
        }
        char[] n1=t.toString().toCharArray();
        char[] n2=ans.toString().toCharArray();
        int i=n1.length-1,j=n2.length-1;
        ans.setLength(0);
        int carry=0;
        while(i>=0 && j>=0){
            int val=n1[i--]+n2[j--]+carry-(2*'0');
            carry=val/10;
            val%=10;
            ans.insert(0,val);
        }
        while(i>=0){
            int val=n1[i--]+carry-'0';
            carry=val/10;
            val%=10;
            ans.insert(0,val);
        }
        while(j>=0){
            int val=n2[j--]+carry-'0';
            carry=val/10;
            val%=10;
            ans.insert(0,val);
        }
        if(carry!=0){
            ans.insert(0,carry);
        }
    }
}