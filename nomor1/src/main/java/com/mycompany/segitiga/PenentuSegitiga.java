/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segitiga;
import java.util.Arrays;

/**
 *
 * @author imrong, fadhil
 */
public class PenentuSegitiga {
    private boolean sama(float a, float b) {
        float selisih = Math.abs(a - b);
        float maks = Math.max(a, b);
        return selisih <= 0.01f * maks;
    }
    
    
    public String cekSegitiga(float a, float b, float c) {
        float[] sisi = {a, b, c};
        Arrays.sort(sisi);
        
        // terurut x sisi terkecil, y sisi tengah, z sisi terbesar
        float x = sisi[0]; float y = sisi[1]; float z = sisi[2];
        float kuadratTerbesar = z*z;
        float jumlahKuadratKecil = (x*x) + (y*y);
        float selisihKuadrat = Math.abs(kuadratTerbesar - jumlahKuadratKecil);
        
        if (x <= 0 || y <= 0 || z <= 0) {
            return "Rule 1, Tidak dapat dibangun";
        }
        
        if (z >= x+y) {
            return "Rule 2, Tidak dapat dibangun";
        }
        
        if (sama(x,y) || sama(y,z)) {
            return "Rule 3, Segitiga Sama Kaki (ISOSCELES)";
        }
        
        if (sama(x,y) && sama(y,z)) {
            return "Rule 4, Segitiga Sama Sisi (EQUILATERAL)";
        }
        
        if (selisihKuadrat <= 0.01f * kuadratTerbesar) {
            return "Rule 5, Segitiga Siku Siku (RIGHT TRIANGLE";
        }
        
        return "Rule 6, Segitiga Bebas";
    }
}
