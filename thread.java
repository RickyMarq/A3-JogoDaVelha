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
/**
 *
 * @author rick
 */
public class thread extends Thread {
    
    private Socket client;
    ObjectInputStream in;
    ObjectOutputStream out;
    Resp response;

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


            System.out.println("Recebido com sucesso" + request.getOperator());
 //           JogoDaVelhaTeste.PcPlay();
             
             
            Random random = new Random();
            int randomIndex = random.nextInt(JogoDaVelhaTeste.arr.size());
         
            int Row = JogoDaVelhaTeste.arr.size();
            int Column = JogoDaVelhaTeste.arr.get(0).size();
         
            int randomRow = random.nextInt(Row);
            int randomColumn = random.nextInt(Column);
           
             //JogoDaVelhaTeste.arr.get(randomRow).set(2, randomColumn);
         
            System.out.println("DEBUG MODE: CP has played");
 
 //           jogodavelhateste.JogoDaVelhaTeste.arr.get(0).set(2, 25);    
 
            Resp response = new Resp(2, randomRow, randomColumn);
            out.writeObject(response);
            
            
//            int a = 5;
//            response = new Resp(a);

            
        } catch (Exception e) {
            System.out.println("Erro na Thread " + e.getMessage());
        }
    }   
}
