/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author opilane
 */
public class ImplementRunnable implements Runnable {
    
    private int threadIndex;
    
    public ImplementRunnable(int index){
        this.threadIndex = index;
    };
    
    @Override
    public void run(){
        int clientNumber = 1;
        while(clientNumber != 100){
            System.out.println(this.threadIndex + " sent data to client " + clientNumber);
            clientNumber++;
        }
    }
    
    public void start(){
        Thread thread = new Thread(this);
        thread.start();
    } 
}
