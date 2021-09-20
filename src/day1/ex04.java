package day1;

//65,367 금액(int money = 65367 )에 대해서 오만원~일원까지 아래와 같이 잔
//        돈을 계산하는 프로그램을 작성하시오. 그리고 아래와 같이 정렬을 맞추시오.

public class ex04 {
    public static void main(String[] args){
        int money = 65367;

        System.out.println("오만원\t:"+money/50000);
        System.out.println("만원\t\t:"+money%50000/10000);
        System.out.println("오천원\t:"+money%50000%10000/5000);
        System.out.println("천원\t\t:"+money%50000%10000%5000/1000);
        System.out.println("오백원\t:"+money%50000%10000%5000%1000/500);
        System.out.println("백원\t\t:"+money%50000%10000%5000%1000%500/100);
        System.out.println("오십원\t:"+money%50000%10000%5000%1000%500%100/50);
        System.out.println("십원\t\t:"+money%50000%10000%5000%1000%500%100%50/10);
        System.out.println("일원\t\t:"+money%50000%10000%5000%1000%500%100%10);
    }
}
