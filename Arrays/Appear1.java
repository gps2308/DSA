package Arrays_easy;

import javax.sound.sampled.SourceDataLine;

public class Appear1
{
    public static void check(int a[])
    {
        int greatest=0;
        for(int i=0;i<a.length;i++)
            greatest=Math.max(greatest, a[i]);
        int hash[]=new int[greatest+1];
        for(int i=0;i<a.length;i++)
            hash[a[i]]++;
        boolean f=false;
        System.out.println("Apperaing once numbers are ");
        for(int i=0;i<a.length;i++)
        {
            if(hash[a[i]]==1)

                System.out.print(a[i]+", ");
                f=true;
        }
        if(!f)
    
        System.out.println("None");

   
    }
    public static void main(String args[])
    {
        int a[]={1,2,2,3,4,4,5};
        check(a);
    }

}