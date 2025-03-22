package pertemuan302;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // percabangan IF
        //lulus apabila niali 80 keatas
        
        int nilai=0;
        String ket;
        
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("Input Nilai: ");
        nilai= Integer.parseInt(dtIN.nextLine());
                
        if(nilai>=80){
            ket="Lulus";
            
        }else{
            ket= "Tidak lulus";                     
        }
        System.out.printf("dinyatakan %s", ket);
    }
    
}
