import java.util.Arrays;

public class Selectionsorts 
{
    public static void main(String[] args)
    {
          int arr[]={8,6,-4,2,3,1};

          selectionsort(arr);
          System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
             int lastindex = arr.length-i-1;
             int val=getMax(arr,0,lastindex);
             swap(arr,val,lastindex);

        }
    }

    public static void swap(int arr[],int start,int end)
    {
        int temp= arr[start];
        arr[start]= arr[end];
        arr[end]=temp;
    }

    public static int getMax(int arr[],int start,int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        return max;
    }

}
