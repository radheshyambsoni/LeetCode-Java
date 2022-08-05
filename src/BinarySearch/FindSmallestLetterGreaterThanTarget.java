package BinarySearch;

// 744. Find Smallest Letter Greater Than Target - Easy
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// 

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){            
            if(letters[mid]<=target){
                start=mid+1;
                mid=start+(end-start)/2;
            }else{
                end=mid-1;
                mid=start+(end-start)/2;
            }
        }
        
        if(start>=letters.length){return letters[0];}
        return letters[start];
    }
}
