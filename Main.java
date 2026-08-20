import java.util.Scanner; // For user input
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        String cellPhoneNumber;
        String userLogin;
        String passwordLogin;
        String firstname;
        String lastname;

        // users enter their usernames
        while (true) {
            System.out.print("Create a username (must contain '_' and be max 5 characters): ");
            username = scanner.next();
            if (username.length() <= 5 && username.contains("_")) {

                System.out.println("username captured");
                break;

            } else {

                System.out.println("Username is not correctly formatted. It must contain an underscore (_) and be no more than five characters.");

            }
        }

        
