package Exercicio_06;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Marih Bianchini
 */


public class ThreadRelogio extends Thread {

    private JLabel labelRelogio;
    private Horario horario;

    public ThreadRelogio(JLabel labelRelogio) {
        this.labelRelogio = labelRelogio;
        this.horario = new Horario();
    }

    @Override
    public void run() {
        for(int i=0; i<1000000;i++){
            this.horario.incrementa();

            labelRelogio.setText(this.horario.toString());
            labelRelogio.updateUI();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadRelogio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
