package b_loops;
import java.util.*;
public class d_pattern_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input n");
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
