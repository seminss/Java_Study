package day1;

//다음 정수 int num=3에 대해서 num*15는 45이다. 이를 *연산 대신에
//        비트 쉬프트 연산자와 +,- 연산자의 조합으로 같은 결과가 나오게 계산하여 출력하시오.

public class ex07 {
    public static void main(String[] args){
        int num=3;
//        byte r1=(byte)(num-2);
//        byte r2=(byte)(44);
//        byte r3=(byte)(r1|r2);
//        System.out.println("result : "+r3);
        byte result;
        //num<<4의 결과(왼쪽으로 4칸 shift, 빈칸은 0): 48
        result=(byte)((num<<4)-num);
        System.out.println("result:"+result);
    }
}
