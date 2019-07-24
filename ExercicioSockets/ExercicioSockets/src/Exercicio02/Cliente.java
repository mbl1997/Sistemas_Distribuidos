package Exercicio02;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marih Bianchini
 */

public class Cliente {
    public static void main(String[] args) {
        Socket socket;
        try {
            socket = new Socket("localhost", 6789);
            new Emissor(socket.getOutputStream()).start();
            new Receptor(socket.getInputStream()).start();                
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
