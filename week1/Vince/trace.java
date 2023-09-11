package week1.Vince;

public class trace {

    static void listColor() {
        String[] colors = { "Red", "Green", "Blue", "Yellow" };

        // Using a for-each loop to iterate through the array
        for (String color : colors) {
            // Calling a method to process each color
            processColor(color);
        }
    }

    // Method to process colors using a switch statement
    static void processColor(String color) {
        switch (color) {
            case "Red":
                System.out.println("The number is 1.");
                break;
            case "Green":
                System.out.println("The number is 2.");
                break;
            case "Blue":
                System.out.println("The number is 3.");
                break;
            default:
                System.out.println("The number is 4.");
        }
    }

    static void factorial() {
        int number = 5;
        long factorial = 1;

        // Calculate factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("The factorial of " + number + " is " + factorial);
    }

    public static void main(String args[]) {
        factorial();
        listColor();
    }

}
