package day2;

//1~100까지 반복문을 실행할 때,
//        8 또는 9의 배수의 수가 각각 몇 개인지 카운트를 하고
//        동시에 8과 9의 배수일 때에 카운트 없이 반복문을 끝내도록 한다.
//        아래와 같이 출력이 되도록 프로그램을 작성하시오.

public class ex01 {
    public static void main(String[] args){
        int cnt1=0,cnt2=0;
        for(int i=1;i<100;i++) {
            if ((i % 8 == 0) && (i % 9 == 0))
                break;
            else if (i % 8 == 0)
                cnt1++;
            else if (i % 9 == 0)
                cnt2++;
        }
        System.out.println("8의 배수 :"+cnt1+"개");
        System.out.println("9의 배수 :"+cnt2+"개");
    }
}
