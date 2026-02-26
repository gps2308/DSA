package Arrays_easy;
import java.util.HashMap;


public class Longestsubarray {
    
        public static int subarray(int a[],int n)
        {
            HashMap <Integer,Integer> mpp=new HashMap<>();
            int max=0;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum=sum+a[i];
                if(sum==0)
                {
               max=i+1;
                }
            else{
                if(mpp.containsKey(sum))
                {
              max=Math.max(max,i-mpp.get(sum));
                }
                else
                    mpp.put(sum,i);
            }
            }
            return max;

        
    }

    public static void main(String args[])
    {
        int a[]={6, -2, 2, -8, 1, 7, 4, -10};
        int n=a.length;
        System.out.println("MAx subarray length:"+subarray(a,n));
    }
}
