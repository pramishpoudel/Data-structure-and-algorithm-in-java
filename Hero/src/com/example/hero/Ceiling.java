package com.example.hero;

public class Ceiling 
{
   public static void main(String[] args)
   {
      int arr1[] = {1,2,4,7,8,9};
      int start=0;
      int end=arr1.length-1;
      int target=7;

      System.out.println(ceiofnum(arr1,start,end,target));
   }

   public static int ceiofnum(int arr[],int start,int end,int target)
   {
     int result=-1;
     while(start<=end)
     {
        int mid = (start+end)/2;
        if(arr[mid]==target)
        {
            result=arr[mid];
        }
        else if(arr[mid]<target)
        {
            start=mid+1;

        }
        else
        {
            result=arr[mid];
            end=mid-1;
              
        }
     }
     return result;
   }
}

