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
public class Main {
    
    public static void main(String[] args) {
        ImplementRunnable runnable1 = new ImplementRunnable(1);
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        ImplementRunnable runnable2 = new ImplementRunnable(2);
        Thread thread2 = new Thread(runnable2, "Server2");
        System.out.println(thread2.getName());
        thread2.start();
        
        ImplementRunnable runnable3 = new ImplementRunnable(3);
        runnable3.start();
    }
}
