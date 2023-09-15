package week2.joe;

public class minMax {
    public static void main(String[] args) {
        //create an random array of 10 integers
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            //generate a random number between 0 and 100
            array[i] = (int) (Math.random() * 100);
        }
        //print the array
        System.out.println("The array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //print the min and max
        System.out.println("The min is: " + min(array));
        System.out.println("The max is: " + max(array));

    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] < min)
                min = array[i];
        return min;
    }
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }
}
