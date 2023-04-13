//Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods.
import java.util.Scanner;
class Shape{
  void getArea(){
    System.out.println("0");
  }
}
class Circle extends Shape{
  void getArea(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the radius");
    double rad=s.nextDouble();
    double area=3.14*rad*rad;
    System.out.println("Area of circle :"+area);
  }
}
class Rectangle extends Shape{
  void getArea(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the length");
    double length=s.nextDouble();
    System.out.println("Enter the width");
    double width=s.nextDouble();
    double area=length*width;
    System.out.println("Area of rectangle is :"+area);
  }
}
class Practice1{
  public static void main(String args[]){
    Circle c=new Circle();
    Rectangle r=new Rectangle();
    c.getArea();
    r.getArea();
  }
}