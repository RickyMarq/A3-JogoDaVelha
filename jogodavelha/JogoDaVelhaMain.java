/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodavelha;
import java.awt.Color;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author rick
 */
public class JogoDaVelhaMain {

    /**
     * @param args the command line arguments
     */
   
    public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    public static boolean VezDoJogador = true;
    public static ArrayList<String> arrayServer = new ArrayList<String>(); 
    public static int playerWins;
    public static int computerWins;
    
    // ArrayList 3x3
    
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
    }
    
    public static boolean estaCheio(ArrayList<ArrayList<Integer>> array) {
    for (ArrayList<Integer> row : array) {
        for (Integer value : row) {
            if (value != 1 && value != 2) {
                return false;
            }
        }
    }
    return true;
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
                
        
        if (primeiraFPrimeiroI == 1 && segFPrimeiroI == 1 && terFPrimeiroI == 1) {
            JOptionPane.showMessageDialog(null, "Você ganhou 🤠", "Aviso", JOptionPane.WARNING_MESSAGE);
            playerWins += 1;
        } else if (primeiraFPrimeiroI == 1 && primeiraFSegundoI == 1 && primeiraFTerceiroI == 1) {
            JOptionPane.showMessageDialog(null, "Você ganhou 🤠", "Aviso", JOptionPane.WARNING_MESSAGE);
            playerWins += 1;
        } else if (primeiraFSegundoI == 1 && segFSegundoI == 1 && terFSegundoI == 1){
            JOptionPane.showMessageDialog(null, "Você ganhou 🤠", "Aviso", JOptionPane.WARNING_MESSAGE);
            playerWins += 1;
         } else if (primeiraFTerceiroI == 1 && segFTerceiroI == 1 && terFTerceiroI == 1) {
            JOptionPane.showMessageDialog(null, "Você ganhou 🤠", "Aviso", JOptionPane.WARNING_MESSAGE);
            playerWins += 1;
         } else if (segFPrimeiroI == 1 && segFSegundoI == 1 && segFTerceiroI == 1) {
            JOptionPane.showMessageDialog(null, "Você ganhou 🤠", "Aviso", JOptionPane.WARNING_MESSAGE);
            playerWins += 1;
         } else if (terFPrimeiroI == 1 && terFSegundoI == 1 && terFTerceiroI == 1) {
            JOptionPane.showMessageDialog(null, "Você ganhou 🤠", "Aviso", JOptionPane.WARNING_MESSAGE);
            playerWins += 1;
         } else if (primeiraFPrimeiroI == 1 && segFSegundoI == 1 && terFTerceiroI == 1) {
            JOptionPane.showMessageDialog(null, "Você ganhou 🤠", "Aviso", JOptionPane.WARNING_MESSAGE);
            playerWins += 1;
         } else if (terFPrimeiroI == 1 && segFSegundoI == 1 && primeiraFTerceiroI == 1) {
            JOptionPane.showMessageDialog(null, "Você ganhou 🤠", "Aviso", JOptionPane.WARNING_MESSAGE);
            playerWins += 1;
         } else if (primeiraFPrimeiroI == 2 && segFPrimeiroI == 2 && terFPrimeiroI == 2) {
            JOptionPane.showMessageDialog(null, "O Computador ganhou 🤡", "Aviso", JOptionPane.WARNING_MESSAGE);
            computerWins += 1;
        } else if (primeiraFPrimeiroI == 2 && primeiraFSegundoI == 2 && primeiraFTerceiroI == 2) {
            JOptionPane.showMessageDialog(null, "O Computador ganhou 🤡", "Aviso", JOptionPane.WARNING_MESSAGE);
            computerWins += 1;
        } else if (primeiraFSegundoI == 2 && segFSegundoI == 2 && terFSegundoI == 2){
            JOptionPane.showMessageDialog(null, "O Computador ganhou 🤡", "Aviso", JOptionPane.WARNING_MESSAGE);
            computerWins += 1;
         } else if (primeiraFTerceiroI == 2 && segFTerceiroI == 2 && terFTerceiroI == 2) {
            JOptionPane.showMessageDialog(null, "O Computador ganhou 🤡", "Aviso", JOptionPane.WARNING_MESSAGE);
            computerWins += 1;
         } else if (segFPrimeiroI == 2 && segFSegundoI == 2 && segFTerceiroI == 2) {
            JOptionPane.showMessageDialog(null, "O Computador ganhou 🤡", "Aviso", JOptionPane.WARNING_MESSAGE);
            computerWins += 1;
         } else if (terFPrimeiroI == 2 && terFSegundoI == 2 && terFTerceiroI == 2) {
            JOptionPane.showMessageDialog(null, "O Computador ganhou 🤡", "Aviso", JOptionPane.WARNING_MESSAGE);
            computerWins += 1;
         } else if (primeiraFPrimeiroI == 2 && segFSegundoI == 2 && terFTerceiroI == 2) {
            JOptionPane.showMessageDialog(null, "O Computador ganhou 🤡", "Aviso", JOptionPane.WARNING_MESSAGE);
            computerWins += 1;
         } else if (terFPrimeiroI == 2 && segFSegundoI == 2 && primeiraFTerceiroI == 2) {
            JOptionPane.showMessageDialog(null, "O Computador ganhou 🤡", "Aviso", JOptionPane.WARNING_MESSAGE);
            computerWins += 1;            
         } else {
             System.out.println("Continuar Jogo...");
         }
        
  
    }
     
     public static void PcPlay() {
         Random random = new Random();
         int randomIndex = random.nextInt(JogoDaVelhaMain.arr.size());
         
         int Row = JogoDaVelhaMain.arr.size();
         int Column = JogoDaVelhaMain.arr.get(0).size();
         
         int randomRow = random.nextInt(Row);
         int randomColumn = random.nextInt(Column);
         
         //JogoDaVelhaTeste.arr.get(randomRow).set(2, randomColumn);
  
         JogoDaVelhaMain.arr.get(randomRow).set(10, randomRow);
         
         System.out.println("DEBUG MODE: CP has played");
         
      }
    
    public static void initApplication() {
        jogodavelha.JogoDaVelhaMain.arrayServer.removeAll(jogodavelha.JogoDaVelhaMain.arrayServer);
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
