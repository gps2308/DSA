package Arrays_medium;
import java.util.Arrays;;
public class Twosum {

    public static int[] sum(int a[],int target)
    {
        int n=a.length;
        int arr[][]=new int [n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=a[i];
          arr [i][1]=i;        }
          Arrays.sort(arr,(aa,b) -> Integer.compare(aa[0],b[0]));
          int left=0,right=n-1;
          while(left<right)
          {
            if((arr[left][0]+arr[right][0])<target)
            {
                left++;
            }
            else if((arr[left][0]+arr[right][0])>target)
                right--;
            else if ((arr[left][0]+arr[right][0])==target)
                return new int[] {arr[left][1],arr[right][1]};
          }
          return new int[] {-1, -1};
    }
    public static void main(String args[])
    {
        int a[]={2,6,5,8,11};
        int k=14;
        int arr[]=sum(a,k);
        System.out.println(arr[0]+","+arr[1]);
    }
}
