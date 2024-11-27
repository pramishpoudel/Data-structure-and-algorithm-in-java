package StringBuilder;

public class Preetyprinting 
{
    public static void main(String[] args)
    {
       /* float a =  712.356f;
        System.out.printf("%.2f",a);
        */

     StringBuilder builder = new StringBuilder();
   
     for(int i=0;i<26;i++)
     {
        char c = (char) ('a'+i);
        builder.append(c);
     }

     System.out.println(builder);//print result from a-z;

     System.out.println(builder.length());
     System.out.println(builder.delete(4,10));

    }
}
