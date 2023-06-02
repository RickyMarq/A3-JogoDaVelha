package Util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import Util.Req;
import Util.Resp;
import java.util.Random;
import jogodavelha.JogoDaVelhaMain;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author rick
 */
public class thread extends Thread {
    
    private Socket client;
    ObjectInputStream in;
    ObjectOutputStream out;
    Resp response;

    public static int jogador1 = 1;
    public static int jogador2 = 2;
    private Socket primeiroJogador;
    private Socket segundoJogador;
    
    public thread(Socket client) {
        this.client = client;
    }
    
    @Override
    public void run() { 
        try {
            in = new ObjectInputStream(client.getInputStream());
            out = new ObjectOutputStream(client.getOutputStream());
            // Obtendo o objeto
            Req request = (Req) in.readObject(); 
            
            System.out.println("Recebido com sucesso" + request.getOperator());  
            System.out.println("DEBUG RECEBER ROW e COL do Cliente" + request.getRowIndex() + request.getColIndex());
            

            if (request.getclearArray() == true) {
                jogodavelha.JogoDaVelhaMain.arrayServer.clear();
            }

            Random random = new Random();
            int randomIndex = random.nextInt(JogoDaVelhaMain.arr.size());
         
            int Row = JogoDaVelhaMain.arr.size();
            int Column = JogoDaVelhaMain.arr.get(0).size();
         
            int randomRow = random.nextInt(Row);
            int randomColumn = random.nextInt(Column);
            randomRow = random.nextInt(Row);
            randomColumn = random.nextInt(Column);
            
            System.out.println("DEBUG MODE: CP has played");
  
            jogodavelha.JogoDaVelhaMain.arrayServer.add(""+request.getRowIndex()+request.getColIndex());
     
            while (jogodavelha.JogoDaVelhaMain.arrayServer.contains(""+randomRow+randomColumn)) {
                int size = jogodavelha.JogoDaVelhaMain.arrayServer.size();
                System.out.println(size);
                randomRow = random.nextInt(Row);
                randomColumn = random.nextInt(Column);
                
                
                if (size >= 11) {
                    randomRow = -1;
                    randomColumn = -1;    
                    jogodavelha.JogoDaVelhaMain.arrayServer.clear();
                    break;               
                }

            }
            
            if (request.getclearArray() == true) {
                randomRow = -1;
                randomColumn = -1;
            }
                        
            System.out.println("Saiu do while ?");
            System.out.println("TMH da array " + jogodavelha.JogoDaVelhaMain.arrayServer.size());
            jogodavelha.JogoDaVelhaMain.arrayServer.add(""+randomRow+randomColumn);
            Resp response = new Resp(2, randomRow, randomColumn);            
            System.out.println("DEBUG MODE: ARRAY SERVER" + jogodavelha.JogoDaVelhaMain.arrayServer.toString());
            out.writeObject(response);
            
           
        } catch (Exception e) {
            System.out.println("Erro na Thread " + e.getMessage());
        }
    }  
}
