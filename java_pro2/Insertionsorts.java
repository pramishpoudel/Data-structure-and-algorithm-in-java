import java.util.Arrays;

public class Insertionsorts 
{
        public static void main(String[] args) 
        {
               int arr1[]={2,7,5,16,8,9}; 
               insertionsort(arr1);
               System.out.println(Arrays.toString(arr1));
         }
    
         public static void insertionsort(int arr[])
         {
               for(int i=0;i<arr.length-1;i++)
               {
                   for(int j=1+i;j>0;j--)
                   {
                    if(arr[j]<arr[j-1])
                    {
                        swap(arr,j-1,j);
                    }
                    else
                    {
                        break;
                    }
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
    


