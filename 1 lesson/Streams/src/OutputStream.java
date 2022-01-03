import java.io.*;

public class OutputStream {
        public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("example2.txt",true);
            char H = 'H';
            fileOutputStream.write((char)H);
            String msg = "ello Java I/O programming";
            fileOutputStream.write(msg.getBytes());
            fileOutputStream.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}