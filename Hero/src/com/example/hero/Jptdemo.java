package com.example.hero;

 
class Cat  
{	
	public int x = 20;
	public void cole()
	{
		System.out.println("my name is xa");
	}
	 
}

class Dog extends Cat  
{
	
	public void cole()
	{
		 
		System.out.println("my name is xn");
	}
}

public class Jptdemo
{
	public int x = 20;
    public static void main(String[] args)
    {
    	Cat co = new Cat();
    	co.cole();
    	 
    }
}
