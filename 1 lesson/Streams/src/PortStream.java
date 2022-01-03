import java.io.*;

public class PortStream {
    public static void main(String[] args) {
        System.out.println("Enter port number: ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        boolean isValid = false;
        int port = 0;
        while(!isValid){
            try{
                String readPort = bufferedReader.readLine();
                port = Integer.parseInt(readPort);
                System.out.println("Port accepted");
                isValid = true;
            } catch(Exception e){
                System.out.println("Insert a number");
                System.out.println("Enter a port number");
            }
        }
        
        System.out.println("Enter server IP address: ");
        String IPaddress = "";
        try{
            IPaddress = bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println("Could not read the IP "+e.toString());
        }
        System.out.println("_______________");
        System.out.println("Trying to connect to IP "+IPaddress + " using port: "+port);
    }
}
