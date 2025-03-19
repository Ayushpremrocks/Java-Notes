package f_questions;
import java.util.*;
public class d_LargestNo_M2 {
    public static int LargestNo(int a,int b,int c){
        if(a>b){
            return Math.max(a, c);
        }
        else{
            return Math.max(b, c);
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
