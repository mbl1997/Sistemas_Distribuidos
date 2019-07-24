package Exercicio_07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Marih Bianchini
 */


public class Entrada1 implements Runnable {

    private Buffer bufferAtualizacao;

    public Entrada1(Buffer bufferAtualizacao) {
        this.bufferAtualizacao = bufferAtualizacao;
    }

    @Override
    public void run() {
        String texto = "";
        boolean execute = false;
        do {
            System.out.println("Digite o arquivo com o caminho:");
            texto = new Scanner(System.in).nextLine();
            File arquivo = new File(texto);
            if (!arquivo.exists()) {
                System.out.println("Arquivo não existe! Tente novamente ou digite sair");
            } else {
                FileReader readerF = null;
                try {
                    readerF = new FileReader(arquivo);
                    BufferedReader reader = new BufferedReader(readerF);
                    String linha = null;
                    while ((linha = reader.readLine()) != null) {
                        //Pega o primeiro caracter e transforma em int
                        int sensor = Integer.parseInt(linha.substring(0, 1));
                        //Pega o terceiro caracter adiante e transforma em int
                        int valor = Integer.parseInt(linha.substring(2, linha.length()));
                        bufferAtualizacao.addAtualizacao(new Atualizacao(sensor, valor));
                    }
                } catch (FileNotFoundException ex) {
                    System.out.println("Arquivo não encontrado! Tente novamente ou digite sair");
                } catch (Exception ex) {
                    System.out.println("Erro ao ler o arquivo!");
                    ex.printStackTrace();
                } finally {
                    try {
                        readerF.close();
                    } catch (IOException ex) {
                        System.out.println("Erro ao ler o arquivo!");
                    }
                }

            }
        } while (!texto.equalsIgnoreCase("SAIR"));

    }
}
