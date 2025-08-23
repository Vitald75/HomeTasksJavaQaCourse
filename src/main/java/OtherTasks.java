import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class OtherTasks {

    private int count;
    private String name;

    public static void main(String[] args) {
        task1ConvertStringIntoDigits("12hghd 3hgh 678gf76f8d ");
        System.out.println(alfaTask1("123 234.7456 63 "));

        System.out.println("Результат: " + getSumOfNumbers(99999999999L));

        int[] array = {12, 4, 3, 45, 3, 44, 18, 10, 10, 18 };
        System.out.println(Set.of(convertArrayToSet(array)).toString());
        System.out.println(Arrays.toString(convertArrayToArray(array)));


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

    public static Set<Integer> convertArrayToSet(int[] array) {

        //Arrays.stream(array).filter(el -> el >15).toArray();
                //collect(Collectors.toList().)

        //return Arrays.stream(array).filter(el -> el >15).toArray();

        return Arrays.stream(array)
                .filter(el -> el >15)
                .boxed()
                .collect(Collectors.toSet());
    }

    public static int[] convertArrayToArray(int[] array) {

        System.out.println(Arrays.stream(array)
                .filter(el -> el >15).max());

        Arrays.stream(array)
                .filter(el -> el >15).map(el -> el + 40).forEach(System.out::println);


        return Arrays.stream(array)
                .filter(el -> el >15)
                .distinct()
                .toArray();

    }



}
