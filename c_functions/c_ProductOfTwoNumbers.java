package c_functions;

import java.util.Scanner;

public class c_ProductOfTwoNumbers {
    public static int Product(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int product = Product(x, y);
        System.out.println("product is "+product);
        input.close();
    }
}
