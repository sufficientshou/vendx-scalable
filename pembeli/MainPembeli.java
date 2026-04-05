/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek_uts;

/**
 *
 * @author farid
 */
import java.util.*;

public class MainPembeli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DataBarang data = new DataBarang(); // ❗ cuma sekali
        TampilkanBarang tampil = new TampilkanBarang(data);

        ArrayList<String> keranjang = new ArrayList<>();

        boolean selesai = false;

        while (!selesai) {
            keranjang.clear();
            boolean tambahLagi = true;

            while (tambahLagi) {
                tampil.tampil();

                System.out.print("Pilih barang (1-4): ");
                int pilihan = input.nextInt();

                boolean berhasil = data.beliBarang(pilihan);

                if (berhasil) {
                    switch (pilihan) {
                        case 1: keranjang.add("Bir"); break;
                        case 2: keranjang.add("Alkohol"); break;
                        case 3: keranjang.add("Wine"); break;
                        case 4: keranjang.add("TVirus"); break;
                    }
                    System.out.println("Barang berhasil ditambahkan!");
                } else {
                    System.out.println("Stok habis!");
                }

                System.out.print("Ada lagi? (y/n): ");
                char lagi = input.next().charAt(0);

                if (lagi == 'n') tambahLagi = false;
            }

            System.out.println("\nKeranjang kamu:");
            for (String item : keranjang) {
                System.out.println("- " + item);
            }

            System.out.print("Sudah OK? (y/n): ");
            char ok = input.next().charAt(0);

            if (ok == 'y') {
                selesai = true;
                System.out.println("Transaksi selesai!");
            } else {
                System.out.println("Ulang belanja...");
            }
        }
    }
}
