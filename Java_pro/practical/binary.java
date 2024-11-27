public class binary 
{
    public static void main(String[] args)
    {
        int arr1[]= {10,20,30,40,50,60,70};
        int size = 7;
        int target=70;

        int val= binaryfunc(arr1,size,target);
        if (val==-1)
        {
            System.out.println("target is not found");
        }
        else
        {
            System.out.println("your desired target is found at the index"+" " + val);
        }
    }

    public static int binaryfunc(int arr[],int size,int target)
    {
        int i=0;
        int r=size-1;
        int m;
        while(i<=r)
        {
            m=(i+r)/2;

            if(target==arr[m])
            {
               return m;
            }
            else if(target <arr[i])
            {
                r=m-1;
            }
            else
            {
                i=m+1;
            }

        }
        return -1;
    }
}
