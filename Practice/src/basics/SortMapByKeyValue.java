package basics;

import java.util.LinkedHashMap;
import java.util.Map;

public class SortMapByKeyValue {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();

        map.put("apple","cddgd");
        map.put("zee","zee");
        map.put("dkejher","zee");
        map.put("cjhds","zee");
        map.put("fijoi","zee");
        map.put("lkjkjhs","euyte");
        map.put("werwe","acak");

        //sort by Key
//        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out::println);

        // sort by value
//        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);


        //sorting by value, if two value same then sort by key
        map.entrySet().stream().sorted((m1,m2)->{
            if(m1.getValue().compareTo(m2.getValue())==0){
                return m1.getKey().compareTo(m2.getKey());
            }
            return m1.getValue().compareTo(m2.getValue());
        }).forEach(System.out::println);



    }
}
