public class linearsearch 
{
    
    public static void main(String[] args)
    {
        int arr1[]= {10,20,30,40,50,60,70};
        int size = 7;
        int targe=70;

        int val= linearfunction(arr1,size,targe);
        if (val==-1)
        {
            System.out.println("target is not found");
        }
        else
        {
            System.out.println("your desired target is found at the index"+" " + val);
        }
    }

    public static int linearfunction(int arr1[],int size,int targe)
        {
             for(int i=0;i<size;i++)
             {
                if(targe==arr1[i])
                {
                    return i;
                }
             }
             return -1;
        }

}
