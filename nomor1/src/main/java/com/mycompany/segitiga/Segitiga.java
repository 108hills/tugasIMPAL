/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segitiga;
import java.util.Scanner;
/**
 *
 * @author hamad, imrong, kadhim, fadhil
 */
public class Segitiga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PenentuSegitiga penentu = new PenentuSegitiga();
        String hasil;
        
        System.out.println("Masukkan nilai a: ");
        float a = scanner.nextFloat();
        
        System.out.println("Masukkan nilai b: ");
        float b = scanner.nextFloat();
        
        System.out.println("Masukkan nilai c: ");
        float c = scanner.nextFloat();
        
        hasil = penentu.cekSegitiga(a,b,c);
        System.out.println(hasil);
        
        scanner.close();
    }
}
