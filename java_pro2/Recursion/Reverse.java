package Recursion;

public class Reverse
{
    public static void main(String[] args)
    {
         
         System.out.println(reverse2(14789));
        
    }
    static int sum=0;
    public static void reverse(int n)/*this one is one function tha can help to reverse the number */
    {
       
        if(n==0)
        {
            return ;
        }

        int rem = n%10;
        sum = sum*10+rem;
        reverse(n/10);

    }

    public static int reverse2(int n)        /*ths is another function to reverse the function */
    {
          int digits = (int) (Math.log10(n))+1;
          return helper(n,digits);
    }

    private static int helper(int n,int digits)
    {
        if(n%10==n)
        {
            return n;
        }
    
        int rem=n%10;
        return rem * (int) (Math.pow(10,digits))+helper(n/10,digits-1);
         
    }
}
