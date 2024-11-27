  
public class Mountain
{
   public static void main(String[] args)
   {
     int arr[] ={0,1,3,5,3,1};
     int val=binaryarr(arr);
     System.out.println(arr[val]);
   } 

   public static int binaryarr(int arr[])
   {
    int start=0;
    int end=arr.length-1;
    while(start<end)
    {
        
        int m=(start+end)/2;
        if(arr[m]>arr[m+1])
        {
             end=m;
        }
         else
         {
            start=m+1;
         }
    }
    return start;
   }
}
