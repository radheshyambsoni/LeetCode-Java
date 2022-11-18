package Arrays.Matrix;

// 832. Flipping an Image
// https://leetcode.com/problems/flipping-an-image/
// Related Topics - Array, Two Pointers, Matrix, Simulation

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) { 
        int j,k,temp;
        for(int i[]:image){
            j=0;
            k=image.length-1;
            while(j<=k){
                // temp=i[j]^1;
                // i[j]=i[k]^1;
                // i[k]=temp;
                temp=i[j];
                i[j]=1-i[k];
                i[k]=1-temp;
                j++;
                k--;
            }
        }        
        return image;
    }
}
