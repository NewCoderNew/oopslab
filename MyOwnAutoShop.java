import java.util.*;

class Car
{
  int speed;
  double regularPrice;
  String color;
  Car(int sp,double rp,String col)
  {
	  speed = sp;
	  regularPrice = rp;
	  color = col;
  }
  public double getSalePrice()
  {return regularPrice;}
  public String toString()
  {
	  return (speed+"\n"+regularPrice+"\n"+color);
  }
}

class Truck extends Car
{
  int weight;
  Truck(int we,int sp,double rp,String col)
  {
	  super(sp,rp,col);
	  weight = we;
  }
  public double getSalePrice()
  {
    if(weight>2000)
	    return (super.getSalePrice() - (super.getSalePrice()*(10/100)));
    else
            return (super.getSalePrice() - (super.getSalePrice()*(20/100)));
  }
}

class Ford extends Car
{
  int year;
  int manufacturerDiscount;
  Ford(int yr,int manf,int sp,double rp,String col)
  {
	  super(sp,rp,col);
	  year = yr;
	  manufacturerDiscount = manf;
  }
  public double getSalePrice()
  {
   return (super.getSalePrice()-manufacturerDiscount);
  }
}

class Sedan extends Car
{
  int length;
  Sedan(int l,int sp,double rp,String col)
  {
	  super(sp,rp,col);
	  length = l;
  }
  public double getSalePrice()
  {
    if(length>20)
	    return (super.getSalePrice() - (super.getSalePrice()*(5/100)));
    else
            return (super.getSalePrice() - (super.getSalePrice()*(10/100)));
  }
}

class MyOwnAutoShop
{
  public static void main(String args[])
  {
          Car c = new Car(80,2500,"Orange");	  
	  Sedan s = new Sedan(30,55,3000,"red");
	  Ford f  = new Ford(2015,1000,50,3000,"Grey");
	  Truck t = new Truck(5000,80,5000,"white");
	  System.out.println("Sedan Sale Price:2000");
	  System.out.println("After Discount:"+s.getSalePrice());
	  System.out.println("Ford Sale Price:3000");
          System.out.println("After Discount:"+f.getSalePrice());
	  System.out.println("Car Sale Price:2500");
          System.out.println("Car Discount:"+c.getSalePrice());
	  System.out.println("Truck Sale Price:5000");
          System.out.println("After Discount"+t.getSalePrice());	  
	  System.out.println("Sedan:");
          System.out.println(s);
	  System.out.println("Ford:");
          System.out.println(f);
	  System.out.println("Car:");
          System.out.println(c);
  }
}  
