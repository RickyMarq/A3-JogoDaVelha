/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;
import java.io.Serializable;

/**
 *
 * @author rick
 */
public class RespPlayerPlayer implements Serializable {
    private String opponentIp;
    private int opponentPort;

    public RespPlayerPlayer(String opponentIp, int opponentPort) {
        this.opponentIp = opponentIp;
        this.opponentPort = opponentPort;
    }

    public String getOpponentIp() {
        return opponentIp;
    }

    public void setOpponentIp(String opponentIp) {
        this.opponentIp = opponentIp;
    }

    public int getOpponentPort() {
        return opponentPort;
    }

    public void setOpponentPort(int opponentPort) {
        this.opponentPort = opponentPort;
    }
    
    
}
