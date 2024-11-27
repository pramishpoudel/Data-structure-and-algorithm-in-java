package Array;

import java.util.Scanner;

public class Multidime 
{
    public static void main(String[] args)
    {
        int[][] arr1 = {
            {1,2,3},
            {7,8,9},
            {10,5,9}
        };
        
       /* for(int[] a:arr1)
        {
            for(int b: a)
            {
            System.out.println(b);
            }
        }*/

       // using enhanced for loop

       for(int i=0;i<arr1.length;i++)
       {
        for(int j=0;j<3;j++)
        {
            System.out.println(arr1[i][j]);
        }
        System.out.println();
       }
    }
}
