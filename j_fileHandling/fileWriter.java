package j_fileHandling;
import java.io.*;
public class fileWriter {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Ayush Prem");
            writer.close();
            System.out.println("Successful");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
