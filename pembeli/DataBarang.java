  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek_uts;

/**
 *
 * @author farid
 */
public class DataBarang {
    int Bir = 23;
    int alkohol = 13;
    int wine = 23;
    int TVirus = 3;

    public boolean beliBarang(int pilihan) {
        switch (pilihan) {
            case 1:
                if (Bir > 0) { Bir--; return true; }
                break;
            case 2:
                if (alkohol > 0) { alkohol--; return true; }
                break;
            case 3:
                if (wine > 0) { wine--; return true; }
                break;
            case 4:
                if (TVirus > 0) { TVirus--; return true; }
                break;
        }
        return false; 
    }
}