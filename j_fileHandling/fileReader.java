package j_fileHandling;
import java.io.*;
public class fileReader {
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("output.txt");
            int i;
            while((i= reader.read())!=-1){
                System.out.print((char)i);
            }
            reader.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
