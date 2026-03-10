/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaskelompokno3;

/**
 *
 * @author kadhim, java
 */
public class invoice {
    String accountNumber;
    double amountOfSale;

    invoice(String accountNumber, double amountOfSale) {
        this.accountNumber = accountNumber;
        this.amountOfSale = amountOfSale;
    }

    void printInvoice() {
        System.out.println("=== INVOICE ===");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Amount of Sale : " + amountOfSale);
    }
}
