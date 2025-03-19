package a_basics;
import java.util.*;

public class c_conditions {
    public static void main (String []args){
        System.out.println("enter your marks");
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        if(marks>90 && marks<=100){
            System.out.println("your grade is A+, baap sabashi dega");
        }
        else if(marks>80 && marks<=90){
            System.out.println("your grade is A, ghar me shanti rahegi");
        }
        else if(marks>70 && marks<=80){
            System.out.println("your grade is B+, baap daatega");
        }
        else if(marks>60 && marks<=70){
            System.out.println("your grade is B, baap maarega, aur mummy bacha legi");
        }
        else if(marks>50 && marks<=60){
            System.out.println("your grade is C, maa aur baap dono maarenge");
        }
        else if(marks>40 && marks<=50){
            System.out.println("your grade is D, ghar chor de");
        }
        else if(marks<30 && marks>0){
            System.out.println("your grade is F, beta, seher hi chor de");
        }
        else{
            System.out.println("invalid input, marks toh sahi se daal le");
        }

        input.close();
    }
    
}
