package day1;

//12를 10진수, 8진수, 16진수로 정의하여 출력하고,
//        그 합과 평균을 출력하시오.
//        단, 아래 출력과 같이 정렬을 맞추시오.

public class ex05 {
    public static void main(String[] args){
        System.out.println("10진수 12\t:"+12);
        System.out.println("8진수 12\t\t:"+012);
        System.out.println("16진수 12\t:"+0x12);
        System.out.println("Sum\t\t\t:"+(12+012+0x12));
        System.out.println("Average\t\t:"+(12+012+0x12)/3);
    }
}
