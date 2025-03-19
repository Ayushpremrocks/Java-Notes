package h_arrays;

import java.util.Scanner;

public class MaximumValueArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a = new int[5];
        System.out.println("enter no of elements");
        int n = in.nextInt();
        System.out.println("enter your array");
        for(int i = 0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("max value is "+maxValue(a));
        in.close();
    }

    static int maxValue(int[] array){
        int maxVal = array[0];
        for(int i = 0;i<array.length;i++){
            if(array[i]>array[0]){
                maxVal=array[i];
            }
        }
        return maxVal;
    }
    
}
