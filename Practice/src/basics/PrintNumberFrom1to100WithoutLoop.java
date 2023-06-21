package basics;

public class PrintNumberFrom1to100WithoutLoop {
    public static void main(String[] args) {
        printNumbers(10);

    }
    static void printNumbers(int number){
        if(number>0){
            printNumbers(number-1);
            System.out.print(number + " ");
        }
    }
}
