package basics;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonWords {
    public static void main(String[] args) {

        System.out.println(findComonWords("I Love you","Love you too"));
    }


    static String findComonWords(String str1,String  str2){
        Set<String> set1 = Arrays.stream(str1.split(" ")).collect(Collectors.toSet());
        Set<String> set2 = Arrays.stream(str2.split(" ")).collect(Collectors.toSet());
        set1.retainAll(set2);
        return  set1.stream().collect(Collectors.joining(" "));

    }
}
