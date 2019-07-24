
package Exercicio05;

import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
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
            
            List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
            listaPessoas.add(new Pessoa("1010","Fulano","33445566"));
            listaPessoas.add(new Pessoa("2020","Sicrano","33445546"));
            listaPessoas.add(new Pessoa("3030","Beltrano","33445576"));
            
            
            new Emissor(socket.getOutputStream()).
                    enviar(listaPessoas);
            Thread.sleep(2000);
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
