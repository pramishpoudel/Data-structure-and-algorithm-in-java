package Cyclicsorts;
 

//find the missing element from the arr
public class Problem2
{
    public static void main(String[] args)
    {
        int arr1[] = {5,1,3,7,4,2};
        System.out.println( missingnum(arr1));

    }

    public static int missingnum(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            int index = arr[i]-1;
            if(arr[i]<arr.length && arr[i]!=arr[index])
            {
                 swap(arr,i,index);
            }
            else{
                i++;
            }
        }
    

        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
            {
                return j+1;
            }
        }

         return arr.length+1;
        

    }



    public static void swap(int arr[],int i, int index)
    {
        
        int temp = arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }
}
