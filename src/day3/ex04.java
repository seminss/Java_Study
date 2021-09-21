package day3;

//Circle 클래스의 멤버변수로 radius, name이 있으며 private로 외부에서 직접
//        접근할 수는 없다. 그리고 멤버함수로는 반지름을 수정하는 기능, 이름을 받는
//        기능, 넓이를 받는 기능, 그리고 이름과 넓이를 출력하는 기능이 있다

public class ex04 {
    public static void main(String[] args){
        Circle c1=new Circle("Pizza",0);
        Circle c2=new Circle("donut",0);
        Circle c3=new Circle("hamburger",0);

        c1.setRad(12);
        c2.setRad(-2);
        c3.setRad(7);

        c1.show();
        c2.show();
        c3.show();

        Circle res=new Circle(null,0);

        if(c1.getArea()>c2.getArea()) {
            if (c1.getArea() > c3.getArea())
                res=c1;
            else
                res=c3;
        }
        else {
            if (c2.getArea() > c3.getArea())
                res = c2;
            else
                res = c3;
        }
        System.out.println("가장 큰 면적은 "+res.getName());
    }
}
class Circle{
    private int radius;
    private String name;
    double area;

    public Circle(String n, int r){
        radius=r;
        name=n;
    }
    //반지름 수정
    public void setRad(int r){
        radius=r;
    }
    //이름 받기
    public String getName(){
        return name;
    }
    //넓이 받기
    public double getArea(){
        if (radius>0)
            return (radius*radius*3.14);
        else
            return 0;
    }
    //이름, 넓이 출력
    public void show(){
        System.out.println(name+"의 넓이 : "+getArea());
    }
}