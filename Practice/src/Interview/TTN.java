package Interview;

public class TTN {

    public static void main(String[] args) {
   /*     Test test = null;
        test.demo();*/


        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 ="Hello";
        String s4 = "Hello";

        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));

        System.out.println(s3==s4);

        System.out.println(s3.equals(s4));


    }
}
class Test{
    static void demo(){
        System.out.println("Test...");
    }
}