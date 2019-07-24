package Exercicio02;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marih Bianchini
 */
class Receptor extends Thread{
    DataInputStream dataInputStream;
    public Receptor(InputStream inputStream) {
        dataInputStream = new DataInputStream(inputStream);
    }
    
    @Override
    public void run(){
        while(true){
            try {
                String mensagem = dataInputStream.readUTF();
                System.out.println("Mensagem: "+mensagem);
            } catch (IOException ex) {
                Logger.getLogger(Receptor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
