public class Main {
    public static void main(String[] args) {
        // main method for running home tasks

        // Task 1. Get factorial
       /* for (int i = -1; i<=12; i++) {
            getFactorial(i);
        }
        */

        // Task 2. Sum all number's digits.
        getSumAllDigits(54);

    }

    // Task 1. Get factorial
    public static void getFactorial(int number) {
        if (number < 0) {
            System.out.println("Incorrect value " + number + ". It's impossible to calculate !(" + number + ")");
        } else {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println(number + "! = " + result);
        }
    }


    // Task 2. Sum all number's digits.
    public static void getSumAllDigits(int number) {
        int initialNumber = number;
        number = Math.abs(number); // in case if the number is negative
        int sum = 0;
        int mod = number % 10;
        sum += mod;

        while ((number /= 10) > 0) {
            mod = number % 10;
            sum += mod;
        }
        System.out.println("Sum of all digits " + initialNumber + " = " + sum);
    }
}
