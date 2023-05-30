/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodavelhateste;
import java.awt.Color;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author rick
 */
public class JogoDaVelhaTeste {

    /**
     * @param args the command line arguments
     */
   
//    public static int array[][] = new int[3][3];
    
    public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    public static boolean VezDoJogador = true;
    public static ArrayList<String> arrayServer = new ArrayList<String>(); 
    public static int playerWins;
    public static int computerWins;
    
    
    static {
         for(int i = 0; i < 3; i++) {
         ArrayList<Integer> row = new ArrayList<>();
         for(int j = 0; j < 3; j++) {
        row.add(0);
      }
      arr.add(row);
    }
  }

        
       
    public static void main(String[] args) {
        initApplication();
        
        
 //       System.out.println(array.length);
 //       System.out.println(Arrays.deepToString(array));
        
        
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.println(array[i][j]);
//            }
//        }
        
//        tela home = new tela();
//        home.setVisible(true);
//        home.setLocationRelativeTo(null);
//        home.setResizable(false);
       
       
    }
    
    public static void checkBoard1x1() {
        System.out.println(arr.get(0).get(0));
        System.out.println(arr.get(0).get(1));
        System.out.println(arr.get(0).get(2));
        
        int primeiraFPrimeiroI = arr.get(0).get(0);
        int primeiraFSegundoI = arr.get(1).get(0);
        int primeiraFTerceiroI = arr.get(2).get(0);

        int segFPrimeiroI = arr.get(0).get(1);
        int segFSegundoI = arr.get(1).get(1);
        int segFTerceiroI = arr.get(2).get(1);

        int terFPrimeiroI = arr.get(0).get(2);
        int terFSegundoI = arr.get(1).get(2);
        int terFTerceiroI = arr.get(2).get(2);
        
    //    int segundoIndex = arr.get(0).get(1);        
    //    int terceiroIndex = arr.get(0).get(2);
        
        
        
        if (primeiraFPrimeiroI == 1 && segFPrimeiroI == 1 && terFPrimeiroI == 1) {
            System.out.println("Jogador ganhou DEBUG: Primeira Fileira");
            playerWins += 1;
        } else if (primeiraFPrimeiroI == 1 && primeiraFSegundoI == 1 && primeiraFTerceiroI == 1) {
            System.out.println("Jogador ganhou");
            playerWins += 1;
        } else if (primeiraFSegundoI == 1 && segFSegundoI == 1 && terFSegundoI == 1){
            System.out.println("Jogador ganhou");
            playerWins += 1;
         } else if (primeiraFTerceiroI == 1 && segFTerceiroI == 1 && terFTerceiroI == 1) {
            System.out.println("Jogador ganhou");
            playerWins += 1;
         } else if (segFPrimeiroI == 1 && segFSegundoI == 1 && segFTerceiroI == 1) {
            System.out.println("Jogador ganhou");
            playerWins += 1;

         } else if (terFPrimeiroI == 1 && terFSegundoI == 1 && terFTerceiroI == 1) {
            System.out.println("Jogador ganhou");
            playerWins += 1;

         } else if (primeiraFPrimeiroI == 1 && segFSegundoI == 1 && terFTerceiroI == 1) {
            System.out.println("Jogador ganhou");
            playerWins += 1;
         } else if (terFPrimeiroI == 1 && segFSegundoI == 1 && primeiraFTerceiroI == 1) {
            System.out.println("Jogador ganhou");
            playerWins += 1;
         } else if (primeiraFPrimeiroI == 2 && segFPrimeiroI == 2 && terFPrimeiroI == 2) {
            System.out.println("Computador ganhou"); 
            computerWins += 1;
        } else if (primeiraFPrimeiroI == 2 && primeiraFSegundoI == 2 && primeiraFTerceiroI == 2) {
            System.out.println("Computador ganhou");
            computerWins += 1;
        } else if (primeiraFSegundoI == 2 && segFSegundoI == 2 && terFSegundoI == 2){
            System.out.println("Computador ganhou");
            computerWins += 1;
         } else if (primeiraFTerceiroI == 2 && segFTerceiroI == 2 && terFTerceiroI == 2) {
            System.out.println("Computador ganhou");
            computerWins += 1;
         } else if (segFPrimeiroI == 2 && segFSegundoI == 2 && segFTerceiroI == 2) {
            System.out.println("Computador ganhou");
            computerWins += 1;
         } else if (terFPrimeiroI == 2 && terFSegundoI == 2 && terFTerceiroI == 2) {
            System.out.println("Computador ganhou");
            computerWins += 1;
         } else if (primeiraFPrimeiroI == 2 && segFSegundoI == 2 && terFTerceiroI == 2) {
            System.out.println("Computador ganhou");
            computerWins += 1;
         } else if (terFPrimeiroI == 2 && segFSegundoI == 2 && primeiraFTerceiroI == 2) {
            System.out.println("Computador ganhou");
            computerWins += 1;            
         } else {
             System.out.println("Continuar Jogo...");
         }
        
  
    }
    
