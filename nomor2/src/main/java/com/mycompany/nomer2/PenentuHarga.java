/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomer2;

/**
 *
 * @author imrong, fadhil, hamad
 */
public class PenentuHarga {
    private int baseFee, addFee, totalFee;
    
    public int cekHarga(int cA, boolean isBusinessHour, boolean isCDropPick) {
        if (cA == 1 || cA == 2) {
            baseFee = 50;
            addFee = 0;
        } else if (cA >= 3 && cA <= 10) {
            baseFee = 100;
            addFee = cA * 10;
        } else {
            baseFee = 500;
            addFee = cA * 10;
        }
        
        if (!isBusinessHour) {
            baseFee *= 2;
        }
        
        totalFee = baseFee + addFee;
        
        if (isCDropPick) {
            totalFee /= 2;
        }
        
        return totalFee;
    }
}
