/*  int arr[] = {0,1,8,8,8,10}
 
output:[2,4]
*/


import java.util.Arrays;

public class Ceiling 
{
   public static void main(String[] args)
   {
        System.out.println(Arrays.toString(search()));
         

   }

   static public int[] search()
   {
        int arr1[]={-1,-1};
        int arr [] = {0,1,8,8,8,10};
        int start=0;
        int end=arr.length-1;
        int target=8;

        int ans1 = firstint(arr,start,end,target);
        int ans2 = lastint(arr,start,end,target);
        arr1[0]=ans1;
        arr1[1]=ans2;
        return arr1;

   }

   public static int firstint(int arr[],int start,int end,int target)
   {
    int result=-1;
         while(start<=end)
    {
        int mid = (start+end)/2;

        if(arr[mid]==target)
        {
          result=mid;
          end=mid-1;
        }
        else if(arr[mid]<target)
        {
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }
      
   }
    return result;
}

public static int lastint(int arr[],int start,int end,int target)
   {
    int result=-1;
         while(start<=end){
        int mid = (start+end)/2;

        if(arr[mid]==target)
        {
          result=mid;
          start=mid+1;
        }
        else if(arr[mid]<target)
        {
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }
      
   }
    return result;
}

}
