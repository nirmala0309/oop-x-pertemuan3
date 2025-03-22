package pertemuan303;

import java.util.Scanner;

/**
 *
 * @author Diva cantik
 */
public class Pertemuan303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pilih;
        Scanner dtLN = new Scanner(System.in);
        
        System.out.print("pilih menu A/B/C: ");
        pilih= dtLN.nextLine();
        switch (pilih) {
            case "A":
                System.out.println("Memilih menu A");
                break;
            case "B":
                System.out.println("memilih menu B");
                break;
             case "C":
                System.out.println("memilih menu C");
                break;
            default:
                System.out.println("Pilihan di luar Menu A/B/C");
        }
    }
    
}
