import java.util.*;

class A
{
	synchronized void displayTable(int n)
	{
		try
		{
	        	for(int i=1;i<=10;i++)
			{
		        	System.out.println(i*n);
			        Thread.sleep(1000);
		        }  
	        }
	        catch(Exception e)
		{}
	}
}

class Mul extends Thread
{
	int n;
	A a;
	Mul(int n, A a)
	{
		this.n = n;
		this.a = a;
	}
	public void run(){a.displayTable(n);}
}

public class syncTable
{
	public static void main(String args[])
	{
		A a = new A();
		Mul m = new Mul(8,a);
		Mul m1 = new Mul(9,a);
		m.start();
		m1.start();
	}
}
	

