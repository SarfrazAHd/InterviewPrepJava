package basics;

public class B1 {
    int i;
    static int j;
    {
        i = 5;
        System.out.println("instance block 1 , i" + i);
    }
    static {
        System.out.println("Static Block1, j " + j);
        method();
    }
    static void method(){
        System.out.println("static method");
    }
    {

        System.out.println("Instance Block 2 " + j);
    }

    B1(){
        System.out.println("Welcome to the B1");
    }
    static {
        System.out.println("Static Block 2 " + j);
    }
    public static void main(String[] args) {
        B1 b = new B1();
    }
}
