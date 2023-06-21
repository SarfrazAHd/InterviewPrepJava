package Java8;

import com.sun.jdi.ArrayReference;
import com.sun.security.jgss.GSSUtil;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCodingQuestions2 {
    public static void main(String[] args) {
        charOccurances("ThisisapplTreethatwllincludlotofchararcterandwearegoingtocountit");
        WordOccurances("This is bananana tree with tree of banana is a as formula");
        numberOfOccurances(new int[]{1,2,3,4,5,4,3,2,1,3,4,5,6});

        LowestHighestNumber(2,3,4,5,4,3,2,1,3,4,5,6);
    }

    static void charOccurances(String str){
        Map<String, Long> result = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }

    static void WordOccurances(String str){
        Map<String, Long> result = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }


    static void numberOfOccurances(int[] arr){
        Map<Integer,Integer> result = new HashMap<>();
        for(int i: arr){
            if(result.containsKey(i)) result.put(i,result.get(i)+1);
            else  result.put(i,1);
        }
        System.out.println(result);
    }

    static void LowestHighestNumber(int... arr){
        List list = new ArrayList();
        for(int i: arr){
            list.add(i);
        }
        Optional secondLowest = list.stream().sorted().skip(1).findFirst();
        System.out.println("secondLowest " + secondLowest);
        Optional secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();;
        System.out.println("secondHighest " + secondHighest);
    }


}