    public static void checkBoard2x2() {
        System.out.println(arr.get(1).get(0));
        System.out.println(arr.get(1).get(1));
        System.out.println(arr.get(1).get(2));
        
        int primeiroIndex = arr.get(1).get(0);
        int segundoIndex = arr.get(1).get(1);
        int terceiroIndex = arr.get(1).get(2);
        
        
        if (primeiroIndex == 1 && segundoIndex == 1 && terceiroIndex == 1) {
            System.out.println("Jogador ganhou");
        } else {
            System.out.println("Cotinuar Jogo");
        }
    }
    
     public static void checkBoard3x3() {
        System.out.println(arr.get(2).get(0));
        System.out.println(arr.get(2).get(1));
        System.out.println(arr.get(2).get(2));
        
        int primeiroIndex = arr.get(2).get(0);
        int segundoIndex = arr.get(2).get(1);
        int terceiroIndex = arr.get(2).get(2);
        
        
        if (primeiroIndex == 1 && segundoIndex == 1 && terceiroIndex == 1) {
            System.out.println("Jogador ganhou");
        } else {
            System.out.println("Cotinuar Jogo");
        }
    }
     
     public static void PcPlay() {
         Random random = new Random();
         int randomIndex = random.nextInt(JogoDaVelhaTeste.arr.size());
         
         int Row = JogoDaVelhaTeste.arr.size();
         int Column = JogoDaVelhaTeste.arr.get(0).size();
         
         int randomRow = random.nextInt(Row);
         int randomColumn = random.nextInt(Column);
         
         //JogoDaVelhaTeste.arr.get(randomRow).set(2, randomColumn);
  
         JogoDaVelhaTeste.arr.get(randomRow).set(10, randomRow);
         
         System.out.println("DEBUG MODE: CP has played");
         
      }
    
    public static void initApplication() {
        jogodavelhateste.JogoDaVelhaTeste.arrayServer.removeAll(jogodavelhateste.JogoDaVelhaTeste.arrayServer);
        Splash splash = new Splash();
        splash.getContentPane().setBackground( Color.lightGray );
        splash.setVisible(true);
        splash.setLocationRelativeTo(null);
        splash.setResizable(false);
        
         try {
            for(int i =0; i<=100; i++) {
                Thread.sleep(30);
                splash.jProgressBar1.setValue(i);
                     
           
                if(i == 100) {
                    ChooseGameScreen home = new ChooseGameScreen();
                    splash.setVisible(false);
                    home.getContentPane().setBackground( Color.lightGray );
                    home.setSize(500, 400);
                    home.setResizable(false);
                    home.setLocationRelativeTo(null);           
                    home.setVisible(true);
                           
                }
            }
            
        } catch(Exception e) {
        }   
    } 
}
