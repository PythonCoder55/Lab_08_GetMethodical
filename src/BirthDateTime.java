import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dayHigh = 31;

        int year = SafeInput.getRangedInt(in, "Please enter the year of your birth", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Please enter the month of your birth", 1, 12);

        switch (month) {
            case 2: // February
                dayHigh = 29;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                dayHigh = 30;
                break;
            default:
                break;
        }

        int day = SafeInput.getRangedInt(in, "Please enter the day of your birth: ", 1, dayHigh); // Assume maximum days initially
        int hours = SafeInput.getRangedInt(in, "Please enter the hours of your birth", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Please enter the minutes of your birth", 1, 59);

        System.out.println("Date and Time of Birth: " + day + "-" + month + "-" + year + " at " + hours + " hours and " + minutes + " minutes");
    }
}
