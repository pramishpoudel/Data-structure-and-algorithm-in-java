//not correct yet 
public class Mountainsearch
{
  public static void main(String[] args)
  {
     int arr[]={1,2,4,7,5,4,2,0};
     int target =7;
     int val= binary(arr,target);
     System.out.println(val);
  } 
  
  public static int binary(int arr[],int target)
  {
    int start=0;
    int end=arr.length-1;
    while(start<end)
    {
        int m=(start+end)/2;
         if(arr[m]>arr[m+1] && arr[m]>target)
         {
            end=m;
         }
         else
         {
           start=m+1;
         }
    }
    return end;
    
  }

}
