import java.io.*;

public class DataStream {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if(file.exists()){
            System.out.println("File alredy exists! " + file.getName());
        } else{
            try{
                if(file.createNewFile()){
                    System.out.println("File was created!");
                    System.out.println("File path: "+file.getAbsolutePath());
                } else{
                        System.out.println("Could not create file!");
                    }
            } catch(Exception e){
                System.out.println(e.toString());
            }
        }
        
        try{
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file.getName()));
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file.getName()));
            
            dataOutputStream.writeInt(72);
            dataOutputStream.writeDouble(678.00);
            dataOutputStream.writeFloat(123.45F);
            
            int value1 = dataInputStream.readInt();
            double value2 = dataInputStream.readDouble();
            float value3 = dataInputStream.readFloat();
            
            System.out.println("Integer: "+value1);
            System.out.println("Double: "+value2);
            System.out.println("Float:"+value3);
            
            dataOutputStream.close();
            dataInputStream.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}
