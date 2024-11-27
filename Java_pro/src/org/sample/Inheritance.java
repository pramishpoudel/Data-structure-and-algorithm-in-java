package org.sample;
// single level inheritance;
class Parent
{
	public void show()
	{
		System.out.println("this is parent class");
	}
}

class Child extends Parent
{
	public void show1()
	{
		System.out.println("this is child class");
	}
}
public class Inheritance 
{

	public static void main(String[] args)
	{
		Parent s = new Parent();
		s.show();
	}
}
