// Array has 5 elements, to cause exception we'll try reach non-existed 6th and 7th index.
public class task11 {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};

        for (int i = 0; i<=6; i++) {
            try {
                System.out.println(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception happened, index " + i + " does not exist in the array.");
            }
        }
        System.out.println("Successfully finished.");
    }
}
