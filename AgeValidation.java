import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        super("Invalid age: Age must be 18 or above");
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Age validation Successfully: ");
        }catch (InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }

    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 18 ){
           throw new InvalidAgeException();
        }
    }

}
