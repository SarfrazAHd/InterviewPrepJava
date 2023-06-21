package basics.codingQuestions;

import java.util.Arrays;

public class D3 {
    public static void main(String[] args) {

        binarySearch(new int[]{4,3,1,2,7,6},5);
        numberReverse(789);
    }

    static void binarySearch(int [] arr, int number){
        Arrays.sort(arr);

        int begin = 0;
        int last = arr.length -1;
        int mid = last/2;

        while (begin <= last) {
            if (arr[mid] == number) {
                System.out.println("found : " + arr[mid] + "at index " + mid);
                break;
            } else if (number > arr[mid]) {
                begin = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = (begin + last) / 2;
            if (begin > last) {
                System.out.println("No Element found");
            }
        }
    }

    static void numberReverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        System.out.println("reversedNumber : " + reversedNumber);
    }
}
