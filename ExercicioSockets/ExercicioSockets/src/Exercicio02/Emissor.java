package Exercicio02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marih Bianchini
 */
class Emissor extends Thread{
    DataOutputStream dataOutputStream;

    public Emissor(OutputStream outputStream) {
        this.dataOutputStream = new DataOutputStream(outputStream);        
    }
    
    @Override
    public void run(){
        while(true){
            String mensagem = JOptionPane.showInputDialog("Mensagem: ");
            try {            
                dataOutputStream.writeUTF(mensagem);
            } catch (IOException ex) {
                Logger.getLogger(Emissor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
