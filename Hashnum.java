import java.util.*;
public class Hashnum {

    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of array");
int n=sc.nextInt();
int arr[]=new int[n];
int maxi=0;
System.out.println("enter the numbers");
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
     maxi=Math.max(maxi,arr[i]);
}
int hash[]=new int[maxi+1];
for(int i=0;i<n;i++)
{
    hash[arr[i]]++;
}
System.out.println("enter no of queries");
int q= sc.nextInt();
 
 for(int i=0;i<q;i++)
{
    System.out.println("enter the query");
int query = sc.nextInt();
if(query>maxi)
   System.out.println( "0");
else 

System.out.println(hash[query]);
}
sc.close();
}
    }
    

