import java.util.*;

abstract class Student
{
  String name;
  double grade;
  int age;
  abstract public boolean isPassed(double grade);
}

class UnderGrad extends Student
{
  public boolean isPassed(double Grade)
  {
    grade = Grade;
    if(grade>70.0)
    {
      return true;
    }
    else
	   return false;
  }
}

final class Grad extends Student
{
    public boolean isPassed(double Grade)
  {
    grade = Grade;
    if(grade>80.0) 
    {
      return true;
    }
    else
           return false; 
  }
}

//class demonstrate extends Grad{int a} will not work as Grad is declared as final

public class TestStudent
{
  public static void main(String args[])
  {
    UnderGrad ug = new UnderGrad();
    Grad g = new Grad();
    System.out.println("Undergrad isPassed(75)");
    if(ug.isPassed(75))
	    System.out.println("Student Passed");
    else
	    System.out.println("Student is not Passed");
    System.out.println("grad isPassed(75)");
    if(g.isPassed(75))
            System.out.println("Student Passed");
    else
            System.out.println("Student is not Passed");
  }
}
    
