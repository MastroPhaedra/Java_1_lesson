/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author opilane
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ServerThread thread1 = new ServerThread("Server 1");
        //ServerThread thread2 = new ServerThread("Server 2");
        //thread2.setPriority(Thread.MAX_PRIORITY);
        //System.out.println(thread1.getName() + " priority: " + thread1.getPriority());
        //thread1.start();
        //thread2.start();
        int second = 2;
        try{
            while(second<=100){
            Thread.sleep(1000);
            System.out.println("Second: " + second);
            second++;
            }
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}
