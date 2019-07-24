package Exercicio_01;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marih Bianchini
 */

public class ThreadDescrescente extends Thread{
    @Override
    public void run(){
        for(int i=500; i>=1; i--)
        {
            System.out.println("Decrescente: "+i);
            
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ThreadCrescente.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }
    
}
