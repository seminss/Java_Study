package day5;
import java.util.Scanner;

class Day{
    private String work;

    public void set(String work){
        this.work=work;
    }
    public String get() {
        return work;
    }
    public void show(){
        if(work==null)
            System.out.println("없습니다.");
        else
            System.out.println(work+"입니다.");
    }
}
class MonthSchedule{
    private Scanner sc;
    private int nDay;
    private Day[] day;

    public MonthSchedule(int n){
        this.nDay=n;
        for(int i=0;i<30;i++){
            day[i]=new Day();
        }
        sc=new Scanner(System.in);
    }

    public void input(){
        int wDay;
        System.out.print("날짜(1~30)? ");
        wDay=sc.nextInt();
        System.out.print("할일(빈칸없이입력)? ");
        day[wDay].set(sc.nextLine());
    }
    public void view(){
        int wDay;
        System.out.print("날짜(1~30)? ");
        wDay=sc.nextInt();
        System.out.print(wDay+"의 할 일은 ");
        day[wDay].show();
    }
    public void finish(){
        System.out.println("프로그램을 종료합니다.");
    }
}

public class ex03 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        MonthSchedule ms=new MonthSchedule(30);
        System.out.println("이번달 스케쥴 관리 프로그램");
        while(true){
            System.out.print("할일(입력:1, 보기:2, 끝내기:3>>");
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