import java.util.Scanner;
class Person{
  String name;
  int age;
  String address;
  //parameterized Constructor
  Person(String nm,int ag,String address){
    name=nm;
    age=ag;
    address="";
  }
 
  void display(){
    System.out.println("Name:"+name);
    System.out.println("age:"+age);
    System.out.println("address:"+address);
  }
  
}
 
public class PersonDemo{
    public static void main(String args[]){
    System.out.println("enter person information");
    Scanner sc=new Scanner(System.in);
    Person c=new Person(sc.next(),sc.nextInt(),sc.next());
    System.out.println("********Person Information*********");
      c.display();
    
  }
}