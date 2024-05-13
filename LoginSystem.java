import java.util.Scanner;

public class LoginSystem {

    private static final String CORRECT_PASSWORD = "passcode123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the username: ");
        String username = scanner.nextLine();

        System.out.println("Enter the passcode: ");
        String passcode = scanner.nextLine();

        try {
            login(username, passcode);
            System.out.println("Login Sucessfully");
            // Continue with the rest of your application logic after successful login
        }catch (IncorrectPasswordException e){
            System.out.println("Incorrect password. Please try again.");
        }

        scanner.close();
    }

    public static void login(String username, String passcode) throws IncorrectPasswordException{
        if(!passcode.equals(CORRECT_PASSWORD)){
            // Check if the password matches the correct password
            throw new IncorrectPasswordException();
        }
    }
}
class IncorrectPasswordException extends Exception {

}