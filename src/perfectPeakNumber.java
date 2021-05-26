public class perfectPeakNumber {
    public static void main(String[] args) {
        int A[] = {18757, 13932, 7377, 19955, 24085, 4967, 11841, 19630, 16945, 12624, 24627, 32440, 26309};
        int max[] = new int[A.length];
        max[0] = A[0];


        //System.out.println(res.length+" ");
        //int index = A.length%2==0?A.length/2:(A.length/2)+1;
        //int l=0; int h=A.length-1;int mid=l+(h-l)/2;
        for (int i = 1; i < A.length; i++) {
            max[i] = Math.max(max[i - 1], A[i]);
            //System.out.println(res[i]+" ")
            //System.out.println(res[A.length-i-1]+" ");
        }
        int min[] = new int[A.length];
        // min[0]=A[0];
        min[A.length - 1] = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], A[i]);
        }
        int result = 0;
        //int k=0;
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > max[i - 1] && A[i] < min[i + 1]){
                result=1;
                break;
            }
                //return 1;
        }

        System.out.println(result+" ");

        //return 0;
    }
}
