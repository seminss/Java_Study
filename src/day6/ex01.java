package day6;
//Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.
//        다음 Ex1 클래스에서 main() 메소드를 포함하여 실행 결과와 같이 출력되게 하라.

class Point{
    private int x,y;

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public int getX() {return x;}
    public int getY() {return y;}
    protected void move(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class ColorPoint extends Point {
    private String color;
    public ColorPoint(int x, int y, String c){
        super(x, y);
        this.color=c;
    }
    public void setXY(int x, int y){
        move(x,y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return color+"색의 ("+getX()+","+getY()+")의 점";
    }
}
public class ex01 {
    public static void main(String[] args){
        ColorPoint cp=new ColorPoint(5,5,"Yellow");
        cp.setXY(10,20);
        cp.setColor("Red");
        String str=cp.toString();
        System.out.println(str+"입니다.");
    }
}
