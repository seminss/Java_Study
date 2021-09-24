package day5;
import java.util.Scanner;

//다음과 같은 Dictionary 클래스가 있다. kor2Eng() 메소드는 한글 단어에 대한
//        영문을 찾는 메소드이다.
//        실행결과와 같이 작동하도록 Dictionary 클래스와 Ex2 클래스를 작성하시오.

public class ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("한글 단어?");
            String text=sc.nextLine();
            if(text.equals("그만")){
                sc.close();
                break;
            }
            String eng=Dictionary.kor2Eng(text);
            if(eng==null)
                System.out.println(text+"는 저의 사전에 없습니다.");
            else
                System.out.println(eng);
        }
    }
}
class Dictionary{
    private static String [] kor={"사랑","아기","돈","미래","희망"};
    private static String [] eng={"love","baby","money","future","hope"};

    //한글 단어에 대한 영문을 찾는 메소드
    public static String kor2Eng(String word) {
        for (int i = 0; i < 5; i++) {
            if (kor[i].equals(word))
                return eng[i];
        }
        return null;
    }
}