package Interview;

import com.sun.jdi.IntegerValue;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Myntra {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1200);
        map.put("B", 800);
        map.put("C", 1650);
        map.put("D", 7400);
        map.put("E", 8200);

        Map.Entry<String, Integer> result = getNthHighestSalaryFromMap(map, 2);
        System.out.println(result);


//        Map<String, Integer> map2 = new HashMap<>();
//        map2.put("A", 1200);`
//        map2.put("B", 800);
//        map2.put("C", 1650);
//        map2.put("D", 7400);
//        map2.put("E", 8200);
//        map2.put("F", 1200);
//        map2.put("G", 1200);
//        map2.put("H", 1650);
//        map2.put("I", 7400);
//        map2.put("J", 8200);
//        /*Map.Entry<String,Integer>*/


    }
    private static Map.Entry<String, Integer> getNthHighestSalaryFromMap(Map<String, Integer> map, int n) {
       return map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue,Collections.reverseOrder())).collect(Collectors.toList()).get(n - 1);
    }
}
