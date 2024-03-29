package Exercicio05;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marih Bianchini
 */

class Emissor {
    ObjectOutputStream objetoOutputStream;

    public Emissor(OutputStream outputStream) {
        try {        
            this.objetoOutputStream = new ObjectOutputStream(outputStream);
        } catch (IOException ex) {
            Logger.getLogger(Emissor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void enviar(Object objeto){
        try {
            objetoOutputStream.writeObject(objeto);
        } catch (IOException ex) {
            Logger.getLogger(Emissor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
