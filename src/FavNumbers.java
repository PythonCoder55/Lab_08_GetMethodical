import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favoriteInteger = SafeInput.getInt(in, "Please enter your favorite integer");
        System.out.println("Favorite Integer: " + favoriteInteger);

        double favoriteDouble = SafeInput.getDouble(in, "Please enter your favorite double");
        System.out.println("Favorite Double: " + favoriteDouble);
    }
}
