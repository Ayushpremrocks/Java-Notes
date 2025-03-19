package f_questions;
import java.util.*;
public class f_CountingOccurences {
    public static void main(String[]agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number:");
        int number = input.nextInt();
        System.out.println("enter the digit you want to search");
        int digit = input.nextInt();
        int output =countOcc(number, digit);
        System.out.println(digit+" comes "+output+" times in "+number);
        input.close();
    }

    public static int countOcc(int n, int x){
        int value=0;
        while(n>0){
            int num=n%10;
            if(num==x){
                value++;
            }
            n=n/10;
        }
        return value;
    }
    
}
