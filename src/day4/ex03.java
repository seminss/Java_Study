package day4;

//주어진 text1~text4에 대해 결과와 같은 문장이 되도록 프로그램을 작성하시오.
//        단, StringBuilder, String 클래스의 멤버 메소드를 활용하여 완성하라.
//        We love JAVA programming.

public class ex03 {
    public static void main(String[] args) {
        String text1 = "eW";
        String text2 = "LOVE";
        String text3 = "C++";
        String text4 = "programming.";

        StringBuilder stbuf = new StringBuilder(text1);
        stbuf.reverse();

        stbuf.append(" ").append(text2.toLowerCase());
        //stbuf.append(" ").append(text2);
        //stbuf.replace(3,7,"love");

        stbuf.append(" ").append(text3);
        stbuf.replace(8, 11, "JAVA");

        stbuf.append(" ").append(text4.trim());
        System.out.println(stbuf.toString());
    }
}

