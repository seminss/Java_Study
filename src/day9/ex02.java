package day9;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;
class PairGen<K, V>{
    private K key;
    private V value;

    public PairGen(K k, V v){
        key=k;
        value=v;
    }
    public K kGet(){
        return key;
    }
    public V vGet(){
        return value;
    }
}
class CompareGen{
    public static <K,V> boolean compare (PairGen<K,V> p1, PairGen<K,V> p2){
        if(p1.kGet()==p2.kGet()&&p1.vGet()==p2.vGet()){
            return true;
        }
        else return false;
    }
}
public class ex02 {
    public static void main(String[] args){
        PairGen<String, Integer> p1=new PairGen<>("Apple",3);
        PairGen<String, Integer> p2=new PairGen<>("Apple",3);
        System.out.println(CompareGen.compare(p1,p2));

        PairGen<String, String> p3 =new PairGen<>("객체지향","Java");
        PairGen<String, String> p4=new PairGen<>("객체지향","C++");
        System.out.println(CompareGen.compare(p3,p4));
    }
}
