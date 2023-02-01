package Strings.Easy;

import java.util.HashMap;

// 2325. Decode the Message
// https://leetcode.com/problems/decode-the-message/
// Runtime 3 ms Beats 98.43%
// Memory 42.3 MB Beats 91.26%

public class DecodeTheMessage{
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm=new HashMap<>();
        char c='a';
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch!=' ' && !hm.containsKey(ch)){
                hm.put(ch,c++);
            }
        }

        char[] msg=message.toCharArray();
        for(int i=0;i<msg.length;i++){
            if(msg[i]!=' '){
                msg[i]=hm.get(msg[i]);
            }
        }
        return String.valueOf(msg);
    }    
}