import java.util.Arrays;
 
// Main class
public class arraySorting {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input array
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
 
        // Calling the sort() method present
        // inside Arrays class
        Arrays.sort(arr);
 
        // Printing and display sorted array
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
    }
}