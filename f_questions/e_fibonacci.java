package f_questions;
import java.util.*;
public class e_fibonacci{
    public static void PrintFibonacciSeries(int n){
        int a=0,b=1,c;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

        }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter n");
        int n = input.nextInt();
        System.out.println("fibonacci series upto "+n+" terms is:");
        PrintFibonacciSeries(n);
        input.close();
    }
}