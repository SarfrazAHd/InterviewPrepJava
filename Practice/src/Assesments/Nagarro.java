package Assesments;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Nagarro {
    public static void main(String[] args) {
        String result = TransformString("your_name_seems_quite_funny");
        System.out.println(result);

//        int [][] arr = new int[][]{{78,56,89,12,67},{67,78,84,46,78},{56,89,56,33,91}};
        int[][] arr = new int[][]{{78, 56, 89, 82, 67}, {67, 78, 84, 46, 78}, {56, 89, 56, 33, 91}};
        //[316,273,236]
        int[] total = calculateMarksOfEachStudent(3, 5, arr);
        System.out.println(Arrays.toString(total));
    }

    //    1. Transform the Gieven String as below
//    input             output
//    thisIsAVehicle -> this_is_a_vehile
//    this_is_a_vehile -> thisIsAVehicle
    private static String TransformString(String str) {
        String result = "";
        String[] arr = str.split("");
        if (str.contains("_")) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("_")) {
                    arr[i + 1] = arr[i + 1].toUpperCase();
                }
            }
            result = String.join("", arr).replaceAll("_", "");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[i].toUpperCase())) {
                    arr[i] = "_" + arr[i].toLowerCase();
                }
            }
            result = String.join("", arr);
        }
        return result;
    }


//    Problem 2.
//    input 1 as array Denotes number of student
//    input 2 denote the subject of each student
//    inout 3 - as 2 D Array which indicate marks of each student in each subject

//    Task: task is find the sume of each subbject of each student and return the sume as array
//    Criteria - out of all subject first student having least mark need to ignore that subject,
//    no need to take that in sum.

//    Example
//    input1 - 3,     Students
//    input2 - 5     Subject
//    input3- |78,56,89,12,67|      marks of every student in each subjects.
//            |67,78,84,46,78|
//            |56,89,56,33,91|

//    output  - [290,307,292]

//    Exlplanation - first student got less marks in 4th subject, so we'll ingore that subject for every student

    private static int[] calculateMarksOfEachStudent(int totalStudent, int totalSubjects, int[][] marksOfStudentInEachSubjects) {
        int indexOfMinElement = getIndexOfMinElement(marksOfStudentInEachSubjects[0]);
        int[] result = new int[3];
        //find the min element from the input 3
        // get the index of that
        //place 0 at that index
//        finall calculate sum and return new array

        for (int i = 0; i < marksOfStudentInEachSubjects.length; i++) {
            marksOfStudentInEachSubjects[i][indexOfMinElement] = 0;
            int sum = Arrays.stream(marksOfStudentInEachSubjects[i]).sum();
            result[i] = sum;
        }
        return result;
    }

    static int getIndexOfMinElement(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                index = i;
            }
        }
        return index;
    }
}
