package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinput
{
   public static void main(String[] args)
   {
    Scanner in = new Scanner(System.in);
    int[] num1 = new int[5];

    for(int i=0;i<5;i++)
    {
        
        num1[i]=in.nextInt();
    }

   /* for(int i=0;i<5;i++)
    {
        System.out.println("the"+i+"th index number is "+num1[i]);
    }*/

    System.out.println(Arrays.toString(num1));
   }
}