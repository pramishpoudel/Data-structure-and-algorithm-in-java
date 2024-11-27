package Cyclicsorts;
import java.util.Arrays;
public class Cyclicsorts 
{
    


    public static void main(String[] args) 
    {
           int arr1[]={5,4,1,3,2}; 
           sort(arr1);
           System.out.println(Arrays.toString(arr1));
     }

     public static void sort(int arr[])
     {
            int i=0;
            while(i<arr.length)
            {
                int cor = arr[i]-1;
                if(arr[i]!=arr[cor])
                {
                    swap(arr, i, cor);
                }
                else
                {
                    i++;
                }
            }      
     }

     public static void swap(int arr[],int start,int end)
     {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
     }

}


