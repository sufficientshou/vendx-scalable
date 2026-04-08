/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembeli;

/**
 *
 * @author farid
 */

import java.util.*;
import data.DataBarang;
import barang.Barang;
import transaksi.Transaksi;

public class Pembeli {
    Scanner input = new Scanner(System.in);

    public void menu() {
        boolean selesai = false;

        while (!selesai) {
            ArrayList<Barang> keranjang = new ArrayList<>();

            boolean tambahLagi = true;

            while (tambahLagi) {
                DataBarang.tampilBarang();

                System.out.print("Pilih nomor barang: ");
                int pilihan = input.nextInt() - 1;

                Barang b = DataBarang.ambilBarang(pilihan);

                if (b != null) {
                    System.out.print("Jumlah beli: ");
                    int jumlah = input.nextInt();

                    if (DataBarang.kurangiStok(b, jumlah)) {
                        keranjang.add(b);
                        System.out.println("Barang berhasil ditambahkan!");
                    } else {
                        System.out.println("Stok tidak cukup!");
                    }
                } else {
                    System.out.println("Barang tidak ditemukan!");
                }

                System.out.print("Tambah lagi? (y/n): ");
                char lagi = input.next().charAt(0);

                if (lagi == 'n' || lagi == 'N') {
                    tambahLagi = false;
                }
            }

            System.out.println("\n===== KERANJANG =====");
            for (Barang item : keranjang) {
                System.out.println("- " + item.getNama());
            }

            System.out.print("Selesai belanja? (y/n): ");
            char ok = input.next().charAt(0);

            if (ok == 'y' || ok == 'Y') {
                selesai = true;
                System.out.println("Transaksi selesai!");
            } else {
                System.out.println("Ulang belanja...");
            }
        }
    }
};