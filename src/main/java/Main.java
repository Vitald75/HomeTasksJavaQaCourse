import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // main method for running home tasks

        // Task 1. Get factorial
        //for (int i = -1; i<=12; i++) {
        //    getFactorial(i);
        //}


        // Task 2. Sum all number's digits.
        //getSumAllDigits(54);


        // Task 3. Triangle's square.
        //getTriangleSquare(3, 4, 5);


        // Task 5. Transforming an array of 0,1
        //change01Array();

        // Task6.
        //transformArray();
    }

    // Task 1. Get factorial
    public static void getFactorial(int number) {
        if (number < 0) {
            System.out.println("Incorrect value " + number + ". It's impossible to calculate !(" + number + ")");
        } else {
            int result = 1; // by default, if number = 0
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

    // Task 3. Triangle's square.
    public static void getTriangleSquare(float a, float b, float c) {

        boolean b1 = ((a+b)<= c);
        boolean b2 = ((b+c)<= a);
        boolean b3 = ((c+a)<= b);

        if ( b1 || b2 || b3 ) {
            System.out.println("Values don't create a triangle");
        }
        else
        {
            float p = (a + b + c) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Square = " + s);
        }
    }



    //Task 5. Transforming an array of 0,1
    public static void change01Array(){
        int[] array = {0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1};

        // Print first array
        System.out.println("Default array is:");
        System.out.println(Arrays.toString(array));

        //Transform the array
        for (int i=0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
            else {
                array[i] = 0;
            }
        }

        // Print transformed array
        System.out.println("Transformed array is:");
        System.out.println(Arrays.toString(array));
    }

    // Task 6. Array, less than 6 multiply by 2
    public static void transformArray(){
        int[] array = {1,5,3,2,11,4,5,2,4,8,9,1};
        int[] array2 = Arrays.copyOf(array, array.length);

        for (int i=0; i < array.length; i++) {
            if (array[i]<6) {
                array[i]*=2;
            }
        }
        //Arrays.sort(array);
        System.out.println(Arrays.toString(array2));
        System.out.println("----------------------");
        System.out.println(Arrays.toString(array));
    }

}
