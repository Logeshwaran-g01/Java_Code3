import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        try {
            int result = divideNumbers (num1 , num1);
            System.out.println("Result of Division: " + result);
        }catch (ArithmeticException e ){
            System.out.println("Error: Division by zero is not allowed");
        }

        scanner.close();
    }

    public static int divideNumbers(int dividend , int divisor){

        if(divisor == 0){
            throw new ArithmeticException("Division by Zero");
        }
        return dividend / divisor;
    }
}
