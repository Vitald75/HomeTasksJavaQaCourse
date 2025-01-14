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

        // Task 7. Print array in revers order
        //printReversOrderArray();

        // Task 8. Find first two palindroms
        //findPalindrom();




    }

    //-------------------------------------------------------
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

    //-------------------------------------------------------
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

    //-------------------------------------------------------
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

    //-------------------------------------------------------
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

    //-------------------------------------------------------
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

    //-------------------------------------------------------
    // Task 7. Print array in revers order
    public static void printReversOrderArray(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Default array is: " + Arrays.toString(array));

        int[] reverseArray = Arrays.copyOf(array, array.length);
        for (int i=0; i < array.length; i++) {
            reverseArray[i] = array[array.length -1 - i];
        }
        System.out.println("Reversed array is: " + Arrays.toString(reverseArray));
    }

    //-------------------------------------------------------
    // Task 8. Find first two palindroms
    public static char[] reverseCharArray(char[] array){
        char[] reversedArray = Arrays.copyOf(array, array.length);
        for (int i=0; i < array.length; i++) {
            reversedArray[i] = array[array.length -1 - i];
        }
        return reversedArray;
    }

    public static void findPalindrom(){
        int[] array = {1, 21, 35, 44, 515, 166661, 6};
        int flag = 0;

        for (int i : array) {
            String numberInString = Integer.toString(i);
            char[] numberInArrayOfChars = numberInString.toCharArray(); // convert number into array of chars
            char[] reversedNumberInArrayOfChars = reverseCharArray(numberInArrayOfChars); // inverse array of chars
            boolean b = Arrays.equals(numberInArrayOfChars, reversedNumberInArrayOfChars); // compare two arrays
            if (b) {
                System.out.println( i + " is a palindrom");
                flag ++;
            }
            if (flag > 1) {
                break;
            }
        }
    }

    //-------------------------------------------------------
    // Task 9. Find first two palindroms
    public static void sortByNumbersLength(){
        int[] array = {1, 21, 35, 44, 515, 166661, 6};

    }



}
