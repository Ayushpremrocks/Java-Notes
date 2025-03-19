package f_questions;

import java.util.Scanner;

public class g_Reserving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int output = reverseNum(n);
        System.out.println(output);
        input.close();
        
    }

    public static int reverseNum(int number){
        int value=0;
        while(number>0){
            int reminder = number % 10;
            number = number/10;
            value = value*10+reminder;
        }
        return value;
    }   
}