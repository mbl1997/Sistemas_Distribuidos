package Exercicio_03;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marih Bianchini
 */


public class ThreadImpressao extends Thread {
    private int idThread;
    private int qtdeThreads;

    public ThreadImpressao(int idThread, int qtdeThreads) {
        this.idThread = idThread;
        this.qtdeThreads = qtdeThreads;
    }
    
    @Override
    public void run(){
        for(int i=idThread; i<=100; i+=qtdeThreads){
            System.out.println("Thread "+idThread+" -> "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadImpressao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
