public class May22_LongestCommPref {
    public static String longestCommonPrefix(String[] strs) {
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()==0){return "";}
            minLength=Math.min(minLength, strs[i].length());
        }
        String common="";

        for(int j=0;j<minLength;j++){
            int i=0;
            char ch=strs[0].charAt(j);
            for(;i<strs.length;i++){
                if(strs[i].charAt(j)!=ch){
                    return common;
                }
            }
            common+=ch;
        }

        return common;
    }
    public static void main(String[] args) {
        String strs[]={"flower","flow","float"};
        System.out.println(longestCommonPrefix(strs));
    }
}