package day4;

//        Circle 클래스를 통해 인스턴스 3개를 만들어 그 원의 중심점과 반지름을 출력
//        한다. 그리고 a원에 대해 b와 c의 원과 비교하는데 그 원의 중심이 같으면 같은
//        원이고 중심이 다르면 다른 원이다.
//        Circle 클래스를 인스턴스 할 때 주어진 Ex4 클래스와 같이 각각 다른 3개의 생
//        성자를 구현해야 한다. 생성자에 대해 중심점의 값이 없으면 (0, 0)으로 초기화
//        하고, 반지름이 없으면 반지름을 5로 초기화한다. 이 때 키워드 this를 사용한다.

public class exx04 {
    public static void main(String[] args){
        Circle a = new Circle(2,3,30);
        Circle b = new Circle(5);
        Circle c = new Circle(2,3);

        System.out.println("원 a : "+a);
        System.out.println("원 b : "+b);
        System.out.println("원 c : "+c);

        if(a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
        if(a.equals(c))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
class Circle{
    private int x, y, r;

    public Circle(int r){
        this.x=0;
        this.y=0;
        this.r=r;
    }
    public Circle(int x, int y){
        this.x=x;
        this.y=y;
        this.r=5;
    }
    public Circle(int x, int y, int r){
        this.x=x;
        this.y=y;
        this.r=r;
    }
//    public String toString(){
//        return "Circle("+x+","+y+") 반지름"+r;
//    }

    public boolean equals(Circle b){
        if(x==b.x&& y==b.y)
            return true;
        else
            return false;
    }
}