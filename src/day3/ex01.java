package day3;

public class ex01 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
class TV{
    private String company;
    private int year, inch;

    public TV(String a, int b, int c) {
        company = a;
        year = b;
        inch = c;
    }
    public void show(){
        System.out.println(company+"에서 만든 "+year+"년형 "+inch+"인치 TV");
    }
}