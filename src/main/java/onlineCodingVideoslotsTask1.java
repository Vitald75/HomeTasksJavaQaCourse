public class onlineCodingVideoslotsTask1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,28,5};
        int[] array2 = {};
        int[] array3 = {1,6,24,48};

        System.out.println(returnNumberOfValues46(array1));
        System.out.println(returnNumberOfValues46(array2));
        System.out.println(returnNumberOfValues46(array3));

    }

    public static int returnNumberOfValues46(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 4 == 0) {
                counter++;
                continue;
            }
            if (array[i] % 6 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
