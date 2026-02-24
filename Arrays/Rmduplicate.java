package Arrays_easy;
import java.util.HashSet;
import java.util.Scanner;;
public class Rmduplicate
{
    public static int remove(int a[])
    {
        int index =0;
        HashSet<Integer> set= new HashSet<>();
        for(int x: a)
        {
            if(!set.contains(x)){
                set.add(x);

            a[index]=x;
            index++;
        }
        }
        return index;
    }
    public static void main(String srgs[])
    {
    Scanner sc=new Scanner(System.in);
System.out.println("Enter size of the array");
int n= sc.nextInt();
int a[]=new int[n];
System.out.println(" Enter the elements of array");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int k=remove(a);
System.out.println("Unique array");
for(int i=0;i<k;i++)
{
    System.out.print(a[i]);
}


    }
   
}