package day8;
import java.util.StringTokenizer;

//다음 s1, s2, s3 문자열에 대해 토큰을 분리하고 각 토큰을 결과와 같이 출력하라.

public class ex01 {
    public static void main(String[] args){
        String s1="동해물과 백두산이 마르고 닳도록";
        String s2="2020/11/03";
        String s3="2020년11월03일";

        StringTokenizer st1 = new StringTokenizer(s1," ");
        StringTokenizer st2 = new StringTokenizer(s2,"/");
        StringTokenizer st3 = new StringTokenizer(s3,"년월일");

        //왠지는 모르겠는데 이렇게 정의를 안하면 for문 출력이 제대로 안된다,,? 왤까
        int ct1 = st1.countTokens();
        int ct2 = st2.countTokens();
        int ct3 = st3.countTokens();

        System.out.println("s1 count:"+ct1);
        for(int i=0;i<ct1;i++){
            String token=st1.nextToken();
            System.out.println(i+" : "+token);
        }
        System.out.println("");
        System.out.println("s2 count:"+ct2);
        for(int i=0;i<ct2;i++){
            String token=st2.nextToken();
            System.out.println(i+" : "+token);
        }
        System.out.println("");
        System.out.println("s3 count:"+ct3);
        for(int i=0;i<ct3;i++){
            String token=st3.nextToken();
            System.out.println(i+" : "+token);
        }
    }
}
