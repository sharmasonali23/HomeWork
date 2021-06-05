import java.util.Arrays;

/*Multiple left rotations of the array
        Given an array of integers A and multiple values in B which represents the indices of the array A around which left rotation of the array A needs to be performed.

        Find the rotated array for each value and return the result in the from of a matrix where i'th row represents the rotated array for the i'th value in B.


        Input Format

        The first argument given is the integer array A.
        The second argument given is the integer array B.
        Output Format

        Return the resultant matrix.
        Constraints

        1 <= length of both arrays <= 2000
        -10^9 <= A[i] <= 10^9
        0 <= B[i] <= 2000
        For Example

        Input 1:
        A = [1, 2, 3, 4, 5]
        B = [2, 3]
        Output 1:
        [ [3, 4, 5, 1, 2]
        [4, 5, 1, 2, 3] ]

        Input 2:
        A = [5, 17, 100, 11]
        B = [1]
        Output 2:
        [ [17, 100, 11, 5] ]*/
public class MultipleLeftRotation {
    public int[][] solve(int[] A, int[] B) {

        for(int i=0;i<A.length/2;i++){
            int temp =A[i];
            A[i]=A[A.length-i-1];
            A[A.length-i-1]=temp;
        }
        int res [][]= new int[B.length][A.length];
        for(int j=0;j<B.length;j++){
            int rotate = B[j];
            rotate = B[j]<A.length?B[j]:(B[j]%A.length);
            rotate = A.length-rotate;
            int b[]=new int[A.length];
            b = A.clone();
            for(int i=0;i<rotate/2;i++){
                int temp =b[i];
                b[i]=b[rotate-i-1];
                b[rotate-i-1]=temp;
            }
            for(int k=rotate;k<(rotate+A.length)/2;k++){
                int temp =b[k];
                b[k]=b[rotate+A.length-k-1];
                b[rotate+A.length-k-1]=temp;
            }
              /*for(int q=0;q<b.length;q++){
                  res[j][q]=b[q];
              }*/
            res[j]=b;

        }
        return res;
    }
}
