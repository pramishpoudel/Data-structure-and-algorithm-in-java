import java.util.Arrays;

public class Main {
    public static void main(String[] args) 
    {
           int arr1[]={5,4,2,1,0}; 
           int val = cyclicsorts(arr1);
           System.out.println(val);
     }

     public static int cyclicsorts(int arr[])
     {
           
        int i=0;
  
        while(i<arr.length)
        {
            int cor = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[cor])
            {
                swap(arr,i,cor);
            }
            else
            {
                i++;
            }
        }

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j)
            {
                return j;
            }
        }
        return arr.length;       
     }

     public static void swap(int arr[],int start,int end)
     {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
     }

     }
