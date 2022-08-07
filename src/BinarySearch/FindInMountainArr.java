package BinarySearch;

// 1095. Find in Mountain Array - Hard
// https://leetcode.com/problems/find-in-mountain-array/
// Related Topics - Array, Binary Search, Interactive

public class FindInMountainArr {
    public int findPeak(MountainArray mountainArr){
        int start=0,end=mountainArr.length()-1;
        int mid=start+(end-start)/2;
        while(start<end){            
            if(mountainArr.get(mid+1)>mountainArr.get(mid)){
                start=mid+1;
                mid=start+(end-start)/2;
            }else if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
                mid=start+(end-start)/2;
            }
        }
        return start;
    }
    public int searchF(MountainArray mountainArr,int target,int start,int end){
        int mid=start+(end-start)/2;        
        while(start<=end){
            if(mountainArr.get(mid)==target){
                return mid;
            }else if(mountainArr.get(mid)>target){
                end=mid-1;
                mid=start+(end-start)/2;                
            }else{
                start=mid+1;
                mid=start+(end-start)/2;
            }
        }
        return -1;
    }
    public int searchB(MountainArray mountainArr,int target,int start,int end){
        int mid=start+(end-start)/2;        
        while(start<=end){
            if(mountainArr.get(mid)==target){
                return mid;
            }else if(mountainArr.get(mid)<target){
                end=mid-1;
                mid=start+(end-start)/2;                
            }else{
                start=mid+1;
                mid=start+(end-start)/2;
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {        
        int peak=findPeak(mountainArr);
        if(target>mountainArr.get(peak)){return -1;}
        else if(target==mountainArr.get(peak)){return peak;}
        int h1=searchF(mountainArr,target,0,peak);
        int h2=searchB(mountainArr,target,peak,mountainArr.length()-1);
        
        if(h1>=0 && h2==-1){
            return h1;
        }else if(h1==-1 && h2>=0){
            return h2;
        }else if(h1>=0 && h2>=0){
            return Math.min(h1,h2);
        }
        
        return -1;
    }
}


// This is dummy class made for removing errors n warnings
class MountainArray{
    int length(){
        return 0;
    }
    int get(int idx){
        return 0;
    }
}