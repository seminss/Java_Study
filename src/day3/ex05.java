package day3;

//ex5 클래스를 통해 다음과 같은 결과가 될 수 있도록 Calc 클래스를 작성하시
//        오. Calc에는 setValue(), result(), add(), sub(), mul(), div()를 포함해야 한다.

public class ex05 {
    public static void main(String args[]){
        Calc c=new Calc();
        c.setValue(2,5,'+');
        c.result();
        c.setValue(2,3,'$');
        c.result();
        c.setValue(2,5,'-');
        c.result();
        c.setValue(2,5,'*');
        c.result();
        c.setValue(2,5,'/');
        c.result();
    }
}
class Calc{
    private int n1, n2;
    private char sign;

    public void setValue(int a, int b, char s){
        n1=a;
        n2=b;
        sign=s;
    }
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public void result(){
        switch(sign){
            case '+':
                System.out.println("result = "+add(n1,n2));
                break;
            case '-':
                System.out.println("result = "+sub(n1,n2));
                break;
            case '*':
                System.out.println("result = "+mul(n1,n2));
                break;
            case '/':
                System.out.println("result = "+div(n1,n2));
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
        }
    }
}