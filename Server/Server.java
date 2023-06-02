/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import java.util.Scanner;
import Util.thread;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author rick
 */
public class Server {
    
     public static void main(String[] args) {
        ServerSocket serverSocket;
        Scanner teclado = new Scanner(System.in);
        int jogadores;
        Socket socketClient = null;
        int porta = 0;
        boolean continuar = true;
        String ip = "";
        boolean InputValido = false;
        boolean ipValido = false;


        
        while (!InputValido) {
            System.out.println("Insira a porta que o servidor será hospedado: ");
        if (teclado.hasNextInt()) {
            porta = teclado.nextInt();
            InputValido = true;
        } else {
            System.out.println("Por favor, insira um número válido para a porta.");
            teclado.next(); 
          }
        }
        
        while (!ipValido) {
        System.out.println("Insira o endereço IP do servidor: ");
        ip = teclado.next();
        if (IPeValido(ip)) {
            ipValido = true;
        } else {
            System.out.println("Por favor, insira um endereço IP válido.");
        }
    }
        
        try {
            serverSocket = new ServerSocket(porta);
            System.out.println("Sucesso, servidor rodando na " + "Porta " + porta + " IP " + ip);
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
            return; 
        }
        
        while(continuar) {
            try {
                System.out.println("Aguardando o cliente...");
                socketClient = serverSocket.accept();
                System.out.println("Conectado com " + socketClient.getInetAddress().getHostAddress());
                thread thd = new thread(socketClient);
                thd.start();
            } catch (Exception e) {
                
            }
        }

          try {
            socketClient.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
     
    public static boolean IPeValido(String ip) {
        // DEBUG, checar se o ip inserido é válido.
        String validador = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                     + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                     + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                     + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        return ip.matches(validador);
    }
}
