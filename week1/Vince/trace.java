package week1.Vince;

public class trace {

    public static void main(String args[]) {
        factorial();
    }

    public static void factorial() {
        int number = 5; // Change this to the number whose factorial you want to calculate
        long factorial = 1;

        // Calculate factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
