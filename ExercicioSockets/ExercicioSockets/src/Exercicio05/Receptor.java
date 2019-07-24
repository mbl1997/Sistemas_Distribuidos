package Exercicio05;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marih Bianchini
 */



class Receptor{
    ObjectInputStream objectInputStream;
    public Receptor(InputStream inputStream) {
        try {
            objectInputStream = new ObjectInputStream(inputStream);
        } catch (IOException ex) {
            Logger.getLogger(Receptor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Object receber(){
        Object objeto = null;
        try {
            objeto = objectInputStream.readObject();
        } catch (IOException ex) {
            Logger.getLogger(Receptor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Receptor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return(objeto);
        
    }
    
}
