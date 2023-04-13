import java.util.Scanner;
class Circle{
  int radius;
  //parameterized Constructor
  Circle(int rad){
    radius=rad;
  }
  void diameter(){
    double dia=radius*2;
    System.out.println("diameter is:"+dia);
  }
  void area(){
    double area=3.15*radius*radius;
    System.out.println("area is:"+area);
  }
 
  void display(){
    System.out.println("Radius:"+radius);
  }
  
}
 
public class CircleDemo{
    public static void main(String args[]){
    System.out.println("enter Radius");
    Scanner sc=new Scanner(System.in);
    Circle c=new Circle(sc.nextInt());
    System.out.println("*******Circle Information*********");
      c.display();
      c.diameter();
      c.area();
    
  }
}