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
import jogodavelha.JogoDaVelhaMain;


/**
 *
 * @author rick
 */
public class Client {
    
      public static int porta;
      public static String ip = "";
    
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Socket socket;
        ObjectOutputStream out;
        ObjectInputStream in;
        double value1, value2; 
        char oper;

        
        boolean InputValido = false;
        boolean ipValido = false;


        
        while (!InputValido) {
            System.out.println("Insira a porta que o servidor está hospedado: ");
        if (entrada.hasNextInt()) {
            porta = entrada.nextInt();
            InputValido = true;
        } else {
            System.out.println("Por favor, insira um número válido para a porta.");
            entrada.next(); 
          }
        }
        
        while (!ipValido) {
        System.out.println("Insira o endereço IP do servidor para se conectar: ");
        ip = entrada.next();
        if (IPeValido(ip)) {
            ipValido = true;
        } else {
            System.out.println("Por favor, insira um endereço IP válido.");
        }
    }

        try {
            // o cliente está pedindo conexão com o servidor que está no IP e Porta informados
            socket = new Socket(ip, porta);
            System.out.println("Conectado com o servidor.");
            // Iniciando interface GUI...
            JogoDaVelhaMain.initApplication();
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
      
       public static boolean IPeValido(String ip) {
        // DEBUG, checar se o ip inserido é válido.
        String validador = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                     + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                     + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                     + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        return ip.matches(validador);
    }
}
