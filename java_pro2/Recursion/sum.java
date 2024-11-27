package Recursion;

public class sum 
{
      public static void main(String[] args)
      {
        int val = sum(1768);
        System.out.print(val);
      }

      public static int sum(int n)
      {
        if(n<1)
        {
            return 0;
        }

        int rem = n%10;
        return rem + sum(n/10);
      }
}
