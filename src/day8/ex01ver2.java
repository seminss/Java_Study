package day8;
import java.util.StringTokenizer;

public class ex01ver2 {
    public static void main(String[] args){
        String s1="동해물과 백두산이 마르고 닳도록";
        String s2="2020/11/03";
        String s3="2020년11월03일";

        StringTokenizer st1 = new StringTokenizer(s1," ");
        StringTokenizer st2 = new StringTokenizer(s2,"/");
        StringTokenizer st3 = new StringTokenizer(s3,"년월일");

        System.out.println("s1 count:"+st1.countTokens());
        int i=1;
        while(st1.hasMoreTokens()){
            String token=st1.nextToken();
            System.out.println(i+" : "+token);
            i++;
        }

        System.out.println(""); i=1;
        System.out.println("s2 count:"+st2.countTokens());
        while(st2.hasMoreTokens()){
            String token=st2.nextToken();
            System.out.println(i+" : "+token);
            i++;
        }

        System.out.println(""); i=1;
        System.out.println("s3 count:"+st3.countTokens());
        while(st3.hasMoreTokens()){
            String token=st3.nextToken();
            System.out.println(i+" : "+token);
            i++;
        }
    }
}
