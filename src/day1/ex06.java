package day1;

//byte 타입의 n1에 47과 n2 21을 이진수 값으로 입력하고,
//        이에 대한 &, | 비트 연산의 결과를 보이시오.

public class ex06 {
    public static void main(String[] args){
        byte n1=0B101111;
        byte n2=0B010101;
        System.out.println("& 결과:"+(byte)(n1&n2));
        System.out.println("| 결과:"+(byte)(n1|n2));
    }
}
