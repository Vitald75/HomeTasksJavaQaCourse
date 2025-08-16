import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    private enum Seasons {
        WINTER ("Зима"),
        SPRING ("Весна"),
        SUMMER ("Лето"),
        FALL ("Осень");

        private String name;

        Seasons(String s) {
            this.name = s;
        }

        @Override
        public String toString() {
            return "Season{" + super.toString() +
                    " title='" + name + '\'' +
                    '}';
        }

    }

    public static void main(String[] args) {
        // main method for running home tasks

        // Task 1. Get factorial
        for (int i = -1; i<=12; i++) getFactorial(i);

        int[] array = {1,2,3,4,5,6,7,8,9,0};
        //ArrayList<int[]> list = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i : array) numbers.add(i);
        System.out.println(numbers.toString());
        System.out.println(numbers.stream().filter(i -> i!=5).count());
        numbers.stream().filter(i -> i!=5).forEach(System.out::print);



        //Collections.addAll(list, array);

        //System.out.println(Arrays.toString(list));


//        for (Seasons s: Seasons.values()) System.out.println(s.toString());

//        StringBuilder s1 = new StringBuilder("Hello");
//        StringBuilder s2 = s1;
//        s1.append(" world");
//        s2.append(" !");
//
//        System.out.println(s1.toString());
//        System.out.println(s2.toString());


        // Task 2. Sum all number's digits.
        //getSumAllDigits(54);


        // Task 3. Triangle's square.
        //getTriangleSquare(3, 4, 5);

        // Task 4. Return true if sum a+b between 10 and 20, else return false;
        //System.out.println(returnResult(16, 5));

        // Task 5. Transforming an array of 0,1
        //change01Array();

        // Task6.
        //transformArray();

        // Task 7. Print array in revers order
        //printReversOrderArray();

        // Task 8. Find first two palindroms
        //findPalindrom();

        // Task 9. Sort array by length
        //sortArrayByLength();

    }

    //-------------------------------------------------------
    // Task 1. Get factorial
    public static void getFactorial(int number) {
        if (number < 0) {
            System.out.println("Incorrect value " + number + ". It's impossible to calculate !(" + number + ")");
        } else {
            int result = 1; // by default, if number = 0
            for (int i = 1; i <= number; i++) {
                result *= i;   // result = result * i
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
    // Task 4. Return true if sum a+b between 10 and 20, else return false;
    public static boolean returnResult(int a, int b) {
        int sum = a + b;
        boolean cond1 = sum >= 10;
        boolean cond2 = sum <= 20;
        return cond1 && cond2;
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
    // Task 9. Sort array by length
    public static int getLength(int number) {
        return(Integer.toString(number).length());  //return length of number
    }

    public static void sortArrayByLength(){
        //first way - bubblesort
        int[] array = {11014, 2, 35, 44, 515, 166661, 6, 11, 12, 28, 2541};
        boolean isSorted = false;
        System.out.println("Unsorted array:" + Arrays.toString(array));

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (getLength(array[i]) < getLength(array[i - 1])) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println("Sorted by length array:" + Arrays.toString(array));

        //second way
        Integer[] array2 = {11014, 2, 35, 44, 515, 166661, 6, 11, 12, 28, 2541};
        System.out.println("Unsorted array:" + Arrays.toString(array2));

        Arrays.sort(array2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.toString(o1).length() - Integer.toString(o2).length();
            }
        });

        System.out.println("Sorted by length array:" + Arrays.toString(array2));
    }
}

