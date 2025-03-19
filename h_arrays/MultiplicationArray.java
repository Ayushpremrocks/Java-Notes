package h_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationArray {
    public static void main(String[] args) {
        int [][] a = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("enter your array");
        for(int i=0;i<a.length;i++){
            {
                for(int j=0;j<a.length;j++){
                    a[i][j]=input.nextInt();
                }
            }
        }
        System.out.println("your array is");
        System.out.println(Arrays.deepToString(a));
        input.close();
    }
    
}
