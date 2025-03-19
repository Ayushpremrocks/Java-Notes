package a_basics;
import java.util.*;
public class b_scanner {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);

        //to input single word
        System.out.println("enter you name");
        String name = input.next();
        System.out.println("your name is "+name);

        //to input multiple words
        input.nextLine();
        System.out.println("enter your full name");
        String full_name = input.nextLine();
        System.out.println("your full name is "+full_name);

        //to input integer
        System.out.println("enter your age");
        int age = input.nextInt();
        System.out.println("your age is "+age);

        //to input float
        System.out.println("enter your CGPA");
        float CGPA = input.nextFloat();
        System.out.println("your CGPA is "+ CGPA);

        input.close();
    }
}
