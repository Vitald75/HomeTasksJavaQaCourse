import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OtherTasks {

    private int count;
    private String name;

    public static void main(String[] args) {

        System.out.println(String.format("Потерянное число - %d", getLostNumber(Arrays.asList(1,4,2,5,3),6)));
        task1ConvertStringIntoDigits("12hghd 3hgh 678gf76f8d ");
        System.out.println(alfaTask1("123 234.7456 63 "));

        System.out.println("Результат: " + getSumOfNumbers(99999999999L));

        int [] array = {12, 4, 3, 45, 3, 44, 18, 10, 10, 18 };

        // Удаление дубликатов из массива через Set
//        Integer [] array = {12, 4, 3, 45, 3, 44, 18, 10, 10, 18 };
//        List<Integer> list = Arrays.asList(array);
//        HashSet set = new HashSet<>(list);
//        System.out.println(Set.of(set).toString());


        System.out.println(Set.of(convertArrayToSet(array)).toString());
        System.out.println(Arrays.toString(convertArrayToArray(array)));


        Map<Integer, Integer> originalMap = new HashMap<>();
        originalMap.put(1, 3);
        originalMap.put(2, 1);
        originalMap.put(4, 2);

        Map<Integer, Integer> result = ConvertMap(originalMap);
        System.out.println(result);


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

    public static Map<Integer, Integer> ConvertMap(Map<Integer, Integer> startMap) {
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : startMap.entrySet()) {
            entries.add(new AbstractMap.SimpleEntry<>(entry.getValue(), entry.getKey()));
        }

        // Sort entries by the new key
        entries.sort(Comparator.comparingInt(Map.Entry::getKey));

        // Create a LinkedHashMap to preserve sorted order
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static Integer getLostNumber(List<Integer> numbers, Integer listlength) {

        Collections.sort(numbers);
        int counter = 0;
        for (int el : numbers) {
            if (el != counter) break;
                    else counter++;
        }
        return counter;
    }

}
