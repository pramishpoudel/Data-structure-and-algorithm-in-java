package org.sample;

abstract class Abscls 
{
  abstract void pol();
  public void mole()
  {
	  System.out.println("my name is mole");
  }
}

class Mhild extends Abscls
{
	void pol()
	{
		System.out.println("i am with world and world of dragon");
	}
}

class Moan
{
	public static void main(String[] args)
	{
		Mhild c = new Mhild();
		c.pol();
		
	}
}
