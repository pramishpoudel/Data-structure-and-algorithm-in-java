package pattern;

public class Problems6
{

    public static void main(String[] args)
    {
        
       /* for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
                               this code is also correct;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

        pattern(5);
        
             
        }
          public static void pattern(int n)
          {
            for(int i=1;i<2*n;i++)
            {
                int a = i>n?2*n-i:i;
                for(int j=1;j<=a;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
          }

        
    }

