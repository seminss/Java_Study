package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ex01_1 {
    public static void main(String[] args){
        List<Person> list=new ArrayList<>();
        list.add(new Person("Yoon",23));
        list.add(new Person("Hong",53));
        list.add(new Person("Kim",37));
        list.add(new Person("Park",67));
        list.add(new Person("Lee",15));

        Collections.sort(list);
        Iterator<Person> itr=new Iterator<Person>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Person next() {
                return null;
            }
        }
;    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name=name; this.age=age;
    }
    public String toString(){return name+":"+age;}
}