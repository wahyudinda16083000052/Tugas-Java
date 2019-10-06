/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printer;

import java.util.Scanner;
public class Printer {
    public static void main(String[] args) {
        // TODO code application logic here
        int J; //input jumlah printer
        int H; //harga
        int T; //output harga
        int diskon;
        Scanner inputJ = new Scanner(System.in);
        
        H = 660000;
        System.out.println("---------------PRINTER EPSON T20--------------");
        System.out.println("Harga Printer = " + H);
        System.out.print("Masukkan Jumlah Printer = ");
        J = inputJ.nextInt();
        
        System.out.println("----------------------------");
                    
        T = J * H;
        if (T>=1500000){
        System.out.println("Jumlah Printer = " + J);
        System.out.println("Harga Printer = " + H);
        System.out.println("Total awal = " + T);
        diskon = T*15/100;
        T = T - diskon ;
        System.out.println("Diskon 15%= " + diskon);
        System.out.println("Total = " + T);
        }
        else{
            System.out.println("Jumlah Printer = " + J);
            System.out.println("Harga Printer = " + H);
            System.out.println("Diskon 15%= 0 ");
            System.out.println("Total = " + T);
        }
    }
    
}
