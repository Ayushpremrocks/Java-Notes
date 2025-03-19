package b_loops;
import java.util.*;
public class c_do_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of elements");
        int n = input.nextInt();
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<n);       
        input.close();
    }
    
}
