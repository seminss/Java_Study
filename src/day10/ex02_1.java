package day10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ex02_1 {
    public static void main(String[] args){
        Set<Integer> A = new HashSet<>((Arrays.asList(1,2,3,4,5)));
        Set<Integer> B = new HashSet<>((Arrays.asList(2,4,6,8,10)));
        Set<Integer> C = new HashSet<>((Arrays.asList(2,3,5,7,11)));
        Set<Integer> D = new HashSet<>((Arrays.asList(1,3,5,7,9)));

        System.out.println("A = "+A);
        System.out.println("B = "+B);
        System.out.println("C = "+C);
        System.out.println("D = "+D);

        //ArrayList의 출력 / addAll()/ removeAll()/ retainAll()
        //https://jishushu.tistory.com/17
        A.removeAll(B); // 차집합
        System.out.println("A - B = "+A);
        C.retainAll(D); //교집합
        System.out.println("C - D = "+C);
        A.addAll(C); //합집합
        System.out.println("(A - B) U (C - D) = "+A);
    }
}
