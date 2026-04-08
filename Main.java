import java.util.Scanner;
import penjual.Penjual;
import pembeli.Pembeli;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Penjual penjual = new Penjual();
        Pembeli pembeli = new Pembeli();

        int pilih;

        do {
            System.out.println("\n=== SISTEM VENDX ===");
            System.out.println("1. Penjual");
            System.out.println("2. Pembeli");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    penjual.menu();
                    break;
                case 2:
                    pembeli.menu();
                    break;
            }
        } while (pilih != 3);

        System.out.println("Program selesai.");
    }
}