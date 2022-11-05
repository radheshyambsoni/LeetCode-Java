package Strings;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] ans=new char[indices.length];
        int i=0;
        for(int j:indices){
            ans[j]=s.charAt(i++);
        }        
        return String.valueOf(ans);
    }
    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }
}