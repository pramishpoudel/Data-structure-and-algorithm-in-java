public class Linear
{
    static public void main(String[] args)
    {
        int arr1[] = {45,80,12,40,56};
        int size=5;
        int target = 12;

        int val=soul(arr1,size,target);

        if (val==-1)
        {
            System.out.println("target is not found");
        }
        else
        {
            System.out.println("target is found on the"+" "+val+"th index");
        }
    }

    public static int soul(int arr[],int size, int target)
    {
         for(int i=0;i<=size;i++)
         {
               if(target==arr[i])
               {
                return i;
               }
         }
         return -1;
    }
}