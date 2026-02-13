import java.util.Scanner;

public class reversenatural {

    void printnr(int n)
    {
System.out.println(n);
if(n==1)
    return;

printnr(n-1);
    }
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        reversenatural ob=new reversenatural();
        ob.printnr(a);

    }
}

