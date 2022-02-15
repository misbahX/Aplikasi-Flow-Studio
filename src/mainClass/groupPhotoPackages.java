package mainClass;
import java.util.*;
import mainClass.setPilihan;

public class groupPhotoPackages {
    public static int [] jasa_pilihan;
    
    public static void pilihan5(int pilihan) {
        Scanner in = new Scanner(System.in);
        setPilihan ob = new setPilihan();
        ob.jasa_dipesan[0][0] = "Group_Photo_Packages";
        switch (pilihan) {
            case 0 :
                System.out.println(""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                jasa_pilihan = new int [ob.getPilihan("Mau berapa pilihan")];
                for(int i=0;i<jasa_pilihan.length;i++) {
                    jasa_pilihan[i] = ob.getPilihan("Masukan pilihan anda");
                }
                for (int i=0;i<jasa_pilihan.length;i++) {
                    if (jasa_pilihan[i] == 1) {
                        ob.jasaSementara[0][i] = "Just_a_friends";
                        ob.setHarga(27500);
                    } else if (jasa_pilihan[i] == 2) {
                        ob.jasaSementara[0][i] = "Best_Friends";
                        ob.setHarga(350000);
                    } else if (jasa_pilihan[i] == 3) {
                        ob.jasaSementara[0][i] = "Good_Freinds";
                        ob.setHarga(300000);
                    } else if (jasa_pilihan[i] == 4) {
                        ob.jasaSementara[0][i] = "Soul Mates";
                        ob.setHarga(475000);
                    } else {
                        System.err.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Jasa tidak ada :("+ob.YELLOW_BOLD+"                                                                                                 ║");
                        System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    }
                }
            break;
            
            case 1 :
                ob.jasa_dipesan[0][1] = "Just_a_Friends";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 275.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(27500);
            break;
            
            case 2 :
                ob.jasa_dipesan[0][1] = "Best_Friends";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 350.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(350000);
            break;
            
            case 3 :
                ob.jasa_dipesan[0][1] = "Good_Freinds";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 300.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(300000);
            break;
            
            case 4 :
                ob.jasa_dipesan[0][1] = "Soul Mates";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 475.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                ob.setHarga(475000);
            break;
        }
    }
}
