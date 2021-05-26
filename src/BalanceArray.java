public class BalanceArray {
    public static void main(String[] args) {
        int A[]= {2,1,6,4};
        if(A.length==1) {
            //return 0;
        }
        int suffixEvenSum = findSum(A,0);
        int suffixOddSum = findSum(A,1);
        int prefixEvenSum=0;
        int prefixOddSum =0;
        int count=0;
        for(int i=0;i<A.length;i++){
            if(i%2==0)
                suffixEvenSum-=A[i];
            else
                suffixOddSum-=A[i];
            if((prefixEvenSum+suffixOddSum) == (prefixOddSum+suffixEvenSum))
                count++;
            if(i%2==0)
                prefixEvenSum+=A[i];
            else
                prefixOddSum+=A[i];
        }
        //return count;
    }

    public static int findSum(int []A, int startIndex){
        int sum=0;
        for(int i=startIndex;i<A.length;i+=2){
            sum+=A[i];
        }
        return sum;
    }
    }

