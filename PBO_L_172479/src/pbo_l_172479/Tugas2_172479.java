/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_l_172479;

/**
 *
 * @author Adam
 */
import java.util.Scanner;
public class Tugas2_172479 {
    public static void main(String args[]){
        Scanner masukan = new Scanner (System.in);
        String nama;
        int nim,umur;
       
        System.out.print("Nim: ");
        nim = masukan.nextInt();
        System.out.print("Nams: ");
         nama = masukan.next();
        System.out.print("umur: ");
        umur = masukan.nextInt();
        
           System.out.print("Nim "+nim);
           System.out.print(" Dengan Nama "+nama);
           System.out.print(" berumur " +umur+ " tahun");


}
}
