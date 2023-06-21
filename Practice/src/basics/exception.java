package basics;

public class exception {

    public static void main(String[] args){
        tryCatch();
    }
    static void tryCatch() {
        int number=10;
        try{
            number/=0 ;
        }catch(Exception e){
           throw new ArithmeticException(e.getMessage());
        }finally {
            System.out.println("Finally..");
        }
    }
}
