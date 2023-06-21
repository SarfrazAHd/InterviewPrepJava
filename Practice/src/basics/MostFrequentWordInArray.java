package basics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentWordInArray {

    public static void main(String[] args) {

        System.out.println(findMostFrequentWordInArray(new String[]{"apple","boy","dog","dog"
        ,"apple","dog"}));

    }

    static String findMostFrequentWordInArray(String[] arr) {

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String str : arr) {
            if (map.containsKey(str)) map.put(str, map.get(str) + 1);
            else map.put(str, 1);
        }

        Integer index = map.values().stream().mapToInt(i -> i).max().getAsInt();

        String result = map.entrySet().stream().filter(i -> i.getValue() == index).map(i -> i.getKey())
                .collect(Collectors.joining());


        return result;
    }
}
