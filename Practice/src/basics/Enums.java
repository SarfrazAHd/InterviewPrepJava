package basics;

import java.util.Arrays;

public class Enums {
    public static void main(String[] args) {

        System.out.println(Animals.CAT.name()==Birds.CAT.name());
        System.out.println(Animals.CAT.name().equals(Birds.CAT.name()));

        System.out.println(Animals.CAT.equals(Birds.CAT));
//        Arrays.stream(Animals.values()).forEach(System.out::println);
    }



}


enum Animals{
    CAT,
    RAT,
    DOG,
    Horse
}
enum Birds{
    CAT,
    RAT,
    DOG,
    Horse
}
