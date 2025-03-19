package b_loops;
import java.util.*;
public class a_for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of integers");
        int n = input.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("sum is "+sum);
        input.close();
    }
    
}
