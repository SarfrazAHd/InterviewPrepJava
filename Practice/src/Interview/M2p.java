package Interview;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class M2p {
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,4,5,6,2,3,4,5,3,53,64};
        System.out.println(findNumbersOccuredMultipleTimes(arr));

    }

    static List findNumbersOccuredMultipleTimes(int[] arr){
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int item: arr){
            if(map.containsKey(item)) map.put(item,map.get(item)+1);
            else map.put(item,1);
        }
        List<Integer> result = map.entrySet().stream().filter(i->i.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());

//        Occureance of number from a list
//        List list = Arrays.asList(1,2,3,4,5,6,2,3,4,5,3,53,64);
//        System.out.println( list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        return result;
    }
}

