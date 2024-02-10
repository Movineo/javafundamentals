package loops;
import java.util.Scanner;
// do while loop is used to execute a block of code at least once, and then repeatedly execute the block as long as the condition is true
// do while is a posttest condition loop
public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("Enter first number: ");
            double num1 =scanner.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();
            System.out.println(" The sum is " + (num1 + num2));

            System.out.println("Would you like to start over again?");
            again = scanner.nextBoolean();


        }while(again);
        scanner.close();
    }
    
}
