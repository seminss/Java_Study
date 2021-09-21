package day2;

//다음과 같은 재귀함수에 대해 별도의 메소드에 구현하고
//        이에 따라 보기와 같이 출력되도록 프로그램을 작성하시오.
//        f(0) = 1
//        f(n) = 2f(n-1) +1

public class ex05 {
    public static void main(String[] args){
        for(int i=0;i<=5;++i){
            System.out.println("f("+i+")="+Func(i));
        }
    }
    public static int Func(int n){
        if(n==0)
            return 1;
        else
            return 2*Func(n-1)+1;
    }
}
