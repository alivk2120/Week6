import java.util.Scanner;
class Invoice{
  String name;
  String prod;
  int quantity;
  int price;
  Invoice(String n,String p,int q,int pr){
    name=n;
    prod=p;
    quantity=q;
    price=pr;
  }
  void total(){
    int tot=price*quantity;
    System.out.println("Total price is:"+tot);
  }
  void display(){
    System.out.println("Customer name:"+name);
    System.out.println("Product name:"+prod);
    System.out.println("Quantity:"+quantity);
    System.out.println("Price:"+price);
  }
  
}
class InvoiceDemo{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Customer Name");
    String name=s.next();
    System.out.println("Product name");
    String prod=s.next();
    System.out.println("quantity");
    int quantity=s.nextInt();
    System.out.println("Price");
    int price=s.nextInt();
    Invoice i=new Invoice(name,prod,quantity,price);
    i.display();
    i.total();
  }
}