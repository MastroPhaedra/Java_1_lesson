import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputStream {
    public static void main(String[] args) {
        try{
            FileInputStream inputStream = new FileInputStream("example.txt");
            int data = inputStream.read();
            while (data != -1){
                System.out.print((char)data);
                data=inputStream.read();
            }
            inputStream.close();
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
