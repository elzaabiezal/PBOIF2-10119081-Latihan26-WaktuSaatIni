/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 * Nama  : Muhammad Elza Abiezal
 * Kelas : IF-2
 * NIM   : 10119081
 * Deskripsi program : Waktu Saat ini
 */
public class PBOIF210119081Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date tanggal = new Date();
        
        SimpleDateFormat format = new SimpleDateFormat("E dd MMMM yyyy HH:mm:ss");
        System.out.println("Hari ini adalah hari : " + format.format(tanggal));
        System.out.println("Developed by : Muhammad Elza Abiezal");
    }
    
}
