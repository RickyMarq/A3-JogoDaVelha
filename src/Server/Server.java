/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;
import Util.playerThread;
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
        int jogadores;
        Socket socketClient = null;
        int porta = 54321;
        boolean continuar = true;
        String ip = "127.0.0.1";

        
        try {
            serverSocket = new ServerSocket(porta);
            System.out.println("Sucesso, servidor rodando na " + "Porta " + porta + "IP " + ip);
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
}
