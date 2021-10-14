package day10;

import java.util.*;

public class ex04_1 {
    public static void main(String[] args){
        String[] data={"A","K","A","K","D","A","K","K","K","Z","D"};
        HashMap<String, Integer> map =new HashMap<>();
        map.put("A",0); map.put("D",0);
        map.put("K",0); map.put("Z",0);

        for(int i=0;i<data.length;i++){
            int value=map.get(data[i]);
            map.put(data[i], value+1);
        }
        //Key만 담고 있는 컬렉션 인스턴스 생성하되, sort를 해야 하므로 List에 저장
        List<String> keyList=new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        for (String k: keyList){
            System.out.println(k+":"+map.get(k));
        }
    }
}
