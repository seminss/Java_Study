package day7;
abstract class Shape{
    public abstract String getName();
    public abstract double getArea();
}
class Circle extends Shape {
    private double r;
    private String name;
    public Circle(String name, double r){
        this.r=r;
        this.name=name;
    }
    @Override
    public double getArea(){
        return r*r*3.14;
    }
    @Override
    public String getName(){
        return name;
    }
}
class Rectangle extends Shape {
    private double w,h;
    private String name;
    public Rectangle(String name, double w, double h){
        this.name=name;
        this.w=w;
        this.h=h;
    }
    public double getArea(){
        return w*h;
    }
    @Override
    public String getName(){
        return name;
    }
}
class Triangle extends Shape {
    private double w,h;
    private String name;
    public Triangle(String name, double w, double h){
        this.name=name;
        this.w=w;
        this.h=h;
    }
    public double getArea(){
        return w*h/2;
    }
    @Override
    public String getName(){
        return name;
    }
}
public class ex02 {
    public static void main(String[] args) {
        Shape[] arr = {
                new Circle("Circle", 5),
                new Rectangle("Rectangle", 3, 4),
                new Triangle("Triangle", 5, 5)
        };
        double sum = 0;
        for(Shape a :arr) {
            System.out.println(a.getName() + "면적 : " + a.getArea());
            sum += a.getArea();
        }
        System.out.println("면적의 합 : "+sum);
    }
}
