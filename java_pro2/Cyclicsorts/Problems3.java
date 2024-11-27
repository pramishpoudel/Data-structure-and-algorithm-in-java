package Cyclicsorts;
//finding missing numbers list from the  arr
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problems3 
{
    public static void main(String[] args)
    {
        int[] arr = {1,5,3,6,7};
        int[] arr1 = missednum(arr);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr.length);
    }

    public static int[]  missednum(int arr[])
    {
        int i=0;
          
        List<Integer>demo = new ArrayList<>();
        while(i<arr.length)
        {
            int index = arr[i]-1;
            if(arr[i]<=arr.length && arr[i]!=arr[index])
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
            if(arr[j]!=j+1)
            {
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
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
