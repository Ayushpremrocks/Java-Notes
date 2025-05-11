package d_oops;
import java.util.*;
class Animal{
    void info(){
        System.out.println("it is an animal");
    }
    void Facts(){
        System.out.println("it is human's best friend");
    }
}
class Dogs extends Animal{
    void details(){
        System.out.println("it is a dog");
    }
}
public class inheritance {
    public static void main(String[] args){
        Dogs obj = new Dogs();
        obj.info();
        obj.Facts();
        obj.details();
    }
}
