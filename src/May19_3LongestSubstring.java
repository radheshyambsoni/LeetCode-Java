import java.util.Arrays;

public class May19_3LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        int arr[]=new int[255];
        Arrays.fill(arr, 0);
        int i=0,j=0;
        while(i<s.length()&&j<s.length()){
            if(j==s.length()-1){
                if(arr[s.charAt(j)]>=1){
                    maxLength=Math.max(maxLength,j-i);
                    break;
                }else{
                    maxLength=Math.max(maxLength,j-i+1);
                    break;
                }
            }
            
            if(arr[s.charAt(j)]==0){
                arr[s.charAt(j)]=1;
                j++;
            }else{
                maxLength=Math.max(maxLength,j-i);
                j=++i;
                Arrays.fill(arr, 0);
            }
        }
        
        return maxLength;
    }
    public static void main(String[] args) {
        // 3. Longest Substring Without Repeating Characters
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
