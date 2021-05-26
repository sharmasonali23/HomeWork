import java.util.ArrayList;
import java.util.List;

public class perfectPeakNumber {
    public static void main(String[] args) {
        int n=5;int k=3;
        List<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        for(int i=0;i<n;i=i+k)
        {
            int j=Math.min(i+k-1,n-1);
            int start=i;
            int end=j;
            while(start<end)
            {
                int temp=arr.get(start);
                int temp1=arr.get(end);
                arr.set(end,temp);
                arr.set(start,temp1);
                end--;
                start++;
            }
        }
    }
}
