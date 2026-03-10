/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaskelompokno3;
import java.util.Scanner;
/**
 *
 * @author imran, kadhim, fadhil, hamad
 */
public class Tugaskelompokno3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        account acc1 = new account("A001", "valid");
        account acc2 = new account("A002", "invalid");

        System.out.print("Masukkan Account Number: ");
        String accInput = input.nextLine();

        System.out.print("Masukkan Amount of Sale: ");
        double amount = input.nextDouble();

        if(accInput.equals(acc1.accountNumber) && acc1.statusCode.equals("valid")) {

            invoice invoice = new invoice(accInput, amount);
            invoice.printInvoice();

        } else {
            System.out.println("Error: Account tidak ditemukan atau status tidak valid");
        }

    }
}
