/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import Util.LobbyMultiplayer;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author rick
 */
public class ServerDoisJogadores {
    
    public static final int jogador1 = 1;
    public static final int jogador2 = 2;

    
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(8000);

            while(true) {
                System.out.println("Esperando jogador 1...");
                Socket primeiroJogador = serverSocket.accept();
                System.out.println("Conectado, jogador 1: " + "Endereço de IP: " + primeiroJogador.getInetAddress().getHostAddress());
                new DataOutputStream(primeiroJogador.getOutputStream()).writeInt(jogador1);

                Socket segundoJogador = serverSocket.accept();
                System.out.println("Conectado, jogador 2: " + "Endereço de IP: " + segundoJogador.getInetAddress().getHostAddress());
                new DataOutputStream(segundoJogador.getOutputStream()).writeInt(jogador2);
                
                // Iniciando Lobby para modo multiplayer.
                LobbyMultiplayer task = new LobbyMultiplayer(primeiroJogador, segundoJogador);
                Thread t1 = new Thread(task); 
                t1.start(); 
            }
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
