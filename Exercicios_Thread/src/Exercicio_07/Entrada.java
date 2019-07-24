package Exercicio_07;

import java.util.Scanner;


/**
 *
 * @author Marih Bianchini
 */


public class Entrada implements Runnable {

    private Buffer bufferAtualizacao;

    public Entrada(Buffer bufferAtualizacao) {
        this.bufferAtualizacao = bufferAtualizacao;
    }

    @Override
    public void run() {
        String texto = "";
        do {
            System.out.println("Formato N:V [N=num sensor e V=novo valor; 0:0=para sair]");
            texto = new Scanner(System.in).nextLine();
            if(texto.charAt(1) != ':') // adicionar outras verificacoes                
                System.out.println("Especificação errada!");
            else{
                //Pega o primeiro caracter e transforma em int
                int sensor = Integer.parseInt(texto.substring(0, 1));
                //Pega o terceiro caracter adiante e transforma em int
                int valor = Integer.parseInt(texto.substring(2, texto.length()));        
                bufferAtualizacao.addAtualizacao(new Atualizacao(sensor,valor));
                
            }
        } while (!texto.equalsIgnoreCase("SAIR"));

    }
}
