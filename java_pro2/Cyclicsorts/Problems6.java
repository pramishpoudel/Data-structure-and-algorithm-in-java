package Cyclicsorts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problems6
{
     public static void main(String[] args)
     {
        int arr[] = {1,1,3};
        int arr1[] = cyclicsort(arr);
        System.out.println(Arrays.toString(arr1));
     }

     public static int[] cyclicsort(int arr[])
     {
        List<Integer>demo = new ArrayList<>();
        int i=0;
        while(i<arr.length)
        {
            int index = arr[i]-1;
            if(arr[i]!=arr[index])
            {
                swap(arr,i,index);
            }
            else
            {
                i++;
            }
        }

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1 )
            {
              demo.add(j);
              demo.add(j+1);
            }
            
        }

        int[] result = new int[demo.size()];
        for (int j = 0; j < demo.size(); j++) {
            result[j] = demo.get(j);
        }
        return result; 

     }

     public static void swap(int arr[],int start,int end)
     {
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end]=temp;
     }

}


