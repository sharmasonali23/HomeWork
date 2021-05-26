import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class novelInteger {
    public static void main(String[] args) {
        int A[]={-4, -2, 0, -1, -6 };
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++) {
            // Handle duplicates (only check for rightmost duplicate), skip others
            if(i < A.length - 1 && A[i] == A[i+1]) {
                continue;
            }
            // Check if the remaining values to the right are equal to the current value
            if(A.length - i - 1 == A[i]) {
                //return 1;
            }
        }

        //return -1;
        //return res;
    }
}
