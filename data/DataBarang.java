/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fajar
 */
package data;

import java.util.ArrayList;
import barang.Barang;

public class DataBarang {
    public static ArrayList<Barang> listBarang = new ArrayList<>();

    public static void tambahBarang(Barang b) {
        listBarang.add(b);
    }

    public static void tampilBarang() {
        if (listBarang.isEmpty()) {
            System.out.println("Barang kosong");
        } else {
            for (int i = 0; i < listBarang.size(); i++) {
                Barang b = listBarang.get(i);
                System.out.println((i + 1) + ". " + b.getNama() +
                        " | Harga: " + b.getHarga() +
                        " | Stok: " + b.getStok());
            }
        }
    }

    public static Barang ambilBarang(int index) {
        if (index >= 0 && index < listBarang.size()) {
            return listBarang.get(index);
        }
        return null;
    }
}