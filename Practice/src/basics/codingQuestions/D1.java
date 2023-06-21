package basics.codingQuestions;

public class D1 {
    public static void main(String[] args) {

//        reverseString("hello World");
//        factorial(10);
//        swapTwoNumbers(6,4);
//        checIfVowelPresentInString("welcome");
//        System.out.println(checkIfNumberIsPrime(21));
        System.out.println(printPrimeNumbers(50));

    }

    static void reverseString(String str) {

        StringBuffer sbr = new StringBuffer(str);
        System.out.println(" String buffer : " + sbr.reverse());


        StringBuffer sbldr = new StringBuffer(str);
        System.out.println(" String builder : " + sbldr.reverse());


        String[] arr = str.split("");
        String reversedString = "";

        StringBuffer sbr2 = new StringBuffer();

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedString += arr[i];
            sbr2.append(arr[i]);
        }
        System.out.println(" Using custom logic ::" + reversedString);
        System.out.println(" sbr2 : " + sbr2.toString());
    }

    static void factorial(int number) {

        int factorial = 1;
        for (int i = number; i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("facotiral of " + number + " :: " + factorial);
    }

    static void swapTwoNumbers(int num1, int num2) {
        System.out.println("before swap, num1 : " + num1);
        System.out.println("before swap, num2 : " + num2);

        int sum = num1 + num2;
        num1 = sum - num1;
        num2 = sum - num2;
/*
        Traditional Tareeqa
        int temp = num1;
        num1 = num2;
        num2= temp;
*/
        System.out.println("After swap, num1 : " + num1);
        System.out.println("After swap, num2 : " + num2);
    }


    static void checIfVowelPresentInString(String str) {
        System.out.println(str.toLowerCase().matches(".*[aeiou].*"));
    }

    static boolean checkIfNumberIsPrime(int number) {
        if (number == 1 || number == 0) {
            System.out.println("0 and  1 are not prime numbers");
            return false;
        } else if (number == 2) {
            System.out.println("2 is a Prime Number");
            return true;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println("not a prime number");
                    return false;
                }
            }
        }
        System.out.println(number + " is a prime number");
        return true;
    }

    static String printPrimeNumbers(int numbers){

        String primeNumbers = "";

        for(int i=1;i<=numbers;i++){

            int counter = 0;
            for(int j=i;j>=1;j--){
                if(i%j==0){
                    counter+=1;
                }
            }
            if(counter==2){
                primeNumbers+=" "+ i;
            }
        }
        return primeNumbers;
    }
}
