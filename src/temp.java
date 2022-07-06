public class temp {
    public String addBinary(String a, String b) {
        String ans="";
        int small=Math.min(a.length(),b.length()),big=Math.max(a.length(),b.length());
        int i=big-1;
        boolean carry=false;
        while(i>small){
            if(a.charAt(i)=='1'){
                if(b.charAt(i)=='1'){
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
                if(b.charAt(i)=='1'){
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
        }


        return ans;
    }
    public static void main(String[] args) {}
}


// 1 1 1 - 1 1
// 1 1 0 - 0 1
// 1 0 1 - 0 1
// 1 0 0 - 1 0
// 0 1 1 - 0 1
// 0 1 0 - 1 0
// 0 0 1 - 1 0
// 0 0 0 - 0 0