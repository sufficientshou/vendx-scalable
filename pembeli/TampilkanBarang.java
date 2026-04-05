/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek_uts;

/**
 *
 * @author farid
 */
public class TampilkanBarang {
    DataBarang data;

    public TampilkanBarang(DataBarang data) {
        this.data = data;
    }

    public void tampil() {
        System.out.println("Selamat datang di Toko Sembako Kami");
        System.out.println("===================================");
        System.out.println("");
        System.out.println("1. Bir: " + data.Bir);
  
      System.out.println("2. Alkohol: " + data.alkohol);
        System.out.println("3. Wine: " + data.wine);
        System.out.println("4. TVirus: " + data.TVirus);
        System.out.println("");
        System.out.println("===================================");
    }
}
