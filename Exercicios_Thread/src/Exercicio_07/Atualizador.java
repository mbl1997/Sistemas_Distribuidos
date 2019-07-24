package Exercicio_07;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marih Bianchini
 */


public class Atualizador implements Runnable {

    private JanelaSensores janela;
    private Buffer bufferAtualizacao;

    public Atualizador(Buffer bufferAtualizacao) {
        this.bufferAtualizacao = bufferAtualizacao;
        janela = new JanelaSensores();
    }


    @Override
    public void run() {
        boolean fim = false;
        while (!fim) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Atualizador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(bufferAtualizacao.temAtualizacao()){
                Atualizacao at = bufferAtualizacao.getAtualizacao();
                janela.atualizaSensor(at.getSensor(), at.getValor());
            }
            
        }
    }

}
