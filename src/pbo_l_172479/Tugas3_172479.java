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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import  java.util.Scanner;
public class Tugas3_172479 {
       public static <T> T[] push(T[] arr, T item) {
        T[] tmp = Arrays.copyOf(arr, arr.length + 1);
        tmp[tmp.length - 1] = item;
        return tmp;
    }
    public static void main(String[] args) throws IOException{
        String[] nama = {}, nim = {}, umur = {};
        String loop, jurusan;
        Boolean stop = false;
        int count = 1;
        
        BufferedReader input = new BufferedReader  (new InputStreamReader (System.in));
        System.out.println("Input Data");
        while(!stop){
            System.out.print("NIM   :");
            nim = Tugas3_172479.push(nim, input.readLine());
            System.out.print("Nama  :");
            nama = Tugas3_172479.push(nama, input.readLine());
            System.out.print("Umur  :");
            umur = Tugas3_172479.push(umur, input.readLine());
            System.out.print("Input data lagi [Y/N]");
            loop = input.readLine();
            if (loop.matches("n") || loop.matches("N")) stop = true;
        }
            System.out.println("");
            System.out.println("Output Data");
        for (int i = 0; i < nim.length; i++) {
            System.out.println("Data mahasiswa " + count++);
            if (nim[i].substring(2, 3).matches("2")) {
                jurusan = "Teknik Informatika";
            } else if (nim[i].substring(2, 3).matches("1")) {
                jurusan = "Sistem Informasi";
            } else if (nim[i].substring(2, 3).matches("3")) {
                jurusan = "Manajemen";
            } else {
                jurusan = "Rekayasa Perangkat Lunak";
            }
            System.out.println("NIM   : " + nim[i]);
            System.out.println("Nama  : " + nama[i]);
            System.out.println("Prod  : " + jurusan);
            System.out.println("Umur  : " + umur[i] + " Tahun");
        }
    }
}

        
    

