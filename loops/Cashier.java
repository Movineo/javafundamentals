package loops;

import java.util.Scanner;
//for loop is used to repeat a block of code a known number of times
// for loop is a pretest condition loop
public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of times you want to check out: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for (int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item: " );
            double price = scanner.nextDouble();
            total = total + price;
            System.out.println("Total: " + total);
        }
        scanner.close();

    }
    
}
