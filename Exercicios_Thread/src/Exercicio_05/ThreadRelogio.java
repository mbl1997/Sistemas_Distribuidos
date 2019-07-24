package Exercicio_05;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Marih Bianchini
 */


public class ThreadRelogio extends Thread{
    private JLabel labelRelogio;  
    public ThreadRelogio(JLabel labelRelogio){
        this.labelRelogio = labelRelogio;
    }
    @Override
    public void run(){
        int hora=0,minuto=0,segundo=0;
        for(int valor=0; valor < 1000000; valor++){
            segundo++;
            if(segundo==60){
                segundo=0;
                minuto++;
                if(minuto==60){
                    hora++;
                    minuto=0;
                    if(hora==24)
                        hora = 0;
                
                }
                        
            }
            String horaS = String.valueOf(hora);
            if(hora < 10) horaS = "0"+horaS;
            String minutoS = String.valueOf(minuto);
            if(minuto < 10) minutoS = "0"+minutoS;
            String segundoS = String.valueOf(segundo);
            if(segundo < 10) segundoS = "0"+segundoS;
            
            labelRelogio.setText(horaS+":"+minutoS+":"+segundoS);
            labelRelogio.updateUI();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadRelogio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
