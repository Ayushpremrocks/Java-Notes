package c_functions;

import java.util.Scanner;

public class a_void {
    public static void MyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("my name is "+ name);
        input.close();
    }
    
}
