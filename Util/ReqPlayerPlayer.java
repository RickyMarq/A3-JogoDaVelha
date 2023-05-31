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
public class ReqPlayerPlayer implements Serializable {
    private String ip;
    private int porta;

    public ReqPlayerPlayer(String ip, int porta) {
        this.ip = ip;
        this.porta = porta;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }
    

}
