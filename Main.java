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

        while (true) {
            System.out.print("Create a password (must contain and be at least 8 characters): ");
            password = scanner.next();
            if (checkpassword(password)) {
                System.out.println("password captured");
                break;

            } else {
                System.out.println("password is not correctly formatted.");
            }
        }
        while (true) {
            System.out.print("type in cellphone number (must contain international country code and be max 12 characters): ");
            cellPhoneNumber = scanner.next();
            if (cellPhoneNumber.startsWith("+27")&& cellPhoneNumber.length() <= 12) {

                System.out.println("cell phone number captured");
                break;

            } else {

                System.out.println("Username is not correctly formatted. It must contain an underscore (_) and be no more than five characters.");

            }
        }
    }
    public static boolean checkpassword (String password){

        if (password == null && password.length() >= 8) {
            return false;
        }
        boolean upper = false;
        boolean lower = false;
        boolean special = false;
        boolean digit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper = true;
            } else if (Character.isLowerCase(c)) {
                lower = true;
            }else if (Character.isDigit(c)) {
                    digit = true;
                } else {
                    Pattern specialpattern = Pattern.compile("[^a-zA-Z0-9]");
                    Matcher specialmatcher = specialpattern.matcher(String.valueOf(c));
                    if (specialmatcher.find()) {
                        special = true;
                    }
                }
            }

        return upper && lower && digit && special;
        }
    }
