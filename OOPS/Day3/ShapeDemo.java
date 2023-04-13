class Shape{
  String color,filled;
}
class Rectangle extends Shape{
  double width,height;
  void get_area(){
    double area=width*height;
    System.out.println("color :"+color);
    System.out.println("filled:"+filled);
    System.out.println("area is:"+area);
  }
}
class ShapeDemo{
  public static void main(String args[]){
    Shape s=new Shape();
    s.width=20;
    s.height=30;
    s.filled="yes";
    s.color="black";
    s.get_area();
  }
}