package Exercicio_01;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marih Bianchini
 */


public class ThreadCrescente extends Thread{
    
    @Override
    public void run(){
        for(int i=1; i<=500; i++)
        {
            System.out.println("Crescente: "+i);
            
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ThreadCrescente.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }
    
}
