package Recursion;

public class Demo 
{
    public static void main(String[] args)
    {
        int val=print(4);
        System.out.println(val);
    }

    public static int print(int n)
    { 
        if(n<2)
        {
            return 1;
        }

        return n*print(n-1);
         
    }
}
