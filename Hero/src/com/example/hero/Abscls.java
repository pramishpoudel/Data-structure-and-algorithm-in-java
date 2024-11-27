package com.example.hero;


class Rol
{
	private int age;
	private String name;
	
	public Rol(int a, String n)
	{
		age=a;
		name=n;
	}
	
	void setAge()
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	 
}

 

	public class Abscls {
	
		public static void main(String[] args)
		{
			 Rol r = new Rol(10,"pramish");
			 System.out.println(r.getAge());
			 
	
		}
	
	}

	 


