import java.util.Arrays;

public class onlineCoding04 {
    public static void main(String[] args) {
        int[] array = {4, 3, 6, 2, 1, 7, 5, 8};

        for (int i=0; i < array.length; i++) {
            for (int j=i+1; j < array.length; j++) {
                if (array[i]>array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(array));

        int i = 0;
        while (i==array[i]) {
            i++;
        }
        System.out.println("Result is: " + i);

    }

}
