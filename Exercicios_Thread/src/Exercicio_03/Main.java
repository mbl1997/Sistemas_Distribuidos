package Exercicio_03;

import javax.swing.JOptionPane;

/**
 *
 * @author Marih Bianchini
 */

public class Main {
    public static void main(String[] args) {
        int qtdeThreads = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Threads: "));
        
        for(int i=1; i<=qtdeThreads; i++)
        {
            new ThreadImpressao(i,qtdeThreads).start();
        }
    }
}
