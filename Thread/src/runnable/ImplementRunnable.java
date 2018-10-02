/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnable;

/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
public class ImplementRunnable implements Runnable {
    
    private int index;
    public ImplementRunnable(int index) {
        this.index = index;
    }        
    
    @Override
    public void run() {
        int clientNumber = 1;
        while (clientNumber != 100) {
            System.out.println("Server "+this.index+" sent data to client : " + clientNumber);
            clientNumber++;
        }
    }
    
    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }
    
}
