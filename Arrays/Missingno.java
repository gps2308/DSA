package Arrays_easy;

public class Missingno {
    public static int missing(int a[],int n)
    {
       for(int i=1;i<=n;i++)
       {
        boolean found=false;
        for(int j=0;j<n-1;j++)
        {
            if(a[j]==i){
                found=true;
            break;
        }}
        if(!found)
            return i;

       }
       return -1;
    }
    public static void main(String args[])
    {
       int a[]={1,6,2,3,4,5};
       int n=7;
       System.out.println("Missing Number :"+missing(a,n));
        
    }
}