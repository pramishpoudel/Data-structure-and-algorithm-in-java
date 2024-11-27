public class Sortedarray 
{
    public static void main(String[] args)
    {
        int arr1[] = {0,1,2,8,10,12,14,16};
        int  start = 0;
        int end = arr1.length-1;
        int target=7;
        System.out.println(getfloorarray(arr1,start,end,target));
    }
     
    public static int getfloorarray(int arr[],int start,int end,int target)
    {
         int result = -1;
            while(start<=end)
            {
               int mid = (start+end)/2;

               if(target==arr[mid]) 
               {
                   return arr[mid];
               }
               else if (arr[mid]>target)
               {           
                 end=mid-1;
                 result = arr[end];
               }
               else
               {
                
                 start=mid+1;
                
               }

            }
            return result;
         
    }
}
