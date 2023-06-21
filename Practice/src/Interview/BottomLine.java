package Interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BottomLine {
    public static void main(String[] args) {
/*        shortMapOnValue();
        int[] arr1 = new int[]{5,6,3,4,1};
        int[] arr2 = new int[]{0,10,15,8,2};
        concatTwoArray(arr1,arr2);*/

        List<Integer> list1 = Arrays.asList(5,6,3,4,1);
        List<Integer> list2 = Arrays.asList(0,10,15,8,2);
        System.out.println(concatTwoList(list1,list2));
    }


    static void concatTwoArray(int[] arr1, int[] arr2){
        int[] result = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
        Arrays.stream(result).forEach(System.out::print);
    }

    static List<Integer> concatTwoList(List<Integer>list1 , List<Integer> list2){
        return Stream.concat(list1.stream(),list2.stream()).sorted().collect(Collectors.toList());
    }

    static void shortMapOnValue(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"elephant");
        map.put(2,"cat");
        map.put(3,"ball");
        map.put(4,"apple");

        map.entrySet().stream().sorted((i1,i2)->{
            return i1.getValue().compareTo(i2.getValue());
        }).forEach(System.out::println);

    }

}
