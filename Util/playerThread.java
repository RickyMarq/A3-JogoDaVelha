/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import Util.ReqPlayerPlayer;
import Util.RespPlayerPlayer;
import java.io.DataInputStream;
import java.io.DataOutputStream;

/**
 *
 * @author rick
 */

public class playerThread extends Thread {
    private Socket client;
    String opponentIp;
    int opponentPort;
    ObjectInputStream in;
    ObjectOutputStream out;
    private DataInputStream fromServer;
    private DataOutputStream toServer;
    public static final int jogador1 = 1;
    public static final int jogador2 = 2;
    private boolean minhaVez = false;
    private char meuOperador = ' ', OperadorInimigo = ' ';
    
    @Override   
    public void run() {                
       try {
            
      //      out = new ObjectOutputStream(socket.getOutputStream());
      //      in = new ObjectInputStream(socket.getInputStream());
      //      Req request = new Req(2, 2, 1, false, true);
      //      out.writeObject(request);
      //      Resp response = (Resp) = in.readObject();
      //      O Cliente deve apenas receber e apresentar no board. 
            
            int player = fromServer.readInt();
            System.out.println("Sou o player " + player);
             
            if (player == jogador1) {
                meuOperador = 'X';
                OperadorInimigo = 'O';
               
                
                
                minhaVez = true;
            } else if (player == jogador2) {
                meuOperador = 'O';
                OperadorInimigo = 'X';
                
               
            }
            
            
         } catch (Exception e) {
             
         }
           
    }    
    
    
    
}
