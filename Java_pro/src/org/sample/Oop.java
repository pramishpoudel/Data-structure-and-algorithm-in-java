package org.sample;

//encapsulation
class Namaste
{
	String name;
	int age;
	
	public int getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
	   this.age=age;
	}
	  
}


public class Oop 
{
	
	public static void main(String[] args)
	{
		Namaste no = new Namaste();
		no.setAge(10);
		System.out.println("the age is " + no.getAge());
	}
	 
	
 }
