/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.ukl;

/**
 *
 * @author ASUS TUFF
 */
public class LATIHANUKL3 {
  public static void main (String[] args){
      
  int sukupertama = 10;
  int selisih = 5;
  int nilaimax = 80;
  int updatenilai =0;
  int sukusaatini;

  System.out.println("Deret Aritmatika");
  
  System.out.println("=====Deret Aritmatika=====");
        for(int i = 0; i <3; i++){
            for(int b =0; b<5; b++ ){
                
                sukusaatini = sukupertama;
                sukupertama += selisih;
                
                updatenilai += sukusaatini;
                
                
                System.out.print(" "+sukusaatini);
            }
            System.out.println(" ");
        }
        System.out.println("Total jumlah Deret Aritmatika adalah "+updatenilai);
        
        
            
          
  }       
}
