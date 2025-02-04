// Где Август - любой месяц, 0 - это суммы расходов / доходов.
// Сохранить в переменные значения расходов и доходов, вывести в консоль

public class Task12 {
    public static void main(String[] args) {
        String s = "Август, Сумма расходов равна, 2500 ₽, Сумма доходов равна, 555 ₽";
        String[] array = s.split(" ");  // use " "(space) as delimeter, and get 4th and 9th elements.


        int sum1 = 0;
        int sum2 = 0;
        try {
            sum1 = Integer.parseInt(array[4]);
            sum2 = Integer.parseInt(array[9]);
            System.out.println("Сумма расходов равна:" +sum1+ ".");
            System.out.println("Сумма доходов равна:" +sum2+ ".");

        } catch (NumberFormatException e) {
            System.out.println("Обнаружены нецелочисленные значения");
        }

    }
}
