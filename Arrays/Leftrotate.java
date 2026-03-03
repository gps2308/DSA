package Arrays_easy;
import java.util.Scanner;;
public class Leftrotate {
    public static int [] rotate(int a[],int n)
    {
int temp=a[0];
for(int i=0;i<n-1;i++)
{
    a[i]=a[i+1];
}
a[n-1]=temp;
return a;
    }
    public static void main (String args[])
    {
Scanner sc= new Scanner(System.in);
System.out.println("enter the size os array");
int n= sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the Elements os array");
for(int i=0;i<n;i++)
{
    a[i]=sc.nextInt();
}
int arr[]= rotate(a,n);
for(int x: arr)
    System.out.print(x+" ");
    }
}
