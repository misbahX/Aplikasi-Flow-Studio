package mainUtama;
import java.util.*;
import mainClass.setPilihan;

public class Flowstudio {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        setPilihan ob = new setPilihan();

        while (ob.status) {
            ob.clearScreen();
            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                         "+ob.GREEN_BOLD+"SELAMAT DATANG DI FLOW STUDIO"+ob.YELLOW_BOLD+"                                             ║");
            System.out.println(""+ob.YELLOW_BOLD+"║                       "+ob.GREEN_BOLD+"Jl. Leuwi panjang no. 52 A (lantai 2)   |   Bandung | 087808080347"+ob.YELLOW_BOLD+"                          ║");
            System.out.println(""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Berikut pilihan jasa yang kami tawarkan :"+ob.YELLOW_BOLD+"                                                                         ║ \n║                                                                                                                   ║"+ob.WHITE+"");
            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"1. Print Pricelist "+ob.YELLOW_BOLD+"                                                                                               ║");
            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"2. Rent Pricelist "+ob.YELLOW_BOLD+"                                                                                                ║");
            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"3. Family Photo Packages "+ob.YELLOW_BOLD+"                                                                                         ║");
            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"4. Maternity Photo Packages "+ob.YELLOW_BOLD+"                                                                                      ║");
            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"5. Group Photo Packages "+ob.YELLOW_BOLD+"                                                                                          ║");
            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"6. Graduating Photo Packages "+ob.YELLOW_BOLD+"                                                                                     ║ \n║                                                                                                                   ║"+ob.WHITE+"");
            ob.pilihan = ob.getPilihan("Masukan pilihan jasa");
            ob.pilihanJasa(ob.pilihan);
            for (int i=0;i<ob.jasa_dipesan.length;i++) {
                for (int j=0;j<ob.jasa_dipesan[0].length;j++) {
                    ob.jasa_dipesan[i][j] = null;
                }
            }
            for (int i=0;i<ob.jasaSementara.length;i++) {
                for (int j=0;j<ob.jasaSementara[0].length;j++) {
                    ob.jasaSementara[i][j] = null;
                }
            }
            ob.status = ob.getYesOrNo("Pesan lagi? ");
        }
    }
    
}
