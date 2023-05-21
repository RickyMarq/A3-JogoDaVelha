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
public class Resp implements Serializable {
    private int pcOperator;
    private int rowIndex;
    private int colIndex;
    

   public Resp(int pcOperator, int rowIndex, int colIndex) {
        this.pcOperator = pcOperator;
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }

    public int getPcOperator() {
        return pcOperator;
    }

    public void setPcOperator(int pcOperator) {
        this.pcOperator = pcOperator;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }

    public void setColIndex(int colIndex) {
        this.colIndex = colIndex;
    }
}
