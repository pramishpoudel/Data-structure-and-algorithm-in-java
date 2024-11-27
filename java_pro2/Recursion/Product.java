package Recursion;

public class Product 
{
    public static void main(String[] args)
    {
        int val = product(1458);
        System.out.println(val);
    }

         static int product(int n)
         {
            if((n%10)==n)
            {
                return n;
            }

            return (n%10)*product(n/10);
         }
}
