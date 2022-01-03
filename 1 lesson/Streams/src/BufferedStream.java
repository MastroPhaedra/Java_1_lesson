import java.io.*;

public class BufferedStream {

    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("example6.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("example7.txt"));
            
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}
