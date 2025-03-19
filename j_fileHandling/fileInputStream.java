package j_fileHandling;
import java.util.*;
import java.io.*;
public class fileInputStream {
    public static void main(String [] args){
        try{
            FileInputStream fis = new FileInputStream("j_fileHandling/fin.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

// FileInputStream is a byte stream class used to read data from a file
// it is used to read binary data like images, audio files, etc
