import java.util.Scanner;
public class Natural {
   int i=1;
    void printn(int n)
    {
System.out.println(i);
if(i==n)
    return;
i++;
printn(n);
    }
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        Natural ob=new Natural();
        ob.printn(a);

    }
}
