/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fajar
 */
package transaksi;

import barang.Barang;

public class Transaksi {
    private Barang barang;
    private int jumlah;
    private int total;

    public Transaksi(Barang barang, int jumlah) {
        this.barang = barang;
        this.jumlah = jumlah;
        hitungTotal();
    }

    public void hitungTotal() {
        total = barang.getHarga() * jumlah;
    }

    public void cetakStruk() {
        System.out.println("\n=== STRUK ===");
        System.out.println("Barang : " + barang.getNama());
        System.out.println("Harga  : " + barang.getHarga());
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : " + total);
    }
}
