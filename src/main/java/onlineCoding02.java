import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class onlineCoding02 {
    public static void main(String[] args) {
        //String[] a = {"x", "a", "b", "c", "d", "e", "b"};
        int[] a = {11, 1, 4, 5, 8, 7, 6, 4, 11};
        //String[] b = {"z", "b", "x", "c", "v", "b", "a"};
        int[] b = {4, 3, 6, 7, 8, 11};

       // int[] c = getIntersection2(a, b);

        System.out.println(Arrays.toString(getIntersection2(a, b)));

    }

    public static Integer[] getIntersection2(int[] first, int[] second) {
        ArrayList<Integer> resultList = new ArrayList<>();


        for (int el : first) {
            if (! Arrays.stream(second).filter(n -> (n == el)).findFirst().isEmpty()) {
                resultList.add(el);
            }
        }

        //Collections.sort(resultList);
        Integer[] c = resultList.toArray(new Integer[0]);
        int tmp;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    tmp = c[i];
                    c[i] = c[j];
                    c[j] = tmp;
                }
            }
        }

        return c;
    }

    public static <T> T[] getIntersection(T[] first, T[] second) {
        List<T> arrayListFirst = Arrays.stream(first)
                .collect(Collectors.toList());
        List<T> arrayListSecond = Arrays.stream(second)
                .collect(Collectors.toList());
        List<T> resultList = new ArrayList<>();

        for (T el : arrayListFirst) {
            if (arrayListSecond.contains(el)) {
                resultList.add(el);
                arrayListSecond.removeAll(Collections.singleton(el));
            }
        }
        Collections.sort(resultList, new Comparator<T>() {
            public int compare(T o1, T o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        return (T[]) resultList.toArray();
    }

}
