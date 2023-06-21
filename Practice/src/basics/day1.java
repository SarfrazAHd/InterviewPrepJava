package basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class day1 {
    public static void main(String[] args) {

        List list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(getSecondHighest(list));
    }

    private static int getSecondHighest(List<Integer> list){

//        int high=0;
        int secondeHigh=0;
//
//        for(int item: list){
//            if(item > high){
//                secondeHigh = high;
//                high=item;
//            }
//            else if(item>secondeHigh) secondeHigh = item;
//        }
        secondeHigh= list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        return secondeHigh;
    }
}
