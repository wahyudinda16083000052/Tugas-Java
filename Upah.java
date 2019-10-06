/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upah;

import java.util.Scanner;
public class Upah {
    public static void main(String[] args){
      int upah, jam, total, pajak, hasil;  
      
      Scanner input = new Scanner(System.in);
      System.out.println("---------------UPAH KERJA/JAM--------------");
      System.out.println("LAMA JAM KERJA : ");
      jam = input.nextInt();
      
      switch(jam){
          case 1 :
              upah = 2500;
              total = upah * 1 ;
              pajak = total * 15 / 100;
              hasil = total - pajak ;
              System.out.println("-------------------------------------------");
              System.out.println("Total Upah/jam : " + total);
              System.out.println("pajak 15% : " + pajak);
              System.out.println("Upah diterima : " + hasil);
              break;
              
          case 2 :
              upah = 2500;
              total = upah * 2 ;
              pajak = total * 15 / 100;
              hasil = total - pajak ;
              System.out.println("-------------------------------------------");
              System.out.println("upah diterima : " + total);
              System.out.println("pajak 15% : " + pajak);
              System.out.println("Upah diterima : " + hasil);
              break;
          
          case 3 :
              upah = 2500;
              total = upah * 3 ;
              pajak = total * 15 / 100;
              hasil = total - pajak ;
              System.out.println("-------------------------------------------");
              System.out.println("upah diterima : " + total);
              System.out.println("pajak 15% : " + pajak);
              System.out.println("Upah diterima : " + hasil);
              break;
          
          case 4 :
              upah = 2500;
              total = upah * 4 ;
              pajak = total * 15 / 100;
              hasil = total - pajak ;
              System.out.println("-------------------------------------------");
              System.out.println("upah diterima :" + total);
              System.out.println("pajak 15% : " + pajak);
              System.out.println("Upah diterima : " + hasil);
              break;
          
          case 5 :
              upah = 2500;
              total = upah * 5 ;
              pajak = total * 15 / 100;
              hasil = total - pajak ;
              System.out.println("-------------------------------------------");
              System.out.println("upah diterima :" + total);
              System.out.println("pajak 15% : " + pajak);
              System.out.println("Upah diterima : " + hasil);
              break;
          
          case 6 :
              upah = 2500;
              total = upah * 6 ;
              pajak = total * 15 / 100;
              hasil = total - pajak ;
              System.out.println("-------------------------------------------");
              System.out.println("upah diterima : " + total);
              System.out.println("pajak 15% : " + pajak);
              System.out.println("Upah diterima : " + hasil);
              break;
          
          case 7 :
              upah = 2500;
              total = upah * 7 ;
              pajak = total * 15 / 100;
              hasil = total - pajak ;
              System.out.println("-------------------------------------------");
              System.out.println("upah diterima : " + total);
              System.out.println("pajak 15% : " + pajak);
              System.out.println("Upah diterima : " + hasil);
              break;
         
          case 8 :
              upah = 2500;
              total = upah * 8 ;
              pajak = total * 15 / 100;
              hasil = total - pajak ;
              System.out.println("-------------------------------------------");
              System.out.println("upah diterima" + total);
              System.out.println("pajak 15% : " + pajak);
              System.out.println("Upah diterima : " + hasil);
              break;
            
          default:
          System.out.println("MAKSIMAL JAM KERJA ADALAH 8 JAM ");    
      }
      
    }
}
