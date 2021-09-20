package day2;

//변수 a는 알파벳 값을 예와 같이 받도록 선언하고 정의한다.
//        (예 : char a = ‘e’)
//        그리고 a의 값을 정의하면 a값에 대해서 보기와 같이 출력한다.
//        변수 a의 값은 매번 프로그램 소스를 통해서 변경하여도
//        그 결과가 보기와 같은 방식으로 출력이 되어야 한다

public class ex03 {
    public static void main(String[] args){
        char a ='k';
        int v='b'-'a'; // 1
        for(int i=a; i>='a'; i=i-v){ //i--
            for(char j='a'; j<=i; j=(char)(j+v)){ //j++
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
