package Exercicio01.a;

import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

class Leitor{
    public static void main(String args[]){
        Socket socket = null;
        try{
            socket = new Socket("localhost",9876);
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String mensagem = dis.readUTF();
            System.out.println("Mensagem :"+mensagem);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    System.out.println("Close falhou!");
                }
            }
        }
    }
}