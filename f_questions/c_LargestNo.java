package f_questions;
import java.util.*;
public class c_LargestNo {
    public static int LargestNo(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter x");
        int x = input.nextInt();
        System.out.println("enter y");
        int y = input.nextInt();
        System.out.println("enter z");
        int z = input.nextInt();
        int Num = LargestNo(x,y,z);
        System.out.println("largest no is "+Num);
        input.close();
    }
}
