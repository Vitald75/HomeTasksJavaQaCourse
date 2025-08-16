import java.util.Arrays;

public class OtherTasks {
    public static void main(String[] args) {
        task1ConvertStringIntoDigits("12hghd 3hgh 678gf76f8d ");
        System.out.println(alfaTask1("123 234.7456 63 "));


        System.out.println("Результат: " + getSumOfNumbers(99999999999L));


    }

    // Доостать цифры из строки
    public static void task1ConvertStringIntoDigits(String s) {
        String s2 = s.replaceAll("[A-Za-z]|\\s", "");
        char[] array = new char[s2.length()];
        array = s2.toCharArray();
        System.out.println(s2);
        System.out.println(Arrays.toString(array));
    }

    // Преобразовать число из строки с пробелами в Double
    public static Double alfaTask1(String s) {
        Double d = Double.valueOf(s.replaceAll(" ",""));
        return d;

    }

 // с использованием рекурсии
    public static long getSumOfNumbers(long number) {
        if ((number / 10) == 0)
            return number;
        else {
            long sum = 0;
            while (number > 0) {
                sum = sum + (number % 10);
               // System.out.println(number + ", %= " + number % 10 + ",  /=" + number / 10);
                number = (number / 10);
            }
            return getSumOfNumbers(sum);
        }

    }


}
