package Exercicio_04b;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Marih Bianchini
 */


public class Main {
    public static void main(String[] args) {
        int vet[] = new int[200];
        Random random = new Random();
        for(int i=0;i<200;i++){
            vet[i] = random.nextInt(4999)+1;
        }
        
        System.out.println(Arrays.toString(vet));

        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero a pesquisar:"));
        int qtdeThreads = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Threads:"));
                
        for(int i=1; i<=qtdeThreads; i++){
            new ThreadBusca(vet, i, qtdeThreads,numero).start();
        }        
    }
}
