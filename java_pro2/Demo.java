class Demo
{
    public static void main(String[] args)
    {
    
        int arr1[] = {8,12,15,16,20,22,28};
        int target = 13;
        int size = 7;

        int val = binary(arr1,size,target);

        if(val==-1)
        {
            System.out.println("unable to return");
        }
        else{
            System.out.println(val);
        }
         
    }

    public static int binary(int arr[],int size,int target)
    {
        int i=0;
        int r=size-1;
       
        while(i<=r)
        {
            int m = (r+i)/2;
            if(arr[i]>=target)
            {
                return arr[i];
            }
            else if(target<arr[m]) 
            {
                r=m-1;
            }
            else if(target>arr[m])
            {
                i=m+1;
            }
        }
        return -1;
    }
}