package h_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElement {
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        int [] a = new int[5];
        System.out.println("enter no of elements");
        int n = in.nextInt();
        System.out.println("enter your array");
        for(int i = 0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("array before swapping");
        System.out.println(Arrays.toString(a));

        System.out.println("enter the positions you want to swap");
        int x = in.nextInt();
        int y = in.nextInt();
        swapElement(a, x, y);
        System.out.println("enter after swapping is");
        System.out.println(Arrays.toString(a));
        in.close();
    }

    static void swapElement(int [] array,int a,int b){
        int temp = array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}
