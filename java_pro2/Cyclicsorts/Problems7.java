package Cyclicsorts;

//find the smallest positive missing integer
public class Problems7
{
     public static void main(String[] args)
     {
        int arr[] = {3,4,2,1};
        int arr1 = cyclicsort(arr);
        System.out.println(arr1);
     }

     public static int cyclicsort(int arr[])
     {
      
        int i=0;
        int sol=arr.length+1;
        while(i<arr.length)  // int arr[] = {3,4,2,1};
        {
            int index = arr[i]-1;
            if(arr[i]>0 && arr[i]!=arr[index])
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
               return j+1;
            }
        }

        
        return sol;

     }

     public static void swap(int arr[],int start,int end)
     {
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end]=temp;
     }

}
