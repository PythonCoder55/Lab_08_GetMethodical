import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Please enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + ssn);

        String mNumber = SafeInput.getRegExString(in, "Please enter your UC Student M number", "^(M|m)\\d{5}$");
        System.out.println("UC Student M number: " + mNumber);

        String menuChoice = SafeInput.getRegExString(in, "Please enter your menu choice", "^[OoSsVvQq]$");
        System.out.println("Menu choice: " + menuChoice);
    }
}
