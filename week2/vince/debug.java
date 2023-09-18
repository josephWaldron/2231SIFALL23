package week2.vince;

public class debug {
    /*
     * This program is supposed to print:
     * cat
     * dog
     * rat
     */
    public static void main(String[] args) {
        // Creating a 2D array of integers
        int[][] matrix = {{99, 97, 116},{114, 97, 116},{100, 111, 103}};

        // First loop tracks which sub-array we're in
        for (int row = 0; row < matrix.length; row++) {

            // Second tracks where in the chosen subarray we are
            for (int col = 0; col < 3; col++) {
                // Type casting to char
                System.out.print((char)matrix[row][col]);
            }
            System.out.println();
        }
    }
}
