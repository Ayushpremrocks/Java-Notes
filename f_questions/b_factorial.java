package f_questions;

import java.util.Scanner;

public class b_factorial {
    public static int factorial(int n){
        if (n<0){
            return -1;
        }
        else{
            int f=1;
            for(int i=n;i>1;i--){
                f = f*i;
            }
            return f;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your no");
        int n = input.nextInt();
        int f = factorial(n);
        if(f==-1){
            System.out.println("your no is not valid");
        }
        else{
            System.out.println("factorial is "+ f);
        }
        input.close();
    }
}
