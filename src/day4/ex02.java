package day4;

//환율1달러 : 1121.0
//        백만원은 $892.0606601248885입니다.
//        $120는 134520.0원 입니다.

public class ex02 {
    public static void main(String[] args){
        CurrencyConverter.setRate(1121);
        System.out.println("환율1달러 : "+CurrencyConverter.getRate());
        System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다.");
        System.out.println("$120는"+CurrencyConverter.toKW(120)+"원 입니다.");
    }
}
class CurrencyConverter{
    private static double exRate;
    public static void setRate(int num){
        exRate=num;
    }
   public  static double getRate(){
        return exRate;
    }
    public  static double toDollar(int won){ //달러로 환산
        return won/exRate;
    }
   public  static double toKW(int dollar){//원으로 환산
        return dollar*exRate;
    }
}