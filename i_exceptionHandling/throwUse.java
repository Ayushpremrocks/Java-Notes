package i_exceptionHandling;

import java.util.Scanner;

public class throwUse {
    static void checkAge(int age) {
        if (age < 18) {
            throw new RuntimeException("Age is below 18, access denied!");
        } else {
            System.out.println("Welcome to the club!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int n = input.nextInt();
        try{
            checkAge(n);
        }
        catch (Exception e){
            System.out.println("exception found\n" + e.getMessage());
        }
        finally {
            input.close();
        }
    }
}
