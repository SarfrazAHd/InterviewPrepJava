package basics;

public class methodHiding {
    public static void main(String[] args) {
        A a = new A();
        a.method();

        A b = new B();
        b.method();
    }
}

class A {
     static void method() {
        System.out.println("Super class A..");
    }

}

class B extends A {
    static void method() {
        System.out.println("subsclass extending super class A");
    }
}
