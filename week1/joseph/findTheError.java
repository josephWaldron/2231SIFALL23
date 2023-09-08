package week1.joseph;

import java.util.Scanner;

public class findTheError {

    // Method with Scanner Syntax Error
    public static void scannerSyntaxError() {
        Scanner scanner = ;
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
    }

    // Method with if / else Syntax Error
    public static void ifElseSyntaxError() {
        int x = 10;
        int y = 20;

        if (x < y {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is greater than or equal to y");
        }
    }

    // Method with Comparison and Logical Operators Syntax Error
    public static void comparisonOperatorsSyntaxError() {
        int a = 5;
        int b = 7;
        boolean result = a < b && a > b;
        System.out.println("Result: " + result);
    }

    // Method with Switch Statement Syntax Error
    public static void switchSyntaxError() {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
        }
    }

    // Method with Loops Syntax Errors
    public static void loopSyntaxErrors() {
        // Syntax error: Missing initialization part in for loop
        for (; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Syntax error: Incorrect while loop structure
        while (true)
            System.out.println("Hello World");

        // Syntax error: Missing condition in do-while loop
        int j = 0;
        do {
            System.out.println("This will execute once");
        } while ();

        // Syntax error: Missing data type in the for-each loop declaration
        int[] numbers = {1, 2, 3, 4, 5};
        for (number : numbers) {
            System.out.println(number);
        }
    }

    // Method with Method Syntax Error
    public static void methodSyntaxError() {
        int result = addNumbers(5, 3;
        System.out.println("Result: " + result);
    }

    // Syntax error: Missing closing parenthesis and incorrect return type
    public static int addNumbers(int a, int b {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling methods to demonstrate syntax errors
        scannerSyntaxError();
        ifElseSyntaxError();
        comparisonOperatorsSyntaxError();
        switchSyntaxError();
        loopSyntaxErrors();
        methodSyntaxError();
    }
}
