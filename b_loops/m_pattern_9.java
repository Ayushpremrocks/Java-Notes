package b_loops;
import java.util.*;
public class m_pattern_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of rows");
        int n = input.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
