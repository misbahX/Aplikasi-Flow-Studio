package mainClass;
import java.util.*;
import mainClass.setPilihan;

public class rentPricelist {
    public static int [] jasa_pilihan;
    
    //    method pemilihan2 dari pilihan yang pertama
    public static void pilihan2(int pilihan) {
        Scanner in = new Scanner(System.in);
        setPilihan ob = new setPilihan();
        ob.jasa_dipesan[0][0] = "Rent_Pricelist";
        switch (pilihan) {
            case 1 :
                ob.jasa_dipesan[0][1] = "2_Jam";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 200.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(200000);
            break;
            
            case 2 :
                ob.jasa_dipesan[0][1] = "4_Jam";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 35.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(35000);
            break;
            
            case 3 :
                ob.jasa_dipesan[0][1] = "6_Jam";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 475.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(475000);
            break;
            
            case 4 :
                ob.jasa_dipesan[0][1] = "8_Jam";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 600.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(600000);
            break;
            
            case 5 :
                ob.jasa_dipesan[0][1] = "10_Jam";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 725.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(725000);
            break;
            
            default :
                System.err.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Jasa tidak ada :("+ob.YELLOW_BOLD+"                                                                                                 ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
        }
    }
}
