import java.util.Scanner;
class Person2{
  String name;
  int age;
  String gender;

  Person2(String name,int age,String gender){
    this.name=name;
    this.age=age;
    this.gender=gender;
  }
  void display(){
    System.out.println("Name:"+name);
    System.out.println("age:"+age);
    System.out.println("gender:"+gender);
  }
  void birthYear(){
    int by=2023-age;
    System.out.println("birthyear:"+by);
  }
  
}
class Person2Demo{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter name");
    String name=s.next();
    System.out.println("Enter age");
    int age=s.nextInt();
    System.out.println("Enter gender");
    String gender=s.next();

    Person2 p=new Person2(name,age,gender);
    p.display();
    p.birthYear();
  }
}