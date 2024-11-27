package org.sample;
//concept of static keyword

class Lol
{
	static String name;
	int age;
	int roll;
	
	void show()
	{
		System.out.println("name:"+name+"age:"+age+"roll:"+roll);
	}
	
	 public static void show1(Lol obj)
	{
		System.out.println("name:"+name+"age:"+obj.age+"roll:"+obj.roll);
	}
}
public class Stavar 
{
	static public void main(String[] args)
	{
		Lol sb = new Lol();
		Lol.name="pramish";
		sb.age=20;
		sb.roll=41;
		
		Lol sb1 = new Lol();
		sb1.name="pramish poudel";
		sb1.age=21;
		sb1.roll=42;
		
		Lol.name="suman";
		
		 sb1.show();
		Lol.show1(sb);
	}

}
