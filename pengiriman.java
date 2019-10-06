/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengirimanPaket;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class pengiriman {
        public static void main(String[] args){
            int pilih, total, ongkos, km;
            
        Scanner input = new Scanner(System.in);
        System.out.println("---------------destinasi tujuan--------------");
        System.out.println("1. SURABAYA");
        System.out.println("2. BANDUNG");
        System.out.println("Pilih Tujuan Pengiriman :");
        pilih = input.nextInt();
        System.out.println("-------------------------------------------");

        switch(pilih){
          case 1 :
              ongkos = 2500;
              km  = 169;
              total = ongkos * km ;
              System.out.println("-------------------------------------------");
              System.out.println("Pengiriman MALANG ke SURABAYA");
              System.out.println("Jarak :" + km + "km");
              System.out.println("ongkos/km :" + ongkos );
              System.out.println("Total Ongkir:" + total);
              break;
          
          case 2 :
              ongkos = 4000;
              km  = 452;
              total = ongkos * km ;
              System.out.println("-------------------------------------------");
              System.out.println("Pengiriman MALANG ke BANDUNG");
              System.out.println("Jarak :" + km +"km");
              System.out.println("ongkos/km :" + ongkos );
              System.out.println("Total Ongkir:" + total);
              break;
             
          default:
          System.out.println("DESTINASI YANG ANDA MASUKKAN TIDAK TERSEDIA");
        }
    }
}
