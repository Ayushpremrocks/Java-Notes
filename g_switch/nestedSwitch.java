package g_switch;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("enter clg");
        String clg = x.next();
        System.out.println("enter stream");
        String branch = x.next();

        switch (clg){
            case "iit":
                System.out.println("too many branches");
                switch(branch){
                    case "cse","ece","other":
                    System.out.println("job paaki hai");
                    break;
                }
                break;
            
            case "nit","iiit":
                switch(branch){
                    case "cse","ece":
                    System.out.println("job paaki hai");
                    break;
                    default:
                    System.out.println("nalla marega");
                    break;
                }
                break;

                default:
                System.out.println("nalla marega");
        }

        x.close();
    }
}
