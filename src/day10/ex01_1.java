package day10;

import java.util.*;

public class ex01_1 {
    public static void main(String[] args){
        List<Person> list=new ArrayList<>();
        list.add(new Person("Yoon",23));
        list.add(new Person("Hong",53));
        list.add(new Person("Kim",37));
        list.add(new Person("Park",67));
        list.add(new Person("Lee",15));

        Collections.sort(list);
        Iterator<Person> itr=list.iterator();

        System.out.println("*** 나이순 정렬 ***");
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }

        Collections.sort(list, new PComparator());
        System.out.println("*** 이름순 정렬 ***");
        itr=list.iterator(); //반복자 다시 획득
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
;    }
}
public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age){
        this.name=name; this.age=age;
    }
    public String toString(){return name+":"+age;}

    @Override
    public int compareTo(Person o) {
        //자신의 age가 o의 age보다 크다면 양수 반환, 같다면 0, 작으면 음수
        return this.age-o.age;
    }
}
class PComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}