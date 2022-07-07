import java.util.List;

public class temp {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        long number=0;
        for(int i=0;i<num.length;i++){
            number=number*10+num[i];
        }
        number+=k;
        System.out.println(number);
        System.out.println(number%10);
        int ans[]=new int[(int)Math.log(number)+1];
        for(int i=ans.length;i>=0;i--){
            // 
        }


    }
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9}, 1));
    }
}