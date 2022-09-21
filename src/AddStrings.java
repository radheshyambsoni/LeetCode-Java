public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder ans=new StringBuilder("");
        int i=num1.length()-1,j=num2.length()-1;
        int carry=0;
        while(i>=0 && j>=0){
            int temp=num1.charAt(i--)+num2.charAt(j--)-96+carry;
            if(temp>=10){
                temp%=10;
                carry=1;
            }else{carry=0;}
            ans.append(temp);
        }
        while(i>=0){
            int temp=num1.charAt(i--)-48+carry;
            if(temp>=10){
                temp%=10;
                carry=1;
            }else{carry=0;}
            ans.append(temp);
        }
        while(j>=0){
            int temp=num2.charAt(j--)-48+carry;
            if(temp>=10){
                temp%=10;
                carry=1;
            }else{carry=0;}
            ans.append(temp);
        }
        if(carry>0 && carry<10){
            ans.append(carry);
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(addStrings("21354", "12346"));
    }
}