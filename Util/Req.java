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
public class Req implements Serializable {
    private int operator;
    private int rowIndex;
    private int colIndex;
    private boolean clearArray;

    public Req(int operator, int rowIndex, int colIndex, boolean clearArray) {
        this.operator = operator;
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
        this.clearArray = clearArray;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
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
    
    public boolean getclearArray() {
        return clearArray;
    }

    public void setclearArray(boolean clearArray) {
        this.clearArray = clearArray;
    }
}
