package a_basics;
import java.util.*;
public class d_switch {
    public static void main(String[] args) {
        System.out.println("choose your option");
        System.out.println("1) your name");
        System.out.println("2) your age");
        System.out.println("3) full name");
        System.out.println("4) account balance");

        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();

        switch(menu){
            case 1:
            System.out.println("Ayush");
            break;
            case 2:
            System.out.println("20");
            break;
            case 3:
            System.out.println("Ayush Prem");
            break;
            case 4:
            System.out.println("decimals me hai, mai garib hu");
            break;
            default:
            System.out.println("no sahi se daal le");
        }
        input.close();
    }
}
