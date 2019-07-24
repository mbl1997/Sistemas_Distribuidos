package Exercicio_04a;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marih Bianchini
 */


class ThreadBusca extends Thread {

    private int vetor[];
    private int numeroProcurar;

    public ThreadBusca(int[] vet, int numeroProcurar) {
        this.vetor = vet;
        this.numeroProcurar = numeroProcurar;
    }

    @Override
    public void run() {
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] == numeroProcurar) {
                System.out.println("Indice de "+numeroProcurar+" eh "+i);
                return;
            }
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Indice de "+numeroProcurar+" eh -1");

    }

}
