import java.util.*;
interface calc
{
	public int res(int x ,int y);
}

public class lambda
{
	public static void main(String args[])
	{
		calc a = (x,y)->(x+y);
		System.out.println("ADDITION"+a.res(10,4));
                calc m = (x,y)->(x*y);
                System.out.println("MULTIPLICATION"+m.res(10,4));
	}
}

