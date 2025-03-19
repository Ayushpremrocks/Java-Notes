package c_functions;

import java.util.Scanner;

public class b_int {
    public static int CalculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first no");
        int x = input.nextInt();
        System.out.println("enter second no");
        int y = input.nextInt();

        int sum = CalculateSum(x, y);
        System.out.println("sum is "+sum);
        input.close();
    }
    
}
