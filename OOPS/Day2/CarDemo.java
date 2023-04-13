import java.util.Scanner;
class Car{
  String color;
  String model;
  int year;
  //parameterized Constructor
  Car(String clr,String n,int yer){
    color=clr;
    model=n;
    year=yer;
  }
 
  void display(){
    System.out.println("color:"+color);
    System.out.println("model:"+model);
    System.out.println("year:"+year);
    
  }
  
}
 
public class CarDemo{
    public static void main(String args[]){
    System.out.println("enter car information");
    Scanner sc=new Scanner(System.in);
    Car c=new Car(sc.next(),sc.next(),sc.nextInt());
    System.out.println("********Car Information*********");
      c.display();
    
  }
}