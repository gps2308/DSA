class Name
{
    int c=0;
   void fun()
    {
        if(c==4)
            return;
        System.out.println("Gurpreet");
        c++;
        fun();
    }
public static void main(String[] args)
{
    Name ob=new Name();
    ob.fun();
}
}