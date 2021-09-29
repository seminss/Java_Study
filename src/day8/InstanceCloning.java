package day8;

import java.util.concurrent.RecursiveAction;

class Point implements Cloneable{ //1. Cloneable 인터페이스 구현
    private int xPos;
    private int yPos;

    public Point(int x, int y){
        xPos=x;
        yPos=y;
    }

    public void showPosition(){
        System.out.printf("[%d, %d]",xPos,yPos);
        System.out.println();
    }

    @Override //2. 오버라이드 해서 public 으로 변환
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
        //반환시 포인터 형으로 변환해서 반환해도 가능
    }
}
public class InstanceCloning {
    public static void main(String[] args){
        Point org=new Point(3,5);
        Point cpy;

        try{ //3. 예외처리
            cpy=(Point)org.clone();
            org.showPosition();
            cpy.showPosition();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}

//@Override
//public Object Clone() throws CloneNotSupportedException{
//    //Object 클래스의 clone 메소드 호출을 통한 복사본 생성
//    Rectangle copy=(Rectangle) super.clone();
//
//    //깊은 복사의 형태로 복사본 완성
//    copy.upperLeft=(Point)upperLeft.clone();
//    copy.lowerRight=(Point)lowerRight.clone();
//
//    //완성된 복사본의 참조 값 반환
//    return copy;
//}