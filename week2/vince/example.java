package week2.vince;

public class example {
    public static void main(String[] args) {
        // Create a 2D array to store student grades (3 students and 4 subjects)
        int[][] grades = {
            {90, 85, 88, 92},
            {78, 89, 92, 87},
            {85, 76, 80, 91}
        };

        // Parallel array for names of the 3 students
        String[] names = {"Ashley","Chad","Pog"};

        // Calculate and display the average grade for each student
        for (int student = 0; student < grades.length; student++) {
            double average = calculateAverage(grades[student]);
            System.out.println(names[student] + "'s Average Grade: " + average);
        }
    }

    // Method to calculate the average grade for an individual student
    public static double calculateAverage(int[] studentGrades) {
        int sum = 0;
        for (int grade : studentGrades) {
            sum += grade;
        }
        return (double)sum / studentGrades.length;
    }
}
