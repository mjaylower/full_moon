import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Main {
    public static void main(String[] args) {
        // initialize today's date
        LocalDateTime today = LocalDateTime.now();

        // set up the format for dates to be displayed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy hh:mm a");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/d/yyyy");

        // convert date to string
        String textToday2 = today.format(formatter2);

        // initialize the last date of a full moon and format for printing
        LocalDateTime lastFullMoon = LocalDateTime.of(2018, 8, 26, 4, 58);
        String textFirstFullMoon = lastFullMoon.format(formatter);

        // initialize the date for the next full moon by using the .plus method to add days, hours and minutes
        LocalDateTime nextFullMoon = LocalDateTime.of(2018, 8, 26, 4, 58).plusDays(29)
                .plusHours(12)
                .plusMinutes(44);
        // convert new date to string
        String textNextFullMoon = nextFullMoon.format(formatter);

        // establish the length of time from the previous full moon till today
        long daysSinceLastFullMoon = lastFullMoon.until(today, ChronoUnit.DAYS);

        // establish the length of time from today till the next full moon
        long daysToNextFullMoon = today.until(nextFullMoon, ChronoUnit.DAYS);

        // print out all the results from the program
        System.out.println("Today's date is: " + textToday2 + "\n");

        System.out.println("It has been " + daysSinceLastFullMoon + " days since the last full moon,");
        System.out.println("which occurred on: " + textFirstFullMoon + "\n");

        System.out.println("The next full moon will be on: " + textNextFullMoon + ",");
        System.out.println("which is in " + daysToNextFullMoon + " days!");

    }
}