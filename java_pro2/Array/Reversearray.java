package Array;

import java.util.Arrays;

public class Reversearray
{
    public static void main(String[] args)
    {
        int[] rol = {1,5,6,8,7};
        
        int i=0;
        int end = rol.length-1;
         while(i<=end)
         {
            swap(rol,i,end);
            i++;
            end--;
        }

        System.out.println(Arrays.toString(rol));
    }

    static void swap(int[] arr,int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;
    }
}
