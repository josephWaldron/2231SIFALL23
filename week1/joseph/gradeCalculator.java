package week1.joseph;
import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        //ask how many quizes and exams
        Scanner input = new Scanner(System.in);
        System.out.print("How many quizes did you have? ");
        int numQuizes = input.nextInt();
        System.out.print("How many exams did you have? ");
        int numExams = input.nextInt();
        //create arrays based on the number of quizes and exams
        int quizScores[] = new int[numQuizes];
        int examScores[] = new int[numExams];
        //ask for the scores
        for(int i = 0; i < numQuizes; i++){
            System.out.print("Enter quiz score " + (i+1) + ": ");
            quizScores[i] = input.nextInt();
        }
        for(int i = 0; i < numExams; i++){
            System.out.print("Enter exam score " + (i+1) + ": ");
            examScores[i] = input.nextInt();
        }
        //calculate the average of the quizes and exams
        double quizAverage = calculateAverage(quizScores);
        System.out.println("Your quiz average is " + quizAverage);
        double examAverage = calculateAverage(examScores);
        System.out.println("Your exam average is " + examAverage);
        //calculate the weighted average
        double weighetedAverage = calculateWeightedAverage(quizAverage, examAverage);
        //print the grade
        if(weighetedAverage >= 90){
            System.out.println("Your grade is an A with a " + weighetedAverage);
        }
        else if(weighetedAverage >= 80){
            System.out.println("Your grade is a B with a " + weighetedAverage);
        }
        else if(weighetedAverage >= 70){
            System.out.println("Your grade is a C with a " + weighetedAverage);
        }
        else if(weighetedAverage >= 60){
            System.out.println("Your grade is a D with a " + weighetedAverage);
        }
        else{
            System.out.println("Your grade is an F with a " + weighetedAverage);
        }
        input.close();
    }
    public static double calculateAverage(int[] scores){
        double sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return sum / scores.length;
    }
    public static double calculateWeightedAverage(double quizAverage, double examAverage){
        return (quizAverage * 0.3) + (examAverage * 0.7);
    }
}  
