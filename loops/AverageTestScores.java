package loops;
// nested loops
import java.util.Scanner;
public class AverageTestScores {
    public static void main(String[] args) {
        //initialize what we know
        int numberOfStudents = 40;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //process all students 
        for(int i=0; i< numberOfStudents; i++){

            double total = 0;
            //process students tests
            for(int j=0; j< numberOfTests; j++){
                System.out.println("Score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total= total + score;


            }
            double average = total/ numberOfTests;
            System.out.println("The test average for students #" + (i+1) + " is " + average);


        }
        scanner.close();


    }
    
}
