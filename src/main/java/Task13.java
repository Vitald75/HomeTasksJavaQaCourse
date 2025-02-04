import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Task13 {
    public static void main(String[] args) {
        int year1 = 2025;
        int month1 = 5;
        int day1 = 28;

        // two ways to initiate the first date
        LocalDate date1 = LocalDate.parse("2024-12-28");
        //LocalDate date1 = LocalDate.of(year1, month1, day1);

        LocalDate date2 = date1.plusWeeks(1);  // create the second date date1 + 1 week
        int day2 = date2.getDayOfMonth(); // get the second day

        String month1Text = date1.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
        String month2Text = date2.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));

        System.out.println(day1 + " " + month1Text + " - " + day2 + " " + month2Text);


    }
}
