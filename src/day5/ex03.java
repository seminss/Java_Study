package day5;
import java.util.Scanner;

//하루의 할 일을 표현하는 클래스 Day는 다음과 같다. 한 달의 할 일을 표현하는
//        MonthSchecule 클래스를 작성하시오

class Day{
    private String work;
    public void set(String work){ this.work=work; }
    public String get() { return work; }
    public void show(){
        if(work==null) System.out.println("없습니다.");
        else System.out.println(work+"입니다."); }
}
class MonthSchedule{
    private Scanner sc=new Scanner(System.in);;
    private int nDays;
    private Day[] days;

    public MonthSchedule(int nDays){
        this.nDays=nDays;
        this.days=new Day[nDays];
        for(int i=0;i<nDays;i++){
            days[i]=new Day();
        }
        //sc=new Scanner(System.in);
    }

    public void input(){
        System.out.print("날짜(1~30)?");
        int day=sc.nextInt();
        if(day<1||day>nDays){
            System.out.println("날짜를 잘못 입력하셨습니다.");
            return;
        }
        if (this.days[day-1].get()==null) {
            System.out.print("할일(빈칸없이입력)?");
            this.days[day-1].set(sc.next());
        }else{
            System.out.println("할 일이 이미 있습니다.");
        }
    }
    public void view(){
        System.out.print("날짜(1~30)?");
        int day=sc.nextInt();
        if(day<1||day>nDays){
            System.out.println("날짜를 잘못 입력하셨습니다.");
            return;
        }
        System.out.print(day+"의 할 일은 ");
        this.days[day-1].show();
    }
    public void finish(){
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}

public class ex03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        MonthSchedule ms=new MonthSchedule(30);
        System.out.println("*** 이번달 스케쥴 관리 프로그램 ***");
        while(true){
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int menu=scanner.nextInt();
            switch(menu){
                case 1: ms.input();break;
                case 2: ms.view(); break;
                case 3: ms.finish(); return;
                default: System.out.println("잘못입력하셨습니다.");
            }
            System.out.println();
        }
    }
}