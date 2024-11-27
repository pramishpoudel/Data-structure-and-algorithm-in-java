package Recursion;

public class Binary_recurs 
{
    public static void main(String[] args)
    {
        int arr1[]={1,2,5,8,9,10,14,17,18,19};
        int start=0;
        int end=arr1.length-1;
        int target=14;
       int val= binary(arr1,start,end,target);
       System.out.println(val);
    }
   
    public static int binary(int arr[],int start,int end,int target)
    {
        if(start>end)
        {
            return -1;
        }
       
        int m=(end+start)/2;
        
        if(target==arr[m])
        {
            return m;
        }

         if(target<arr[m])
         {
            return binary(arr,start,m-1,target);
         }
         else
         {
            return binary(arr,m+1,end,target);
         }

}
}
