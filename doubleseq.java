import java.util.*;

public class doubleseq
{
  public static void main(String args[])
	{
	  Scanner input = new Scanner(System.in);
          String s;
	  s = input.nextLine();
	  int c=0;
	  char ch = s.charAt(0);
	  for(int i=1;i<s.length();i++)
	  {
		  if(s.charAt(i)==ch)
			  c++;
		  ch = s.charAt(i);
	  }
	  System.out.println(c);
	}
}
