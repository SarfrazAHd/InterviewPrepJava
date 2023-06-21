package basics.codingQuestions;

import java.io.IOException;
import java.util.*;

public class D2 {


    public static void main(String[] args) throws IOException {

        int number = 10;
        for(int i=0;i<=number;i++){
            System.out.print(fibonacciUsingRecusrion(i) + " ");
        }

        allOddNumbersInList();


        String str = "appppag";
        System.out.println(new StringBuffer(str).reverse().toString().equals(str));


        reverseLinkedList();

        checkIfTwoArraysAreSame();

        sortHashMapByValue();

        stringImmutability();

        tryCatch();
    }

    static int fibonacciUsingRecusrion(int number){
        if(number<=1) return number;
        return fibonacciUsingRecusrion(number-1) + fibonacciUsingRecusrion(number-2);
    }


    static void allOddNumbersInList(){
        List<Integer> list = Arrays.asList(1,3,5,7);
        boolean result = list.stream().allMatch(i->i%2!=0);
        System.out.println(result);
    }

    static void reverseLinkedList(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(3);linkedList.add(2);linkedList.add(1);

        LinkedList<Integer> reversedLinkedList = new LinkedList<>();

        linkedList.descendingIterator().forEachRemaining(reversedLinkedList::add);
        System.out.println(reversedLinkedList);
    }
    static void checkIfTwoArraysAreSame(){
        int arr1 [] = new int []{1,2,3};
        int arr2 [] = new int [] {2,1,3};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println( Arrays.equals(arr1,arr2));
//        System.out.println(arr1.equals(arr2));
    }

    static void sortHashMapByValue(){
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("SA",35);
        map.put("WS",27);
        map.put("HS",30);
        map.put("MH",21);

//        map.entrySet().stream().sorted((s1,s2)->{
//            return s1.getValue().compareTo(s2.getValue());
//        }).forEach(System.out::println);

        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out::println);
    }


    static void stringImmutability(){
        String s1 = "Java";
        String s2 = s1;

        System.out.println(s1==s2);
        s1= "Python";
        System.out.println(s1==s2);
        System.out.println("s1 "+ s1 +" || s2 "+s2);
    }

    static void tryCatch() throws IOException {
        try{
            throw new IOException("Hello");
        }
        catch (/*IOException |*/ Exception e){
            System.out.println(e.getMessage());
        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }


    }

}
