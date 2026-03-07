package Arrays_medium;

import java.util.HashMap;;
class Twosum_indices
{
    public static int[] sumindex(int a[],int target)
    {
      
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {   int temp=target-a[i];
        
        
        if (mpp.containsKey(temp))
            return new  int[] { mpp.get(temp),i};
        mpp.put(a[i],i);


    }
return new int[] {-1,-1};}
public static void main(String args[]){
    int a[]={2,6,5,8,11};
    int k=14;
    int arr[]=sumindex(a,k);
    System.out.println(arr[0]+","+arr[1]);
}

}
