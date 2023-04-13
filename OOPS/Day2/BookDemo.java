import java.util.Scanner;
class Book{
  String title;
  String author;
  int publication;
  //parameterized Constructor
  Book(String t,String a,int yer){
    title=t;
    author=a;
    publication=yer;
  }
  
 
  void display(){
    System.out.println("title:"+title);
    System.out.println("author:"+author);
    System.out.println("publication year:"+publication);
    
  }
  
}
 
public class BookDemo{
    public static void main(String args[]){
    System.out.println("enter Book information");
    Scanner sc=new Scanner(System.in);
    Book c=new Book(sc.next(),sc.next(),sc.nextInt());
    System.out.println("********Book Information*********");
      c.display();
    
  }
}