package mainClass;
import java.util.*;
import mainClass.printPricelist;
import mainClass.rentPricelist;
import mainClass.familyPhotoPackages;
import mainClass.maternityPhotoPackages;
import mainClass.groupPhotoPackages;
import mainClass.graduatingPhotoPackages;

public class setPilihan {
   public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
    
//    Variable
   public static int harga,pilihan;
   public static String nama, noHp;
   public static String [][] jasa_dipesan = new String[8][8];
   public static String [][] jasaSementara = new String[2][16];
   public static boolean status = true;
   public static int [] jasa_pilihan;
   
   //    method pilihan jasa
    public static void pilihanJasa(int pilihan) {
        Scanner in = new Scanner(System.in);
        printPricelist ob1 = new printPricelist();
        rentPricelist ob2 = new rentPricelist();
        familyPhotoPackages ob3 = new familyPhotoPackages();
        maternityPhotoPackages ob4 = new maternityPhotoPackages();
        groupPhotoPackages ob5 = new groupPhotoPackages();
        graduatingPhotoPackages ob6 = new graduatingPhotoPackages();
        
        
        
        switch (pilihan) {
                
            case 1 :
                System.out.println(""+YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+YELLOW_BOLD+"║                                             "+GREEN_BOLD+"PRINT PRICELIST"+YELLOW_BOLD+"                                                       ║");
                System.out.println(""+YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"Kami memiliki 2 pilihan:"+YELLOW_BOLD+"                                                                                          ║\n"+YELLOW_BOLD+"║                                                                                                                   ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"1. Cetak Photo"+YELLOW_BOLD+"                                                                                                    ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"2. Cetak Kanvas"+YELLOW_BOLD+"                                                                                                   ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"0. Pilih Keduanya"+YELLOW_BOLD+"                                                                                                 ║\n"+YELLOW_BOLD+"║                                                                                                                   ║");
                ob1.pilihan1(getPilihan("Masukan pilihan anda"));
                
                status = getYesOrNo("Proses pesanan?");
                if (status == true) {
                    pertanyaanPersonal();
                } else {
                    return;
                }
            break;
            
            case 2 :
                System.out.println(""+YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+YELLOW_BOLD+"║                                             "+GREEN_BOLD+"RENT PRICELIST"+YELLOW_BOLD+"                                                        ║");
                System.out.println(""+YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"Kami memiliki beberapa pilihan:"+YELLOW_BOLD+"                                                                                   ║\n"+YELLOW_BOLD+"║                                                                                                                   ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"1. 2 Jam"+YELLOW_BOLD+"                                                                                                          ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"2. 4 Jam"+YELLOW_BOLD+"                                                                                                          ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"3. 6 Jam"+YELLOW_BOLD+"                                                                                                          ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"4. 8 Jam"+YELLOW_BOLD+"                                                                                                          ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"5. 10 Jam"+YELLOW_BOLD+"                                                                                                         ║\n"+YELLOW_BOLD+"║                                                                                                                   ║");
                ob2.pilihan2(getPilihan("Masukan pilihan anda"));
                status = getYesOrNo("Proses pesanan? ");
                if (status == true) {
                    pertanyaanPersonal();
                } else {
                    return;
                }
            break;
            
            case 3 :
                System.out.println(""+YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+YELLOW_BOLD+"║                                          "+GREEN_BOLD+"FAMILY PHOTO PACKAGES"+YELLOW_BOLD+"                                                    ║");
                System.out.println(""+YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"Kami memiliki beberapa pilihan:"+YELLOW_BOLD+"                                                                                   ║\n"+YELLOW_BOLD+"║                                                                                                                   ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"1. Browze"+YELLOW_BOLD+"                                                                                                         ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"2. Silver"+YELLOW_BOLD+"                                                                                                         ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"3. Gold"+YELLOW_BOLD+"                                                                                                           ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"4. Platinum"+YELLOW_BOLD+"                                                                                                       ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"0. Pilih beberapa"+YELLOW_BOLD+"                                                                                                 ║\n"+YELLOW_BOLD+"║                                                                                                                   ║");
                ob3.pilihan3(getPilihan("Masukan pilihan anda"));
                status = getYesOrNo("Proses pesanan? ");
                if (status == true) {
                    pertanyaanPersonal();
                } else {
                    return;
                }
            break;
            
            case 4 :
                System.out.println(""+YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+YELLOW_BOLD+"║                                          "+GREEN_BOLD+"MATERNITY PHOTO PACKAGES"+YELLOW_BOLD+"                                                 ║");
                System.out.println(""+YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"Kami memiliki beberapa pilihan:"+YELLOW_BOLD+"                                                                                   ║\n"+YELLOW_BOLD+"║                                                                                                                   ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"1. Bronze"+YELLOW_BOLD+"                                                                                                         ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"2. Silver"+YELLOW_BOLD+"                                                                                                         ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"3. Gold"+YELLOW_BOLD+"                                                                                                           ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"0. Pilih beberapa"+YELLOW_BOLD+"                                                                                                 ║\n"+YELLOW_BOLD+"                                                                                                                   ║");
                ob4.pilihan4(getPilihan("Masukan pilihan anda"));
                status = getYesOrNo("Proses pesanan? ");
                if (status == true) {
                    pertanyaanPersonal();
                } else {
                    return;
                }
            break;
            
            case 5 : 
                System.out.println(""+YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+YELLOW_BOLD+"║                                            "+GREEN_BOLD+"GROUP PHOTO PACKAGES"+YELLOW_BOLD+"                                                   ║");
                System.out.println(""+YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"Kami memiliki beberapa pilihan:"+YELLOW_BOLD+"                                                                                   ║\n"+YELLOW_BOLD+"║                                                                                                                 ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"1. Just a Friends"+YELLOW_BOLD+"                                                                                                 ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"2. Good Friends"+YELLOW_BOLD+"                                                                                                   ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"3. Best Friends"+YELLOW_BOLD+"                                                                                                   ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"4. Soul Mates"+YELLOW_BOLD+"                                                                                                     ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"0. Pilih beberapa"+YELLOW_BOLD+"                                                                                                 ║\n"+YELLOW_BOLD+"║                                                                                                                 ║");
                ob5.pilihan5(getPilihan("Masukan pilihan anda"));
                status = getYesOrNo("Proses pesanan? ");
                if (status == true) {
                    pertanyaanPersonal();
                } else {
                    return;
                }
            break;
            
            case 6 :
                System.out.println(""+YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+YELLOW_BOLD+"║                                           "+GREEN_BOLD+"GRADUATING PHOTO PACKAGES"+YELLOW_BOLD+"                                               ║");
                System.out.println(""+YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"Kami memiliki beberapa pilihan:"+YELLOW_BOLD+"                                                                                   ║\n"+YELLOW_BOLD+"║                                                                                                                 ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"1. Bronze"+YELLOW_BOLD+"                                                                                                         ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"2. Silver"+YELLOW_BOLD+"                                                                                                         ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"3. Gold"+YELLOW_BOLD+"                                                                                                           ║");
                System.out.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"0. Pilih beberapa"+YELLOW_BOLD+"                                                                                                 ║\n"+YELLOW_BOLD+"║                                                                                                                 ║");
                ob6.pilihan6(getPilihan("Masukan pilihan anda"));
                status = getYesOrNo("Proses pesanan? ");
                if (status == true) {
                    pertanyaanPersonal();
                } else {
                    return;
                }
            break;
            
            default :
                System.err.println(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"Gak ada jasanya kak :("+YELLOW_BOLD+"                                                                                            ║\n"+YELLOW_BOLD+"║ Mohon maaf                                                                                                      ║");
                System.out.println(""+YELLOW_BOLD+"║                                                                                                                   ║");
        }
    }
    
    public static String getNama(String nama) {
        char[] ch=nama.toCharArray();    
        for(int i=0;i<ch.length;i++){    
            if (ch[i] == ' ') {
                ch[i] = ' ';
            }
        }
        String str = String.valueOf(ch);
        
        return str;

    }
    
//    pertanyaan personal 1
    public static void pertanyaanPersonal() {
        Scanner in = new Scanner(System.in);
        System.out.print(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"Masukan nama : ");
        nama = getNama(in.nextLine());
        
        System.out.print(""+YELLOW_BOLD+"║ "+GREEN_BOLD+"Masukan No telpon : ");
        noHp = in.next();
        System.out.println(""+YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
        struckPesanan();
    }
    
    public static void tampilkanJasa(String [][] data, String [][] data2) {   
        printPricelist ob1 = new printPricelist();
        for (int i=0;i<data.length;i++){
            for (int j=0;j<data[0].length;j++) {
                if (data[i][j] != null) {
                    if (data[i][j] == data[0][0]) {
                        System.out.printf(""+BLUE_BOLD+"║    "+WHITE+"Jasa Dipesan : %-30s              "+BLUE_BOLD+"║\n", jasa_dipesan[i][j]);
                    } else {
                        System.out.printf(""+BLUE_BOLD+"║    "+WHITE+"               %-30s              "+BLUE_BOLD+"║\n", jasa_dipesan[i][j]);
                    }
                }
            }
        }
        
        for (int i=0;i<data2.length;i++){
            for (int j=0;j<data2[0].length;j++) {
                if (data2[i][j] != null) {
                    System.out.printf(""+BLUE_BOLD+"║"+WHITE+"                   %-30s              "+BLUE_BOLD+"║\n", jasaSementara[i][j]);
                }
            }
        }
    }
    
    
//    struckPesanan
    public static void struckPesanan() {
        printPricelist ob1 = new printPricelist();
        Date date = new Date();
        System.out.println(""+BLUE_BOLD+"╔══════════════════════════════════════╗");
        System.out.println(""+BLUE_BOLD+"║                "+WHITE+"Struck Pesanan Jasa Flow Studio                "+BLUE_BOLD+"║"); 
        System.out.println(""+BLUE_BOLD+"║"+WHITE+"Jl. Leuwi panjang no. 52 A (lantai 2) Bandung | 087808080347"+BLUE_BOLD+"   ║");
        System.out.println(""+BLUE_BOLD+"╠══════════════════════════════════════╣"); 
        System.out.printf(""+BLUE_BOLD+"║    "+WHITE+"Waktu        : %-30s              "+BLUE_BOLD+"║\n",date.toString());
        System.out.printf(""+BLUE_BOLD+"║    "+WHITE+"Nama Pemesan : %-30s              "+BLUE_BOLD+"║\n", nama); 
        System.out.printf(""+BLUE_BOLD+"║    "+WHITE+"No. Pemesan  : %-30s              "+BLUE_BOLD+"║\n", noHp);
        tampilkanJasa(jasa_dipesan, jasaSementara);
        System.out.printf(""+BLUE_BOLD+"║    "+WHITE+"Total Harga  : "+RED+"Rp. %-,30d          "+BLUE_BOLD+"║\n", harga);
        System.out.println(""+BLUE_BOLD+"╔══════════════════════════════════════╗");
        System.out.println(""+BLUE_BOLD+"║              "+WHITE+"TERIMAKASIH SUDAH MEMESAN JASA KAMI              "+BLUE_BOLD+"║");
        System.out.println(""+BLUE_BOLD+"╚══════════════════════════════════════╝");
    }
    
public static int getPilihan(String message) {
    Scanner in = new Scanner(System.in);
    String bukti;
    String pilihan1;
    int pilihan2;
    
    Integer[] number = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
    String[] numberStr = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    
    List<Integer> intList = new ArrayList<>(Arrays.asList(number));
    List<String> nameList = new ArrayList<>(Arrays.asList(numberStr));
    
    System.out.print(""+YELLOW_BOLD+"║ "+GREEN_BOLD+message+" : ");
    pilihan1 = in.next();
    
    if (nameList.contains(pilihan1) == true) {
        pilihan2 = Integer.parseInt(pilihan1);
    } else {
        return 10;
    }
    
    if (intList.contains(pilihan2) == true) {
        return pilihan2;
    } else {
        return 10;
    }
}
    
//    method pertanyaan melanjutkan atau tidak
    public static boolean getYesOrNo(String message) {
        Scanner in = new Scanner(System.in);
        
        System.out.print(""+YELLOW_BOLD+"║                                                                                                                   ║\n"+YELLOW_BOLD+"║ "+GREEN_BOLD+""+message+" (y/n) ");
        String pilihan = in.next();
        
        while (!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("n")) {
            System.err.println(""+RED+"pilihan anda bukan y/n. Silahkan pilih dengan benar"+WHITE);
            System.out.print("\n"+GREEN_BOLD+message+" (y/n) ");
            pilihan = in.next();
        }
        return pilihan.equalsIgnoreCase("y");
    }
    
    
//    setHarga
    public static int setHarga(int hargaBarang) {
        if (harga == 0) {
            harga = hargaBarang;
        } else if (harga > 0) {
            harga += hargaBarang;
        }
        return harga;
    }
    
    
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("windows")) {
                new ProcessBuilder( "cmd", "/c", "cls" ).inheritIO().start().waitFor();
            } else {
                 System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
}
