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
import jogodavelhateste.JogoDaVelhaTeste;
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
            Req request = (Req) in.readObject(); // casting
            
            if (request.getTwoPlayers() == true) {
                System.out.println("DEBUG MODE: Entrou no dois jogadores.......");                  
                
                System.out.println("Fileira: " + request.getRowIndex() + "Coluna " + request.getColIndex());
                
                // Deve receber e jogar e devolver x
                
                // Precisa iniciar o lobby agr.  
                
                
                
            } else {
                

            System.out.println("Recebido com sucesso" + request.getOperator());  
            System.out.println("DEBUG RECEBER ROW e COL do Cliente" + request.getRowIndex() + request.getColIndex());
            

            if (request.getclearArray() == true) {
                jogodavelhateste.JogoDaVelhaTeste.arrayServer.clear();
            }

            Random random = new Random();
            int randomIndex = random.nextInt(JogoDaVelhaTeste.arr.size());
         
            int Row = JogoDaVelhaTeste.arr.size();
            int Column = JogoDaVelhaTeste.arr.get(0).size();
         
            int randomRow = random.nextInt(Row);
            int randomColumn = random.nextInt(Column);
            randomRow = random.nextInt(Row);
            randomColumn = random.nextInt(Column);
            
//            if (randomRow == request.getRowIndex() && randomColumn == request.getColIndex()) {
//            randomRow = random.nextInt(Row);
//           randomColumn = random.nextInt(Column);
            
            
          
//            } else {
            System.out.println("DEBUG MODE: CP has played");
 
 //           jogodavelhateste.JogoDaVelhaTeste.arr.get(0).set(2, 25);
  
            // Add valor vindo do client 
            // TODO: add valgodavelhateste.JogoDaVelhaTeste.arrayServer.add(or que o server irá colocar
            
            jogodavelhateste.JogoDaVelhaTeste.arrayServer.add(""+request.getRowIndex()+request.getColIndex());
     
            // jogodavelhateste.JogoDaVelhaTeste.arrayServer.contains(""+request.getRowIndex() + request.getColIndex()) || 
            
            while (jogodavelhateste.JogoDaVelhaTeste.arrayServer.contains(""+randomRow+randomColumn)) {
                int size = jogodavelhateste.JogoDaVelhaTeste.arrayServer.size();
                System.out.println(size);
                randomRow = random.nextInt(Row);
                randomColumn = random.nextInt(Column);
                
                if (size >= 8) {
                    randomRow = -1;
                    randomColumn = -1;    
                    jogodavelhateste.JogoDaVelhaTeste.arrayServer.clear();
                    break;               
                }

            }
            
            if (request.getclearArray() == true) {
                randomRow = -1;
                randomColumn = -1;
            }
            
            System.out.println("Saiu do while ?");
            System.out.println("TMH da array " + jogodavelhateste.JogoDaVelhaTeste.arrayServer.size());
            jogodavelhateste.JogoDaVelhaTeste.arrayServer.add(""+randomRow+randomColumn);
            Resp response = new Resp(2, randomRow, randomColumn);            
            System.out.println("DEBUG MODE: ARRAY SERVER" + jogodavelhateste.JogoDaVelhaTeste.arrayServer.toString());
            out.writeObject(response);
            
                                                                                                    
             //JogoDaVelhaTeste.arr.get(randomRow).set(2, randomColumn);
         
//            System.out.println("DEBUG MODE: CP has played");
 
//           jogodavelhateste.JogoDaVelhaTeste.arr.get(0).set(2, 25);    
 
//            Resp response = new Resp(2, randomRow, randomColumn);
//            out.writeObject(response);
            
            
//            int a = 5;
//            response = new Resp(a);

            }
        } catch (Exception e) {
            System.out.println("Erro na Thread " + e.getMessage());
        }
    }   
    

      
}
