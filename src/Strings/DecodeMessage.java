package Strings;

import java.util.HashMap;

// Runtime 3 ms Beats 98.43%
// Memory 42.3 MB Beats 91.26%

public class DecodeMessage{
    public static String decodeMessage(String key, String message) {
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
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}