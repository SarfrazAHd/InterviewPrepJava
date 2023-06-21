package Assesments;

import java.util.Arrays;

public class Amdocs {

    public static void main(String[] args) {
        int[] arr = new int[]{6, 42, 60, 3, 11, 55, 22, 75, 4, 0};
        int index = findIndex(arr.length, arr, 4, 2, 1);
        System.out.println("index:: "+index);
    }

    private static int findIndex(int lengthOfArray, int[] array, int p, int q, int x) {
        int element = Arrays.stream(array).filter(i -> i % q == x).sorted().skip(p - 1).findFirst().getAsInt();
        System.out.println("element:: "+element);
        for (int i = 0; i < lengthOfArray; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return 0;
    }
}
