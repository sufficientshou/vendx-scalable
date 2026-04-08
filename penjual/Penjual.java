/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjual;

/**
 *
 * @author Lenovo
 */

import java.util.*;
import data.DataBarang;
import barang.Barang;

public class Penjual {
    public void menu(){
        Scanner input = new Scanner(System.in);
        String c = "", ch = "";

        do {
            System.out.println("===================================");
            System.out.println("    Selamat datang! Siap cuan?");
            System.out.println("===================================");
            System.out.println("Menu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Persediaan Gudang");
            System.out.println("-----------------------------------");
            System.out.print("Pilih menu : ");

            int p = input.nextInt();
            input.nextLine();

            switch(p){
                case 1 :
                    do{
                        System.out.println("===================================");
                        System.out.println("         Penambahan Item");
                        System.out.println("===================================");

                        System.out.print("Nama Barang : ");
                        String nama = input.nextLine();

                        System.out.print("Harga : ");
                        int harga = input.nextInt();

                        System.out.print("Stok : ");
                        int stok = input.nextInt();
                        input.nextLine();

                        Barang b = new Barang(nama, harga, stok);

                        DataBarang.tambahBarang(b);

                        System.out.println("Barang berhasil ditambahkan!");

                        System.out.println("-----------------------------------");
                        System.out.print("Apakah ingin menambah lagi? [y/n] : ");
                        ch = input.nextLine();

                    }while(ch.equalsIgnoreCase("y"));
                    break;

                case 2 :
                    System.out.println("===================================");
                    System.out.println("       Persediaan Komoditas");
                    System.out.println("===================================");
                    DataBarang.tampilBarang();
                    break;

                default :
                    System.out.println("===================================");
                    System.out.println("    Maaf menu tidak ditemukan!");
                    break;
            }

            System.out.println("-----------------------------------");
            System.out.print("Kembali ke menu? [y/n] : ");
            c = input.nextLine();

        }while(c.equalsIgnoreCase("y"));

        System.out.println("===================================");
        System.out.println("     Sukses selalu jualannya!");
    }
};