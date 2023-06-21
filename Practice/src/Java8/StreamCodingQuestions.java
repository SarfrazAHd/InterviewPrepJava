package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCodingQuestions {
    public static void main(String[] args) {
//        randomNumberInsortedUsingStream(5);
//        System.out.println("Bsic Arithmetic Operation on list");
//        basicOperationOnList(Arrays.asList(4,7,2,45,30,67,90,100));
//        System.out.println("************************************");
//        System.out.println("Bsic Arithmetic Operation on Array");
//        basicOperationOnArray(new int[]{4,7,2,45,30,67,90,100});
//        System.out.println("************************************");
//        System.out.println("Bsic Arithmetic Operation using intStream");
//        basicOperationUsingIntStream(new int[]{4,7,2,45,30,67,90,100});
//        System.out.println("************************************");

//        StreamConcatenationOfList(Arrays.asList(4,7,2,45),Arrays.asList(10,5,15,24));
        StreamConcatenationOfArray(new int[]{4,7,2,45},new int[]{10,5,15,24});
    }

    static void randomNumberInsortedUsingStream(int limit){
        Random rd = new Random();
        rd.ints(limit).sorted().forEach(System.out::println);
    }

    static void basicOperationOnList(List<Integer> list){
        System.out.println("Count " + list.stream().count());
        System.out.println("Sum " +list.stream().mapToInt(i->i).sum());
        System.out.println("max " +list.stream().mapToInt(i->i).max().getAsInt());
        System.out.println("min " +list.stream().mapToInt(i->i).min().getAsInt());
        System.out.println("average " +list.stream().mapToInt(i->i).average().getAsDouble());
    }
    static void basicOperationOnArray(int[] arr){
        System.out.println("Count " + Arrays.stream(arr).count());
        System.out.println("Sum " +  Arrays.stream(arr).sum());
        System.out.println("max " + Arrays.stream(arr).max().getAsInt());
        System.out.println("min " +  Arrays.stream(arr).min().getAsInt());
        System.out.println("average " + Arrays.stream(arr).average().getAsDouble());
    }
    static void basicOperationUsingIntStream(int[] arr ){
        System.out.println("Count " + IntStream.of(arr).count());
        System.out.println("Sum " +    IntStream.of(arr).sum());
        System.out.println("max " +   IntStream.of(arr).max().getAsInt());
        System.out.println("min " +   IntStream.of(arr).min().getAsInt());
        System.out.println("average " +    IntStream.of(arr).average().getAsDouble());
    }

    static void StreamConcatenationOfList(List<Integer> list1, List<Integer> list2){
       List<Integer> result =  Stream.concat(list1.stream(),list2.stream()).sorted().collect(Collectors.toList());
       System.out.printf("result" + result);
    }
    static void StreamConcatenationOfArray(int[] arr1,int []arr2){
        IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().forEach(System.out::println);
    }
}
