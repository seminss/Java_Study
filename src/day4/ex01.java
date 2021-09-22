package day4;

//String text에 “I love you” 값으로 초기화하고 다음 결과와 같이 출력되도록
//        프로그램을 작성하시오.

public class ex01 {
    public static void main(String[] args){
        String text="I love you";
        String front, back;

        do{
            front= text.substring(0,1);
            back=text.substring(1);
            text=back.concat(front);
            System.out.println(text);
        }while(!text.equals("I love you"));
    }
    // 기존 풀이
//    public static void main(String[] args) {
//        String text = "I love you";
//        int len=text.length();
//        for(int i=0;i<len;i++)
//        {
//            String first=text.substring(0,1);
//            String last=text.substring(1);
//            text=last+first;
//            System.out.println(text);
//        }
//    }
}
