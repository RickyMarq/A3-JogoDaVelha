/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import Util.LobbyMultiplayerThread;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author rick
 */
public class ServerDoisJogadores {
    
    public static int jogador1 = 1;
    public static int jogador2 = 2;
    static int portaDoServirdor;
    static boolean InputValido = false;
    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Verificando se o input do usuário é válido
        
        while (!InputValido) {
        System.out.println("Insira a porta que o servidor será hospedado: ");

        if (teclado.hasNextInt()) {
            portaDoServirdor = teclado.nextInt();
            InputValido = true;
        } else {
            System.out.println("Por favor, insira um número válido para a porta.");
            teclado.next(); // Consume the invalid input
        }
         }
        
        // Iniciando socket do servidor...
        
        try {
            ServerSocket serverSocket = new ServerSocket(portaDoServirdor);

            while(true) {
                System.out.println("Sucesso, iniciando servidor multiplayer...");
                System.out.println("Esperando jogador 1...");
                // Esperando primeiro cliente se conectar.
                Socket primeiroJogador = serverSocket.accept();
                System.out.println("Conectado, jogador 1: " + "Endereço de IP: " + primeiroJogador.getInetAddress().getHostAddress());
                new DataOutputStream(primeiroJogador.getOutputStream()).writeInt(jogador1);
                // Esperando segundo cliente se conectar.
                Socket segundoJogador = serverSocket.accept();
                System.out.println("Conectado, jogador 2: " + "Endereço de IP: " + segundoJogador.getInetAddress().getHostAddress());
                new DataOutputStream(segundoJogador.getOutputStream()).writeInt(jogador2);
                
                // Iniciando Lobby para modo multiplayer.
                LobbyMultiplayerThread task = new LobbyMultiplayerThread(primeiroJogador, segundoJogador);
                Thread t1 = new Thread(task); 
                t1.start(); 
            }
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
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
