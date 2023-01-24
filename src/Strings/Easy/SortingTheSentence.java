package Strings.Easy;

// https://leetcode.com/problems/sorting-the-sentence/

public class SortingTheSentence {
    public static String sortSentence(String s) {
        // Runtime 1 ms Beats 94.74% 
        // Memory 41.6 MB Beats 76.30%
        String[] temp=s.split(" ");
        String[] words=new String[temp.length];
        for(int i=0;i<temp.length;i++){
            int idx=temp[i].charAt(temp[i].length()-1)-'1';
            words[idx]=temp[i].substring(0,temp[i].length()-1);
        }
        return String.join(" ",words);

        // Runtime 1 ms Beats 94.74%
        // Memory 41.7 MB Beats 72.5%
        // String[] words=new String[9]; // 9 - because max num of words will be 9
        // int i=0,j=1,count=0;
        // while(j<s.length()){
        //     if(s.charAt(j)>'0' && s.charAt(j)<='9'){
        //         int idx=s.charAt(j)-'1';
        //         words[idx]=s.substring(i, j);
        //         count++;
        //         i=(j+=3)-1;
        //     }else{
        //         j++;
        //     }
        // }        

        // StringBuilder sentence=new StringBuilder();
        // for(i=0;i<count-1;i++){
        //     sentence.append(words[i]);
        //     sentence.append(" ");
        // }sentence.append(words[i]);        
        
        // return sentence.toString();
    }
}