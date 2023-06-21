package basics;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast {

    public static void main(String[] args) {

//        Concurrent Modification Exception Example on Map
        Map<String,Integer> map = new HashMap<>();

        map.put("Sarfraz",1);
        map.put("Akhil",2);
        map.put("Abhishek",3);

    /*    for(Map.Entry<String,Integer> item: map.entrySet()){
            map.put("Mohak",4);
        }*/
        System.out.println(map.get("Mohak"));
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

//      Concurrent Modification Exception Example on List
       /* List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int item:list){
            list.add(6);
        }*/
    }
}


