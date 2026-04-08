/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penjual;

/**
 *
 * @author Lenovo
 */
import java.util.*;
import data.DataBarang;

public class Penjual {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DataBarang db = new DataBarang();
        String c = "", ch = "";
        
        do {
            System.out.println("===================================");
            System.out.println("    Selamat datang! Siap cuan?");
            System.out.println("===================================");
            System.out.println("Menu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Persediaan Gudang");
            System.out.println("-----------------------------------");
            System.out.println("Pilih menu : ");
                int p = input.nextInt();
                input.nextLine();

            switch(p){
                case 1 :
                    do{
                    System.out.println("===================================");
                    System.out.println("         Penambahan Item");
                    System.out.println("===================================");
                    System.out.println("Nama Barang : ");
                    
                    System.out.println("Harga : ");
                    
                    System.out.println("Stok : ");
                    
                    input.nextLine();
                    
                    System.out.println("-----------------------------------");
                    System.out.println("Apakah ingin menambah lagi? [y/n] : ");
                        ch = input.nextLine();
                    }while(ch.equalsIgnoreCase("y"));
                    break;
                case 2 :
                    System.out.println("===================================");
                    System.out.println("       Persediaan Komoditas");
                    System.out.println("===================================");
                    db.tampilBarang();
                    break;
                default :
                    System.out.println("===================================");
                    System.out.println("    Maaf menu tidak ditemukan!");
                    break;
            }
            System.out.println("-----------------------------------");
            System.out.println("Kembali ke menu? [y/n] : ");
                c = input.nextLine();
        }while(c.equalsIgnoreCase("y"));
        
        System.out.println("===================================");
        System.out.println("     Sukses selalu jualannya!");
    }
}
