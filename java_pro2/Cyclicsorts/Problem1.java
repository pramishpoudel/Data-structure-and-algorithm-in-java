package Cyclicsorts;
//find the missing element from the arr
public class Problem1 
{
    public static void main(String[] args)
    {
        int arr1[] = {0,5,1,2,3};
        System.out.println(missingnum(arr1));

    }

    public static int missingnum(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            int index = arr[i];

            if( arr[i]<arr.length && arr[i]!=arr[index])
            {
                 swap(arr, i, index);
            }
            else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++)
        {
            if(j!=arr[j])
            {
                return j;
            }
        }
        return arr.length;
    }



    public static void swap(int arr[],int i, int index)
    {
        
        int temp = arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }
}
