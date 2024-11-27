package org.sample;
//interface implementaion
interface Animal
{
	void Dog();
	void Cow();
	
}

class Herbi implements Animal
{
	public void Cow()
	{
		System.out.println("cow eats nothing");
	}
	
	public void Dog()
	{
		System.out.println("Dog eats bones");
	}
}

class Carni implements Animal
{
	public void Dog()
	{
		System.out.println("Dog eats meats");
	}
	
	public void Cow()
	{
		System.out.println("cow eats grass");
	}
	
}
public class Interfece
{
     public static void main(String[] args)
     {
    	 Carni c =new Carni();
    	 Herbi h = new Herbi();
    	 
    	 h.Dog();
    	 h.Cow();
    	 
    	 c.Dog();
    	 c.Cow();
     }
}
