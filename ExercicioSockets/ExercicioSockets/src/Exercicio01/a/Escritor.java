package Exercicio01.a;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class Escritor{
    public static void main(String args[]){
        ServerSocket listenSocket = null;
        ArrayList<Socket> listaClientes = new ArrayList<>();
        try{
            listenSocket = new ServerSocket(9876);
            for(int i=0; i<3; i++){
                listaClientes.add(listenSocket.accept());
            }
            String mensagem = JOptionPane.showInputDialog("Mensagem: ");
            for(Socket cliente: listaClientes){
                DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
                out.writeUTF(mensagem);
            }
            System.out.println("Finalizando a aplicação ...");

        } catch (EOFException e) {
            System.out.println("EOF:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO:" + e.getMessage());
        } finally {
            for(Socket cliente: listaClientes){
                if (cliente != null) {
                    try {
                        cliente.close();
                    } catch (IOException e) {
                        System.out.println("Close falhou!");
                    }
                }
            }
        }




    }
}

