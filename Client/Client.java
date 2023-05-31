/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

import Util.Req;
import Util.Resp;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import jogodavelhateste.JogoDaVelhaTeste;


/**
 *
 * @author rick
 */
public class Client {
    
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Socket socket;
        int porta = 54321;
        String ip = "127.0.0.1";
        ObjectOutputStream out;
        ObjectInputStream in;
        double value1, value2; 
        char oper;

        try {
            // o cliente está pedindo conexão com o servidor que está no IP e Porta informados
            socket = new Socket(ip, porta);
            System.out.println("Conectado com o servidor.");
            JogoDaVelhaTeste.initApplication();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return;
        }

 
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());

        } catch (Exception e) {
            System.out.println("Erro na comunicação: " + e.getMessage());
        }

        try {
            System.out.println("Encerrando o cliente");
            entrada.close();
            socket.close();
        } catch (Exception e) {
            
        }
    }    
}
