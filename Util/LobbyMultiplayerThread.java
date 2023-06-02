/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author rick
 */

public class LobbyMultiplayerThread implements Runnable {
    
    private Socket primeiroJogador;
    private Socket segundoJogador;
    private char[][] tabuleiroJogoDaVelha = new char[3][3];
    ObjectInputStream inJogador1;
    ObjectOutputStream outJogador1;
    ObjectInputStream inJogador2;
    ObjectOutputStream outJogador2;
    public static int PLAYER1 = 1;
    public static int PLAYER2 = 2;
    public static int PLAYER1_WON = 1;
    public static int PLAYER2_WON = 2;
    public static final int CONTINUE = 4;
    public static int DRAW = 3;
  
     public LobbyMultiplayerThread(Socket primeiroJogador, Socket segundoJogador) {
        this.primeiroJogador = primeiroJogador;
        this.segundoJogador = segundoJogador; 
        
     // Criando array 3x3
   
     for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiroJogoDaVelha[i][j] = ' ';
            }
        }
    } 

    @Override
    public void run() {
      
        try {                      
            DataInputStream doJogador1 = new DataInputStream(primeiroJogador.getInputStream());
            DataOutputStream paraOJogador1 = new DataOutputStream(primeiroJogador.getOutputStream());
            DataInputStream doJogador2 = new DataInputStream(segundoJogador.getInputStream());
            DataOutputStream paraOJogador2 = new DataOutputStream(segundoJogador.getOutputStream());
            
            paraOJogador1.writeInt(1);
            
            // Começar jogo.
            
            while(true) {
                // Obter dados do jogador 1.
                int row = doJogador1.readInt();
                int column = doJogador1.readInt();
                tabuleiroJogoDaVelha[row][column] = 'X';

                System.out.println("DEBUG: PRTN JOGADOR 1 " + row + column);
                
              if (ganhou('X')) {
                    paraOJogador1.writeInt(PLAYER1_WON);
                    paraOJogador2.writeInt(PLAYER1_WON);
                    enviarMovimento(paraOJogador2, row, column);
                    break;
     
              } else if (estaCheio()) {
                    paraOJogador1.writeInt(DRAW);
                    paraOJogador2.writeInt(DRAW);
                    enviarMovimento(paraOJogador2, row, column);
                    break;
              } else {
                    paraOJogador2.writeInt(CONTINUE);
                    enviarMovimento(paraOJogador2, row, column);
              }
              /*
              
              // DEBUG: PRINTAR TABULEIRO
              
              for (int i = 0; i < 3; i++) {
                 for (int j = 0; j < 3; j++) {
             System.out.print(cell[i][j] + " ");
                }
              System.out.println(); // Move to the next line after each row
            }
                 */
              
                row = doJogador2.readInt();
                column = doJogador2.readInt();
                tabuleiroJogoDaVelha[row][column] = 'O';
 
                
                
              if (ganhou('O')) {
                    paraOJogador1.writeInt(PLAYER2_WON);
                    paraOJogador2.writeInt(PLAYER2_WON);
                    enviarMovimento(paraOJogador1, row, column);
                    break;
                } else {
                    paraOJogador1.writeInt(CONTINUE);
                    enviarMovimento(paraOJogador1, row, column);
                }
            
            }
            
        } catch(Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        
        
    }
    
    boolean estaCheio() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (tabuleiroJogoDaVelha[i][j] != 'X' && tabuleiroJogoDaVelha[i][j] != 'O') {
                return false;
            }
        }
    }
    return true;
}
    
    void enviarMovimento(DataOutputStream out, int row, int column) throws IOException {
        out.writeInt(row);
        out.writeInt(column);
    }
    
    boolean ganhou(char XouO) {
        if ((tabuleiroJogoDaVelha[0][0] == XouO) && (tabuleiroJogoDaVelha[1][1] == XouO) && (tabuleiroJogoDaVelha[2][2] == XouO))
            return true;
        if ((tabuleiroJogoDaVelha[0][2] == XouO) && (tabuleiroJogoDaVelha[1][1] == XouO) && (tabuleiroJogoDaVelha[2][0] == XouO))
            return true;
        for (int i = 0; i < 3; i++) {
            if ((tabuleiroJogoDaVelha[i][0] == XouO) && (tabuleiroJogoDaVelha[i][1] == XouO) && (tabuleiroJogoDaVelha[i][2] == XouO)) {
                return true;
            }
        }        
        for (int j = 0; j < 3; j++) {
            if ((tabuleiroJogoDaVelha[0][j] == XouO) && (tabuleiroJogoDaVelha[1][j] == XouO) && (tabuleiroJogoDaVelha[2][j] == XouO))
                return true;
        }
        return false;
    }
        
}
  