public class Main {
    public static void main(String[] args) {
        // main method for running home tasks

        // Task 1. Get factorial
        for (int i = -1; i<=12; i++) {
            getFactorial(i);
        }

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

    //

}
