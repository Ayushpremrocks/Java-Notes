package b_loops;
import java.util.*;
public class b_while_loop {
    public static void main (String[]args){
        System.out.println("enter no of elements");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        while(i<n){
            System.out.println(i);
            i++;
        }
        input.close();
    }

    
}
