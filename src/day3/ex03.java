package day3;

//다음과 같이 Rectangle 클래스의 멤버를 포함하는 클래스를 작성하시오.
//        주어진 메인함수를 가진 ex3.java 클래스를 이용하여 다음과 같은 결과가
//        나올 수 있어야 한다.
//         int 타입의 x, y, width, height 필드 : 사각형을 구성하는 점과 크기 정보
//         x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
//         int square() : 사각형 넓이 리턴
//         void show() : 사각형의 좌표와 넓이를 화면에 출력
//         boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면
//        true 리턴

public class ex03 {
    public static void main(String args[]){
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);
        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r))
            System.out.println("t는 r을 포함합니다.");
        if(t.contains(s))
            System.out.println("t는 s를 포함합니다.");
    }
}

class Rectangle{
    int x, y, width, height;
    public Rectangle(int rx, int ry, int w, int h){
        x= rx;
        y= ry;
        width=w;
        height=h;
    }

    public int square(){
        return width*height;
    }
    public void show(){
        System.out.println("("+x+","+y+")에서 크키가 "+width+"x"+height+"인 사각형");
    }
    public boolean contains(Rectangle r){
        if(x<r.x&y<r.y&&x+width>r.x+r.width&&y+height>r.y+r.height){
            return true;
        }
        else
            return false;
    }
}