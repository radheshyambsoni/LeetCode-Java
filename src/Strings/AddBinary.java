package Strings;
// 67. Add Binary
// https://leetcode.com/problems/add-binary/
// Related Topics - Math, String, Bit Manipulation, Simulation

public class AddBinary {
    public static String addBinary(String a, String b) {
        if(a.length()<b.length()){
            return addBinary(b,a);
        }
        
        String ans="";
        boolean carry=false;
        
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 && j>=0){
            if(a.charAt(i)=='1'){
                if(b.charAt(j)=='1'){
                    if(carry){
                        ans="1".concat(ans);
                    }else{
                        ans="0".concat(ans);
                        carry=true;
                    }
                }else{
                    if(carry){
                        ans="0".concat(ans);
                    }else{
                        ans="1".concat(ans);
                    }
                }
            }else{
                if(b.charAt(j)=='1'){
                    if(carry){
                        ans="0".concat(ans);
                    }else{
                        ans="1".concat(ans);
                    }
                }else{
                    if(carry){
                        ans="1".concat(ans);
                        carry=false;
                    }else{
                        ans="0".concat(ans);
                    }
                }
            }
            i--;
            j--;
        }

        while(i>=0){
            if(a.charAt(i)=='1'){
                if(carry){
                    ans="0".concat(ans);
                }else{
                    ans="1".concat(ans);
                }
            }else{
                if(carry){
                    ans="1".concat(ans);
                    carry=false;
                }else{
                    ans="0".concat(ans);
                }
            }
            i--;
        }
        if(carry){ans="1".concat(ans);}
        
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(addBinary("111", "111"));
    }
}