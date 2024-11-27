package Recursion;

public class Function 

{
    public static void main(String[] args)
    {
        name();
    }

   public static void name()
    {
        System.out.println("calling func1");
        name2();
    }

    public static void name2()
    {
        System.out.println("calling func2");
        name3();
    }

public static void name3()
    {
        System.out.println("calling func3");
        
    }
}
