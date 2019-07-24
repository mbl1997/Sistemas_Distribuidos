package Exercicio_06;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marih Bianchini
 */


public class Alarme extends Thread{
    public Horario horarioInicial, horarioAlarme;

    public Alarme(Horario horarioInicial, Horario horarioAlarme) {
        this.horarioInicial = horarioInicial;
        this.horarioAlarme = horarioAlarme;
    }

    @Override
    public void run() {
        do{
            this.horarioInicial.incrementa();
            if(this.horarioInicial.equals(horarioAlarme)){
                JOptionPane.showMessageDialog(null, "ALARME! ALARME! ALARME!");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadRelogio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while(!this.horarioInicial.equals(horarioAlarme));
    }
    
}
