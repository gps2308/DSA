package Arrays_easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Unionsorted {
    public static ArrayList<Integer> unite(int a[],int b[],int s1,int s2)
    {
        ArrayList<Integer>u=new ArrayList<>();
        int i=0,j=0;
       while(i<s1 && j<s2){
        if(a[i]>b[j])
        {
            if(u.isEmpty()|| u.get(u.size()-1)!=b[i])
            u.add(b[j]);
            j++;

        }
        else if (a[i]<b[j])
        {
              if(u.isEmpty()|| u.get(u.size()-1)!=a[j])
            u.add(a[i]);
            i++;
        }
    else
    {
       if(u.isEmpty()|| u.get(u.size()-1)!=b[j])
        u.add(b[j]);  
    i++;
    j++;
    }}
       while(i<s1)
        {
              if(u.isEmpty()|| u.get(u.size()-1)!=a[i])
            u.add(a[i]);
            i++;

        }
        while(j<s2)
        {
              if(u.isEmpty()|| u.get(u.size()-1)!=b[j])
 u.add(b[j]);
 j++;
        
       
    }
     return u;

}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of first array");
     int n=sc.nextInt();
      System.out.println("Enter size of second array");
int m=sc.nextInt();
int a1[]=new int[n];
int b1[]=new int[m];
System.out.println("enter elements of first arrays");
for(int i=0;i<n;i++)
{
    a1[i]=sc.nextInt();
   

}
System.out.println("enter elements of second arrays");
for(int i=0;i<m;i++)
 b1[i]=sc.nextInt();
ArrayList<Integer> arr=unite(a1, b1, n, m);
for(int x:arr)
System.out.print(x);
}
}
