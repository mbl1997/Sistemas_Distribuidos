package Exercicio_04b;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marih Bianchini
 */


class ThreadBusca extends Thread {

    private final int vetor[];
    private final int idThread, qtdeThreads, numeroProcurar;

    public ThreadBusca(int[] vet, int idThread, int qtdeThreads,
            int numeroProcurar) {
        this.vetor = vet;
        this.idThread = idThread;
        this.qtdeThreads = qtdeThreads;
        this.numeroProcurar = numeroProcurar;
    }

    @Override
    public void run() {
        for(int i=(idThread-1); i<vetor.length; i+=qtdeThreads){ 

            if (vetor[i] == numeroProcurar) {
                System.out.println("Thread "+idThread+" encontrou!\n"
                        + "Indice de "+numeroProcurar+" eh "+i);
                return;
            }
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Thread "+idThread+" nao encontrou!\n"
                +"Indice de "+numeroProcurar+" eh -1");

    }

}
