package Arrays;
// 832. Flipping an Image
// https://leetcode.com/problems/flipping-an-image/
// Related Topics - Array, Two Pointers, Matrix, Simulation

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int j,k,temp;
        for(int i=0;i<image.length;i++){
            j=0;
            k=image.length-1;
            while(j<=k){
                temp=image[i][j];
                image[i][j]=1-image[i][k];
                image[i][k]=1-temp;
                j++;
                k--;
            }
        }
        
        return image;
    }
}
