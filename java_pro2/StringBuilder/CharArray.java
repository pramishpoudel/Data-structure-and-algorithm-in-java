package StringBuilder;

import java.util.Arrays;

public class CharArray 
{
    public static void main(String[] args)
    {
        String name = "pramish poudel";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf('a'));
        System.out.println("  Pramish  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
        
    }
    
}
