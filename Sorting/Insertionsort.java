package sorting;
import java.util.Scanner;
public class Insertionsort
{
public static int[] insert(int a[],int n)
{
    for(int i=0;i<n;i++)
    {
        int j=i;
        while(j>0 && a[j-1]>a[j])
        {
            int temp = a[j-1];
            a[j-1]=a[j];
            a[j]=temp;
            j--;
        }
    }
    return a;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
          System.out.println("enter elements of array");
          for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
          int a[]=insert(arr,n);
            System.out.println("Sorted array :");
            for(int x: a)
                System.out.print(x+" ");
}
}
