import java.util.*;

abstract class Shape
{
	String color;
	boolean filled;
	Shape()
	{
		color = "green";
		filled = true;
	}
	Shape(String s, boolean b)
	{
		color = s;
		filled = b;
	}
	public boolean isfilled()
	{
		return this.filled;
	}
	public String getcolor()
	{
		return this.color;
	}
	public String toString()
	{
		if(this.filled==true)
			return ("A Shape with color of" +this.color+" and filled");
		else
			return ("A Shape with color of"+this.color+"and Not filled");
	}
	abstract double getArea();
}

class Circle extends Shape
{
	int r;
	Circle(int r)
	{
		this.r = r;
	}
	double getArea()
	{
		return 3.14*r*r;
	}
}

class Rectangle extends Shape
{
        int w,h;
	Rectangle(int w,int h)
	{
		this.w = w;
		this.h = h;
	}
	
	double getArea()
	{
		return w*h;
	}
}

//class Demo extends Rectangle{} Rectangle is final class hence cannot be inherited further

class Square extends Rectangle
{
	Square()
	{
		super(5,6);
	}
	public String toString()
	{
		return ("Width:"+w+"Height:"+h);
	}
}

class Testdriver
{
	public static void main(String args[])
	{
		//Shape s = new Shape()
		Circle c = new Circle(3);
		Rectangle r = new Rectangle(5,4);
		Square s = new Square();
		System.out.println(c.getArea());
	        System.out.println(r.getArea());
		System.out.println(s);
	}
}

