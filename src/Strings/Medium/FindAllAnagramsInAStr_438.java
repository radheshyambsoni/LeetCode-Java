package Strings.Medium;

// 438. Find All Anagrams in a String
// https://leetcode.com/problems/find-all-anagrams-in-a-string/
// Runtime 10 ms Beats 50.85%
// Memory 43.9 MB Beats 10.97%
// Mar 30, 2023

public class FindAllAnagramsInAStr_438 {
    static boolean compare(int[] f1,int[] f2){
        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i]) return false;
        }
        return true;
    }
    
    public static List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()) return new ArrayList<>();
        int[] freq=new int[26];
        int n=p.length();
        for(int i=0;i<n;i++){
            freq[p.charAt(i)-'a']++;
        }

        int j=0;
        int[] freq2=new int[26];
        for(;j<n;j++){
            freq2[s.charAt(j)-'a']++;
        }
        List<Integer> ans=new ArrayList<>();
        boolean check=false;
        if(compare(freq, freq2)){
            ans.add(0);
            check=true;
        }
        int i=0;
        for(;j<s.length();j++){
            freq2[s.charAt(j)-'a']++;
            freq2[s.charAt(i)-'a']--;
            if(check){
                if(s.charAt(i)==s.charAt(j)){
                    ans.add(i+1);
                }else{
                    check=false;
                }
            }else{
                if(compare(freq, freq2)){
                    check=true;
                    ans.add(i+1);
                }
            }
            i++;
        }
        return ans;
    }
}
