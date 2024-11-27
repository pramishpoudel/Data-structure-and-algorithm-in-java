package Array;

public class VariableCol 
{
    public static void main(String[] args)
    {
        int[][] arr1 = {
                         {1,2,3},
                         {7,8},
                         {10,5,9,8}
                        };

                    
                    for(int i=0;i<arr1.length;i++)
                    {
                        for(int j=0;j<arr1[i].length;j++)
                        {
                            System.out.println(arr1[i][j]);
                        }
                        System.out.println();
                    }

    }
}
