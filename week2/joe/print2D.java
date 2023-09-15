package week2.joe;

public class print2D {
    public static void main(String[] args) {
        //create a 3x3 array of random integers
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            //generate a random number between 0 and 100
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        //print the array
        System.out.println("The array is:");
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
        }
    }
}
