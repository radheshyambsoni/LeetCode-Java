package Strings.Easy;

// 2047. Number of Valid Words in a Sentence
// https://leetcode.com/problems/number-of-valid-words-in-a-sentence/

public class NumOfValidWordsInASentence {
    public int countValidWords(String sentence) {
        String[] words=sentence.split("\s+");
        String regex="^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$",re="[^0-9]+";
        int count=0;
        for (String i:words) {
            if(i.matches(regex) && i.matches(re)){
                count++;
            }
        }
        return count;
    }
}