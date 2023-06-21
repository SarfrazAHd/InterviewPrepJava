package Java8;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        System.out.println(OptionalMethod());
        System.out.println(NonOptionalMethod());

    }

    static Optional<Integer> OptionalMethod(){
        System.out.println("No NPE");
        Optional<Integer> number = Optional.ofNullable(null);
//        System.out.println(number);
        return number;
    }
    static Optional<Integer> NonOptionalMethod(){
        System.out.println("It will throw NPE");
        Optional<Integer> number = Optional.of(null);
//        System.out.println(number);
        return number;
    }
}


