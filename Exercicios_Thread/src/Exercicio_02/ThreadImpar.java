package Exercicio_02;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marih Bianchini
 */


public class ThreadImpar extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=100;i+=2){
            System.out.println("Thread impar: "+i);
            
            Random random = new Random();
            int numeroAleatorio = 500+ random.nextInt(1500);
            try {
                Thread.sleep(numeroAleatorio);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadPar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
