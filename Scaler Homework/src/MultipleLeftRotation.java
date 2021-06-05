import java.util.Arrays;

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
