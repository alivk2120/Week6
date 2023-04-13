import java.util.Scanner;
 
public class Application {
 
    public static void main(String[] args) {
        // Read student info (id, name, gender,city)
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your id");
        int id=s.nextInt();
        
        System.out.println("Enter your name");
        String name=s.next();
        
        System.out.println("Enter your gender");
        String gender=s.next();
        
        System.out.println("Enter your city");
        String city=s.next();
        
        Student std=new Student();
        std.setId(id);
        std.setGender(gender);
        std.setName(name);
        std.setCity(city);
        
        System.out.println("Id: "+std.getId());
        System.out.println("Name: "+std.getName());
        System.out.println("gender: "+std.getGender());
        System.out.println("city: "+std.getCity());
        
    }
 
}