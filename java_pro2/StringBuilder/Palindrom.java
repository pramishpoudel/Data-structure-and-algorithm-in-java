package StringBuilder;

public class Palindrom 
{
    public static void main(String[] args)
    {
           String name = "abcdcba";

           int start=0;
           int end=name.length()-1;

           while(start<=end)
           {
                if(name.charAt(start)==name.charAt(end))
                {
                    start++;
                    end--;
                    if(start==end)
                    {
                        System.out.println("string is palindrom");
                    }
                }
                else
                {
                    System.out.println("String is not palindrom");
                    break;
                }

           }


           
           

    }
}
