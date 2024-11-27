import java.util.Arrays;

public class Bubble 
{
    public static void main(String[] arg)
    {
    int arr[] = {1,7,4,6,8,2};
     bubblesort(arr);
    System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int arr[])
    {
        boolean swap;
        for(int i=0;i<arr.length;i++)
        {
            swap=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap)
            {
                break;
            }
             
        }

         
    
    }
}
