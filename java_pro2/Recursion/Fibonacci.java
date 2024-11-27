package Recursion;

public class Fibonacci 
{
    public static void main(String[] args)
    {
        int n=4;

        if (n <= 0) 
        {
            System.out.println("Please enter a positive integer.");
        } 
        else
         {
            System.out.print("Fibonacci series: ");
            for (int i = 0; i < n; i++) 
            {
                System.out.print(fibo(i) + " ");
            
            }
        }
    }

    public static int fibo(int n)
    {
         if(n<2)
         {
            return n;
         }

        return fibo(n-1) + fibo(n-2);
    }
}
