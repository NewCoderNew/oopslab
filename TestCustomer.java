class Customer
{
  int ID;
  String name;
  int discount;
  Customer(int id,String nam,int disc)
  {
    ID = id;
    name = nam;
    discount = disc;
  }
  public int getID()
  {
    return ID;
  }
  public String getName()
  {
    return name;
  }
  public int getDiscount()
  {
    return discount;
  }
  public void setDiscount(int dis)
  {
   this.discount  = dis;
  }
  public String toString()
  {
    return (name+"("+ID+")");
  }
}

class Invoice
{
  int ID;
  Customer customer;
  double amount;
  Invoice(int ID,Customer cust,double amount)
  {
    this.ID = ID;
    this.customer = cust;
    this.amount = amount;
  }
  public int getID()
  {
    return ID;
  }
  public Customer getCustomer()
  {
    return customer;
  }
  public void setCustomer(Customer customer)
  {
    this.customer = customer;
  }
  public String getAmount()
  {
    return Double.toString(amount);
  }
  public void setAmount(double amount)
  {
    this.amount = amount;
  }
  public String getCustomerName()
  {
    return customer.getName();
  }
  public double getAmountAfterDiscount()
  {
    return (amount - (amount*(customer.getDiscount()/100)));
  }
}

public class TestCustomer
{
  public static void main(String args[])
  {
    Customer c = new Customer(101,"LokeshDD",5);
    System.out.println(c.getID());
    System.out.println(c.getName());
    System.out.println(c.getDiscount());
    c.setDiscount(10);
    System.out.println("After Set Discount");
    System.out.println(c.getDiscount());
    System.out.println(c);
    Invoice i = new Invoice(102,c,2000);
    System.out.println(i.getID());
    System.out.println(i.getCustomer());
    Customer c1 = new Customer(103,"Jim Halpert",5);
    i.setCustomer(c);
    System.out.println(i.getCustomer());
    System.out.println(i.getAmount());
    i.setAmount(5000);
    System.out.println(i.getAmount());
    System.out.println(i.getCustomerName());
    System.out.println(i.getAmountAfterDiscount());
  }
}





