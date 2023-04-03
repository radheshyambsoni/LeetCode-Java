package Strings.Medium;

import java.util.HashMap;

// 2284. Sender With Largest Word Count
// https://leetcode.com/problems/sender-with-largest-word-count/
// Runtime 56 ms Beats 72.66%
// Memory 50.2 MB Beats 55.8%
// Apr 03, 2023

public class SenderWithLargestWordCount_2284 {
    public String largestWordCount(String[] messages, String[] senders) {
        if(senders.length==1) return senders[0];

        HashMap<String, Integer> m=new HashMap<>();
        String ans="";
        int max=0;
        for(int i=0;i<senders.length;i++){
            int numOfWords=messages[i].split(" ").length;
            if(m.containsKey(senders[i])){
                int newNumOfWords=m.get(senders[i])+numOfWords;
                if(newNumOfWords>max){
                    ans=senders[i];
                    max=newNumOfWords;
                }else if(newNumOfWords==max && senders[i].compareTo(ans)>0){
                    ans=senders[i];
                }
                m.put(senders[i],newNumOfWords);
            }else{
                if(numOfWords>max){
                    ans=senders[i];
                    max=numOfWords;
                }else if(numOfWords==max && senders[i].compareTo(ans)>0){
                    ans=senders[i];
                }
                m.put(senders[i],numOfWords);
            }
        }
        return ans;
    }
}
