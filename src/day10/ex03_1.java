package day10;

import java.util.SortedSet;
import java.util.TreeSet;

public class ex03_1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        SortedSet subset;

        set.add(80);
        set.add(100);
        set.add(70);
        set.add(85);
        set.add(98);
        set.add(83);

        System.out.println("가장 낮은 점수 : "+set.first());
        System.out.println("가장 높은 점수 : "+set.last());
        System.out.println("90점 아래 점수 : "+set.lower(90));
        System.out.println("90점 위 점수 : "+set.higher(90));
        System.out.println("70점부터 90점 사이 점수 : "+set.subSet(70,90));
        System.out.println("85점 까지의 점수 : "+set.headSet(85));
        System.out.println("85점 이상의 점수 : "+set.tailSet(85));
    }
}