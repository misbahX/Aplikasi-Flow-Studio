package mainClass;
import java.util.*;
import mainClass.setPilihan;

public class maternityPhotoPackages {
    public static int [] jasa_pilihan;
    
    public static void pilihan4(int pilihan) {
        Scanner in = new Scanner(System.in);
        setPilihan ob = new setPilihan();
        ob.jasa_dipesan[0][0] = "Maternity_Photo_Packages";
        
        switch (pilihan) {
            case 0 :
                System.out.println(""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                jasa_pilihan = new int [ob.getPilihan("Mau berapa pilihan")];
                for (int i=0;i<jasa_pilihan.length;i++) {
                    jasa_pilihan[i] = ob.getPilihan("Masukan pilihan");
                }
                for (int i=0;i<jasa_pilihan.length;i++) {
                    if (jasa_pilihan[i] == 1) {
                        ob.jasaSementara[0][i] = "Bronze";
                        ob.setHarga(550000);
                    } else if (jasa_pilihan[i] == 2) {
                        ob.jasaSementara[0][i] = "Silver";
                        ob.setHarga(850000);
                    } else if (jasa_pilihan[i] == 3) {
                        ob.jasaSementara[0][i] = "Gold";
                        ob.setHarga(1200000);
                    } else {
                        System.err.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Jasa tidak ada :("+ob.YELLOW_BOLD+"                                                                                                 ║");
                        System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    }
                }
            break;
            
            case 1 :
                ob.jasa_dipesan[0][1] = "Browze";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 550.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(550000);
            break;
            
            case 2 :
                ob.jasa_dipesan[0][1] = "Silver";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 850.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(850000);
            break;
            
            case 3 :
                ob.jasa_dipesan[0][1] = "Gold";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 1.200.000"+ob.YELLOW_BOLD+"                                                                                                   ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(1200000);
            break;
        }
    }
}
