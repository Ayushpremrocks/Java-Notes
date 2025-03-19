package j_fileHandling;
import java.io.*;
public class byteArrayInputStream {
    public static void main(String[] args) {
        byte[] data = {65, 121, 117, 115, 104, 32, 80, 114, 101, 109};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        int i;
        while ((i = bais.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
// ByteArrayInputStream is the input stream version of ByteArrayOutputStream