/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nomer2;
import java.util.Scanner;
/**
 *
 * @author kadhim, hamad, fadhil
 */
public class Nomer2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PenentuHarga penentu = new PenentuHarga();
        int hasil;
        
        System.out.println("Masukkan jumlah komputer: ");
        int cAmount = input.nextInt();
        
        System.out.println("Apakah waktu service berada pada jam kerja? (true/false): ");
        boolean sTime = input.nextBoolean();
        
        System.out.println("Apakah customer drop-off dan pick-up sendiri? (true/false)");
        boolean customerDropPick = input.nextBoolean();
        
        hasil = penentu.cekHarga(cAmount, sTime, customerDropPick);
        System.out.println("Total Harga: " + hasil);
    }
}
