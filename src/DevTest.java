import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        // I am not running all of these at once because it would take a long time so I am commenting out the ones I am not using
        Scanner pipe = new Scanner(System.in);
//        String input = SafeInput.getNonZeroLenString(pipe, "Please enter your name");
//        System.out.println("Your name is: " + input);

//        int input = SafeInput.getInt(pipe, "Please enter an integer");
//        System.out.println("You entered: " + input);

//        double input = SafeInput.getDouble(pipe, "Please enter a double");
//        System.out.println("You entered: " + input);

//        int input = SafeInput.getRangedInt(pipe, "Please enter an integer within the range", 1, 10);
//        System.out.println("You entered: " + input);

//        double input = SafeInput.getRangedDouble(pipe, "Please enter a double within the range", 1.0, 10.0);
//        System.out.println("You entered: " + input);

//        boolean confirmed = SafeInput.getYNConfirm(pipe, "Please confirm (Y/N) or (y/n)");
//        System.out.println("Confirmed: " + confirmed);

        String input = SafeInput.getRegExString(pipe, "Please enter a string that matches the pattern", "\\d{3}-\\d{3}-\\d{4}");
        System.out.println("You entered: " + input);
    }
}