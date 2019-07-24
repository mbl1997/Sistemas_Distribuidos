package Exercicio_07;

/**
 *
 * @author Marih Bianchini
 */


public class Main {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Entrada entrada = new Entrada(buffer);
        new Thread(entrada).start();

        Atualizador atualizador = new Atualizador(buffer);
        new Thread(atualizador).start();
    }
}
