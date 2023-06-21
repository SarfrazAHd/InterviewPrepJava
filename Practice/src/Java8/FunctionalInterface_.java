package Java8;


class Main {
    public static void main(String[] args) {
        FunctionalInterface_ fip = (a, b) -> {
            return a * b;
        };
        System.out.println(fip.multiply(10, 20));
        System.out.println(FunctionalInterface_.add(10, 20));
        fip.printName();
    }
}

@FunctionalInterface
interface FunctionalInterface_ {
    abstract int multiply(int a, int b);

    static int add(int a, int b) {
        return a + b;
    }

    default void printName() {
        System.out.println("I'm a default method,of a functional Interface");
    }

}

