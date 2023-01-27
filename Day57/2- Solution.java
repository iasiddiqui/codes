//Given a non null integer matrix Grid of dimensions NxM.Calculate the sum of its elements.

class Solution {
    int sumOfMatrix(int N, int M, int[][] Grid) {
       // code here
       int sum =0;
       for(int row=0; row<N; row++){
           
           for(int col=0; col<M; col++){
               sum += Grid[row][col];
           }
       }
       return sum;
   }
}
