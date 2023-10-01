package week4.Vince;

public class Recursion {
        // Recursive method to fill an array with strings
    public static void fillArray(String[] arr, int index) {
        if (index < arr.length) {
            arr[index] = new String("Element " + (index+1)); // Fill the current index with a string
            fillArray(arr, index + 1); // Recursively fill the next index
        }
    }
    public static void main(String[] args) {
        int size = 3; // The size of the array
        String[] stringArray = new String[size];
        
        fillArray(stringArray, 1); // Start filling the array from index 0
        
        // Print the filled array
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}