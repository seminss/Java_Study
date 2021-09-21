package day2;

//회문수(palindrome)를 구하는 프로그램을 작성하시오.
//        회문수(palindrome)란, 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말
//        한다. 예를 들면 ‘12321’이나 ‘13531’ 같은 수를 말한다.

public class ex04 {
    public static void main(String[] args){
        int number1=12321, number2=1232, result;

        result=palindrome(number1);
        resultPrint(number1, result);

        result=palindrome(number2);
        resultPrint(number2, result);
    }
    public static void resultPrint(int num1, int num2){
        if(num1==num2)
            System.out.println(num2+"는 회문수 입니다.");
        else
            System.out.println(num2+"는 회문수가 아닙니다.");
    }
    public static int palindrome(int num){
        int result=0;
        while(num>0){
            result=result*10+num%10;
            num=num/10;
        }
        return result;
    }
}
