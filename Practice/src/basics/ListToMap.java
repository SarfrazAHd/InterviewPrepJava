package basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(12,3,4,5,6,64,73,17,31,8,13);
//        Map<Integer,Integer> map = list.stream().collect(Collectors.toMap(Integer::intValue,Integer::intValue));
//        System.out.println(map);


//        Shift elements of array to right
        int [] arr = new int[] {12,3,0,0,64,0,17,31,8,13};
        arr  =shiftElementToRight(arr);
        Arrays.stream(arr).forEach(i-> System.out.print(i + " "));
    }
    static int[] shiftElementToRight(int [] arr){
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index+=1;
            }
        }

        for (int j=index;j< arr.length;j++){
            arr[j]=0;
        }
        return  arr;
    }
}
