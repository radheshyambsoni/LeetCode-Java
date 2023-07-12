package Arrays.Medium;

// 73. Set Matrix Zeroes
// https://leetcode.com/problems/set-matrix-zeroes/
// Runtime 0 ms Beats 100%
// Memory 44.9 MB Beats 29.93%
// Jul 12, 2023

// TC - O(2*n*m)
// SC - O(1)
public class SetMatrix0s_73 {
    public void setZeroes(int[][] matrix) {
        boolean col0=false;
        int n=matrix.length, m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0) matrix[0][j]=0;
                    else col0=true;
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if(matrix[0][0]==0){
            for(int i=0;i<m;i++){
                matrix[0][i]=0;
            }
        }

        if(col0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }
}

// // TC - O(2*n*m)
// // SC - O(m+n)
// // Runtime 1 ms Beats 95.67%
// // Memory 44 MB Beats 81.43%
// // December 19, 2022

// public class SetMatrix0s_73 {
//     public void setZeroes(int[][] matrix) {
//         // Using the 0th row and 0th column keep track of the rows and column to be reset
//         boolean firstRow=false,firstCol=false;
        
//         for(int i=0;i<matrix.length;i++){
//             if(matrix[i][0]==0){
//                 firstCol=true;
//                 break;
//             }
//         }
//         for(int i=0;i<matrix[0].length;i++){
//             if(matrix[0][i]==0){
//                 firstRow=true;
//                 break;
//             }
//         }

//         for(int i=1;i<matrix.length;i++){
//             for(int j=1;j<matrix[0].length;j++){
//                 if(matrix[i][j]==0){
//                     matrix[i][0]=0;
//                     matrix[0][j]=0;
//                 }
//             }
//         }

//         for(int i=1;i<matrix.length;i++){
//             for(int j=1;j<matrix[0].length;j++){
//                 if(matrix[i][0]==0 || matrix[0][j]==0){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
//         if(firstRow){
//             for(int i=0;i<matrix[0].length;i++){
//                 matrix[0][i]=0;
//             }            
//         }
//         if(firstCol){
//             for(int i=0;i<matrix.length;i++){
//                 matrix[i][0]=0;
//             }
//         }

//         // Not the best takes additional space to keep track of the rows and column to be reset
//         // boolean[] zeroRows=new boolean[matrix.length];
//         // boolean[] zeroCols=new boolean[matrix[0].length];
//         // for(int i=0;i<matrix.length;i++){
//         //     for(int j=0;j<matrix[0].length;j++){
//         //         if(matrix[i][j]==0){
//         //             zeroRows[i]=true;
//         //             zeroCols[j]=true;
//         //         }
//         //     }
//         // }

//         // for(int i=0;i<matrix.length;i++){
//         //     for(int j=0;j<matrix[0].length;j++){
//         //         if(zeroRows[i] || zeroCols[j]){
//         //             matrix[i][j]=0;
//         //         }
//         //     }
//         // }
//     }
// }