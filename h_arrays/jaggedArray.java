package h_arrays;
import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int[][] jagged = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            jagged[i] = new int[cols];
            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nYour Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
