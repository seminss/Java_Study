package day6;
class Shape{
    private String name;
    public Shape(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public double getArea(){
        return 0;
    }
}
class Circle extends Shape{
    private double r;
    public Circle(String name, double r){
        super(name);
        this.r=r;
    }
    public double getArea(){
        return r*r*3.14;
    }
}
class Rectangle extends Shape{
    private double w,h;
    public Rectangle(String name, double w, double h){
        super(name);
        this.w=w;
        this.h=h;
    }
    public double getArea(){
        return w*h;
    }
}
class Triangle extends Shape{
    private double w,h;
    public Triangle(String name, double w, double h){
        super(name);
        this.w=w;
        this.h=h;
    }
    public double getArea(){
        return w*h/2;
    }
}
public class ex03 {
    public static void main(String[] args){
        Shape[] arr ={
                new Circle("Circle",5),
                new Rectangle("Rectangle",3,4),
                new Triangle("Triangle",5,5)
        };
        double sum=0;
        for(Shape a : arr){
            System.out.println(a.getName()+"면적 : "+a.getArea());
            sum+=a.getArea();
        }
        System.out.println("면적의 합 : "+ sum);
    }
}