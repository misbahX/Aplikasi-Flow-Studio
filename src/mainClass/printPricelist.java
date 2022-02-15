package mainClass;
import java.util.*;
import mainClass.setPilihan;

public class printPricelist {
    public static int [] jasa_pilihan;
    public static String [][] jasaSementara = new String[2][16];
    
    //    method pemilihan2 dari pilihan yang pertama
    public static void pilihan1(int pilihan) {
        Scanner in = new Scanner(System.in);
        setPilihan ob = new setPilihan();
        
        ob.jasa_dipesan[0][0] = "Print_Pricelist";
        
        switch (pilihan) {
            case 0 : 
                ob.jasa_dipesan[0][1] = "Cetak_Photo_&_Canvas";
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║                                                    "+ob.GREEN_BOLD+"CETAK PHOTO"+ob.YELLOW_BOLD+"                                                    ║");
                System.out.println(""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"berikut pilihan yang kami tawarkan:"+ob.YELLOW_BOLD+"                                                                               ║\n"+ob.YELLOW_BOLD+"║                                                                                                                   ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"1. 4R (8 x 12cm)"+ob.YELLOW_BOLD+"                                                                                                  ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"2. 5R (12 x 17cm)"+ob.YELLOW_BOLD+"                                                                                                 ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"3. 8Rp (20 x 30cm)"+ob.YELLOW_BOLD+"                                                                                                ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"4. 10R (25 x 30cm)"+ob.YELLOW_BOLD+"                                                                                                ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"5. 12Rp (30 x 45cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"6. 16Rp (40 x 60cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"7. 20Rp (50 x 70cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"8. 24Rp (60 x 90cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"0. Pilih beberapa"+ob.YELLOW_BOLD+"                                                                                                 ║\n"+ob.YELLOW_BOLD+"║                                                                                                                   ║");
                pilihan = ob.getPilihan("Masukan pilihan anda");
                switch (pilihan) {
                    case 0 :
                        System.out.println(""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                        jasa_pilihan = new int[ob.getPilihan("Mau berapa pilihan")];
                        for (int i=0;i<jasa_pilihan.length;i++) {
                            jasa_pilihan[i] = ob.getPilihan("Masukan pilihan");
                            
                        }
                        int index = 0;
                        for (int i=0;i<jasa_pilihan.length;i++) { // 1 2 3 
                            if (jasa_pilihan[i] == 1) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "4R_(Cetak_photo)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 20.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(20000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 2.500"+ob.YELLOW_BOLD+"                                                                                                       ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(2500);
                                }
                            } else if (jasa_pilihan[i] == 2) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "5R_(Cetak_photo)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 25.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(25000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 5.000"+ob.YELLOW_BOLD+"                                                                                                       ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(5000);
                                }
                            } else if (jasa_pilihan[i] == 3) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "8Rp_(Cetak_photo)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 40.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(40000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 15.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(15000);
                                }
                            } else if (jasa_pilihan[i] == 4) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "10R_(Cetak_photo)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 50.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(50000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ harga 20.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(20000);
                                }
                            } else if (jasa_pilihan[i] == 5) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "12Rp_(Cetak_photo)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 75.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(75000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 35.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(35000);
                                }
                            } else if (jasa_pilihan[i] == 6) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "16Rp_(Cetak_photo)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 175.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(175000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 750.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(75000);
                                }
                            } else if (jasa_pilihan[i] == 7) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "20Rp_(Cetak_photo)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(i+1)] = "Frame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(225000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 100.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(100000);
                                }
                            } else if (jasa_pilihan[i] == 8) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "24Rp_(Cetak_photo)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 325.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(325000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 150.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(150000);
                                }
                            } else {
                                System.err.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Jasa tidak ada :("+ob.YELLOW_BOLD+"                                                                                              ║");
                            }
                            index++;
                        }
                    break;
                    
                    case 1 :
                        ob.jasaSementara[0][0] = "4R_(Cetak_photo)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                        if (ob.status == true) {
                            ob.jasaSementara[0][1] = "Frame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 20.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(20000);
                        } else {
                            ob.jasaSementara[0][1] = "NoFrame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 2.500"+ob.YELLOW_BOLD+"                                                                                                       ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(2500);
                        }
                    break;

                    case 2 :
        //                ob.jasa_dipesan2[index][2] = "5R";
                        ob.jasaSementara[0][0] = "5R_(Cetak_photo)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                        if (ob.status == true) {
                            ob.jasaSementara[0][1] = "Frame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 25.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(25000);
                        } else {
                            ob.jasaSementara[0][1] = "NoFrame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 5.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(5000);
                        }
                    break;

                    case 3 :
        //                ob.jasa_dipesan2[index][2] = "8Rp";
                        ob.jasaSementara[0][0] = "8Rp_(Cetak_photo)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                        if (ob.status == true) {
                            ob.jasaSementara[0][1] = "Frame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 4.000"+ob.YELLOW_BOLD+"                                                                                                       ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(4000);
                        } else {
                            ob.jasaSementara[0][1] = "NoFrame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 150.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(15000);
                        }
                    break;

                    case 4 :
        //                ob.jasa_dipesan2[index][2] = "10R";
                        ob.jasaSementara[0][0] = "10R_(Cetak_photo)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                        if (ob.status == true) {
                            ob.jasaSementara[0][1] = "Frame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 50.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(50000);
                        } else {
                            ob.jasaSementara[0][1] = "NoFrame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 20.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(20000);
                        }
                    break;

                    case 5 :
        //                ob.jasa_dipesan2[index][2] = "4R";
                        ob.jasaSementara[0][0] = "12Rp_(Cetak_photo)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                        if (ob.status == true) {
                            ob.jasaSementara[0][1] = "Frame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 75.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(75000);
                        } else {
                            ob.jasaSementara[0][1] = "NoFrame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 35.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(35000);
                        }
                    break;

                    case 6 :
                        ob.jasaSementara[0][0] = "16Rp_(Cetak_photo)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                        if (ob.status == true) {
                            ob.jasaSementara[0][1] = "Frame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 175.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(175000);
                        } else {
                            ob.jasaSementara[0][1] = "NoFrame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 75.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(75000);
                        }
                    break;

                    case 7 : 
                        ob.jasaSementara[0][0] = "20Rp_(Cetak_photo)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                        if (ob.status == true) {
                            ob.jasaSementara[0][1] = "Frame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(225000);
                        } else {
                            ob.jasaSementara[0][1] = "NoFrame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 100.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(100000);
                        }
                    break;

                    case 8 :
                        ob.jasaSementara[0][0] = "24Rp_(Cetak_photo)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                        if (ob.status == true) {
                            ob.jasaSementara[0][1] = "Frame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 20.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(325000);
                        } else {
                            ob.jasaSementara[0][1] = "NoFrame_(Cetak_photo)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 150.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(150000);
                        }
                    break;
                    
                    default :
                        System.err.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Jasa tidak ada :("+ob.YELLOW_BOLD+"                                                                                              ║");
                }
                
                System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                System.out.println(""+ob.YELLOW_BOLD+"║                                                    "+ob.GREEN_BOLD+"CETAK KANVAS"+ob.YELLOW_BOLD+"                                                   ║");
                System.out.println(""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"berikut pilihan yang kami tawarkan:"+ob.YELLOW_BOLD+"                                                                               ║\n"+ob.YELLOW_BOLD+"║                                                                                                                   ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"1. 16R (40 x 50cm)"+ob.YELLOW_BOLD+"                                                                                                ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"2. 16Rp (40 x 60cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"3. 20R (50 x 60cm)"+ob.YELLOW_BOLD+"                                                                                                ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"4. 20Rp (50 x 70cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"5. 24R (30 x 45cm)"+ob.YELLOW_BOLD+"                                                                                                ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"6. 24Rp (40 x 60cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"0. Pilih beberapa"+ob.YELLOW_BOLD+"                                                                                                 ║\n"+ob.YELLOW_BOLD+"║                                                                                                                   ║");
                
                pilihan = ob.getPilihan("Masukan pilihan anda");
                switch (pilihan) {
                    case 0 :
                        System.out.println(""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                        jasa_pilihan = new int[ob.getPilihan("Mau berapa pilihan")];
                        for (int i=0;i<jasa_pilihan.length;i++) {
                            jasa_pilihan[i] = ob.getPilihan("Masukan pilihan jasa: ");
                            
                        }
                        int index = 0;
                        for (int i=0;i<jasa_pilihan.length;i++) { // 1 2 3 
                            if (jasa_pilihan[i] == 1) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[1][index] = "16R_(Cetak_kanvas)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 200.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(200000);
                                } else {
                                    ob.jasaSementara[1][(index+1)] = "Frame_ukir_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(225000);
                                }
                            } else if (jasa_pilihan[i] == 2) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[1][index] = "16Rp_(Cetak_kanvas";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(225000);
                                } else {
                                    ob.jasaSementara[1][(index+1)] = "Frame_ukir_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 250.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(250000);
                                }
                            } else if (jasa_pilihan[i] == 3) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[1][index] = "20R_(Cetak_kanvas";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 275.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(275000);
                                } else {
                                    ob.jasaSementara[1][(index+1)] = "Frame_ukir_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 300.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(300000);
                                }
                            } else if (jasa_pilihan[i] == 4) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[1][index] = "20Rp_(Cetak_kanvas";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 300.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(300000);
                                } else {
                                    ob.jasaSementara[1][(index+1)] = "Frame_ukir_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 350.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(350000);
                                }
                            } else if (jasa_pilihan[i] == 5) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[1][index] = "24R_(Cetak_kanvas";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 400.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(400000);
                                } else {
                                    ob.jasaSementara[1][(index+1)] = "Frame_ukir_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 450.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(450000);
                                }
                            } else if (jasa_pilihan[i] == 6) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "24Rp_(Cetak_kanvas";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 425.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(4250000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "Frame_ukir_(Cetak_kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 475.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(475000);
                                }
                            } else {
                                System.err.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Jasa tidak ada :("+ob.YELLOW_BOLD+"                                                                                              ║");
                            }
                            index++;
                        }
                    break;
                    
                    case 1 :
                        ob.jasaSementara[1][0] = "16R_(Cetak_kanvas)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)?  ");
                        if (ob.status == true) {
                            ob.jasaSementara[1][1] = "Frame_minimalis_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 200.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(200000);
                        } else {
                            ob.jasaSementara[1][1] = "Frame_ukir_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(225000);
                        }
                    break;

                    case 2 :
        //                ob.jasa_dipesan2[index][2] = "5R";
                        ob.jasaSementara[1][0] = "16Rp_(Cetak_kanvas)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                        if (ob.status == true) {
                            ob.jasaSementara[1][1] = "Frame_minimalis_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+" "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(225000);
                        } else {
                            ob.jasaSementara[1][1] = "Frame_ukir_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 250.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(250000);
                        }
                    break;

                    case 3 :
        //                ob.jasa_dipesan2[index][2] = "8Rp";
                        ob.jasaSementara[1][0] = "20R_(Cetak_kanvas)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                        if (ob.status == true) {
                            ob.jasaSementara[1][1] = "Frame_minimalis_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 275.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(275000);
                        } else {
                            ob.jasaSementara[1][1] = "Frame_ukir_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 300.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(300000);
                        }
                    break;

                    case 4 :
        //                ob.jasa_dipesan2[index][2] = "10R";
                        ob.jasaSementara[1][0] = "20Rp_(Cetak_kanvas)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                        if (ob.status == true) {
                            ob.jasaSementara[1][1] = "Frame_minimalis_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 300.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(300000);
                        } else {
                            ob.jasaSementara[1][1] = "Frame_ukir_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 350.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(350000);
                        }
                    break;

                    case 5 :
        //                ob.jasa_dipesan2[index][2] = "4R";
                        ob.jasaSementara[1][0] = "24R_(Cetak_kanvas)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                        if (ob.status == true) {
                            ob.jasaSementara[1][1] = "Frame_minimalis_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 400.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(400000);
                        } else {
                            ob.jasaSementara[1][1] = "Frame_ukir_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 450.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(450000);
                        }
                    break;

                    case 6 :
                        ob.jasaSementara[1][0] = "24Rp_(Cetak_kanvas)";
                        ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                        if (ob.status == true) {
                            ob.jasaSementara[1][1] = "Frame_minimalis_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 425.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(425000);
                        } else {
                            ob.jasaSementara[1][1] = "Frame_ukir_(Cetak_kanvas)";
                            System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                            System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 475.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                            System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                            ob.setHarga(475000);
                        }
                    break;
                    
                    default :
                        System.err.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Jasa tidak ada :("+ob.YELLOW_BOLD+"                                                                                              ║");
                }
            
            break;

            case 1 :
//                ob.jasa_dipesan2[index][1] = "CETAK_PHOTO";
                ob.jasa_dipesan[0][1] = "Cetak_Photo";
                System.out.println(""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"berikut pilihan yang kami tawarkan:"+ob.YELLOW_BOLD+"                                                                               ║\n"+ob.YELLOW_BOLD+"║                                                                                                                   ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"1. 4R (8 x 12cm)"+ob.YELLOW_BOLD+"                                                                                                  ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"2. 5R (12 x 17cm)"+ob.YELLOW_BOLD+"                                                                                                 ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"3. 8Rp (20 x 30cm)"+ob.YELLOW_BOLD+"                                                                                                ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"4. 10R (25 x 30cm)"+ob.YELLOW_BOLD+"                                                                                                ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"5. 12Rp (30 x 45cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"6. 16Rp (40 x 60cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"7. 20Rp (50 x 70cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"8. 24Rp (60 x 90cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"0. Pilih beberapa"+ob.YELLOW_BOLD+"                                                                                                 ║\n"+ob.YELLOW_BOLD+"║                                                                                                                   ║");
                methodPilihan1(ob.getPilihan("Masukan pilihan anda"));
                
            break;
            
            case 2 :
//                ob.jasa_dipesan2[index][1] = "CETAK_KANVAS";
                ob.jasa_dipesan[0][1] = "Cetak_Kanvas";
                System.out.println(""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"berikut pilihan yang kami tawarkan:"+ob.YELLOW_BOLD+"                                                                               ║\n"+ob.YELLOW_BOLD+"║                                                                                                                   ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"1. 16R (40 x 50cm)"+ob.YELLOW_BOLD+"                                                                                                ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"2. 16Rp (40 x 60cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"3. 20R (50 x 60cm)"+ob.YELLOW_BOLD+"                                                                                                ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"4. 20Rp (50 x 70cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"5. 24R (30 x 45cm)"+ob.YELLOW_BOLD+"                                                                                                ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"6. 24Rp (40 x 60cm)"+ob.YELLOW_BOLD+"                                                                                               ║");
                System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"0. Pilih beberapa"+ob.YELLOW_BOLD+"                                                                                                 ║\n"+ob.YELLOW_BOLD+"║                                                                                                                   ║");
                methodPilihan2(ob.getPilihan("Masukan pilihan anda"));
            break;
            
            default :
                System.err.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Jasa tidak ada :("+ob.YELLOW_BOLD+"                                                                                                 ║");
                return;
        }
    }
    
//    method pilihan untuk pilihan1
    public static void methodPilihan1(int pilihan) {
        Scanner in = new Scanner(System.in);
        setPilihan ob = new setPilihan();
        ob.status = true;
        switch (pilihan) {
            case 0 :
                        System.out.println(""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                        System.out.println(""+ob.YELLOW_BOLD+""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                        jasa_pilihan = new int[ob.getPilihan("Mau berapa pilihan")];
                        for (int i=0;i<jasa_pilihan.length;i++) {
                            jasa_pilihan[i] = ob.getPilihan("Masukan pilihan jasa");
                            
                        }
                        int index = 0;
                        for (int i=0;i<jasa_pilihan.length;i++) { // 1 2 3 
                            if (jasa_pilihan[i] == 1) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "4R_(Cetak_Photo))";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_Photo)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 20.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(20000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 2.500"+ob.YELLOW_BOLD+"                                                                                                       ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(2500);
                                }
                            } else if (jasa_pilihan[i] == 2) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "5R_(Cetak_Photo";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 25.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(25000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 5.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(5000);
                                }
                            } else if (jasa_pilihan[i] == 3) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "8Rp_(Cetak_Photo";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 40.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(40000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 15.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(15000);
                                }
                            } else if (jasa_pilihan[i] == 4) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "10R_(Cetak_Photo";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 50.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(50000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 20.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(20000);
                                }
                            } else if (jasa_pilihan[i] == 5) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "12Rp";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 75.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(75000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 35.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(35000);
                                }
                            } else if (jasa_pilihan[i] == 6) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "16Rp_(Cetak_Photo";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 175.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(175000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 75.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(75000);
                                }
                            } else if (jasa_pilihan[i] == 7) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "20Rp_(Cetak_Photo";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(i+1)] = "Frame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(225000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 100.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(100000);
                                }
                            } else if (jasa_pilihan[i] == 8) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "24Rp_(Cetak_Photo";
                                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[0][(index+1)] = "Frame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 325.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(325000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "NoFrame_(Cetak_Photo";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 150.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(150000);
                                }
                            } else {
                                System.err.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Jasa tidak ada :( "+ob.YELLOW_BOLD+"                                                                                             ║");
                            }
                            index++;
                        }
            break;
            case 1 :
                ob.jasa_dipesan[0][2] = "4R_(Cetak_Photo)";
                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 20.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(20000);
                } else {
                    ob.jasa_dipesan[0][3] = "NoFrame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 2.500"+ob.YELLOW_BOLD+"                                                                                                       ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(2500);
                }
            break;
            
            case 2 :
//                ob.jasa_dipesan2[index][2] = "5R";
                ob.jasa_dipesan[0][2] = "5R_(Cetak_Photo)";
                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 25.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(25000);
                } else {
                    ob.jasa_dipesan[0][3] = "NoFrame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 5.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(5000);
                }
            break;
            
            case 3 :
//                ob.jasa_dipesan2[index][2] = "8Rp";
                ob.jasa_dipesan[0][2] = "8Rp_(Cetak_Photo)";
                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 4.000"+ob.YELLOW_BOLD+"                                                                                                       ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(4000);
                } else {
                    ob.jasa_dipesan[0][3] = "NoFrame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 15.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(15000);
                }
            break;
            
            case 4 :
//                ob.jasa_dipesan2[index][2] = "10R";
                ob.jasa_dipesan[0][2] = "10R_(Cetak_Photo)";
                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 50.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(50000);
                } else {
                    ob.jasa_dipesan[0][3] = "NoFrame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 20.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(20000);
                }
            break;
            
            case 5 :
//                ob.jasa_dipesan2[index][2] = "4R";
                ob.jasa_dipesan[0][2] = "12Rp_(Cetak_Photo)";
                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 75.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(75000);
                } else {
                    ob.jasa_dipesan[0][3] = "NoFrame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 35.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(35000);
                }
            break;
            
            case 6 :
                ob.jasa_dipesan[0][2] = "16Rp_(Cetak_Photo)";
                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 175.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(175000);
                } else {
                    ob.jasa_dipesan[0][3] = "NoFrame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 75.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(75000);
                }
            break;
            
            case 7 : 
                ob.jasa_dipesan[0][2] = "20Rp_(Cetak_Photo)";
                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(225000);
                } else {
                    ob.jasa_dipesan[0][3] = "NoFrame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 100.000"+ob.YELLOW_BOLD+"                                                                                                      ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(100000);
                }
            break;
            
            case 8 :
                ob.jasa_dipesan[0][2] = "24Rp_(Cetak_Photo)";
                ob.status = ob.getYesOrNo("Mau dengan Frame apa nggak? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 325.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(325000);
                } else {
                    ob.jasa_dipesan[0][3] = "NoFrame_(Cetak_Photo)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 150.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(150000);
                }
            break;
            
            default :
                System.err.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Jasa tidak ada :(                                                                                              ║");
        }
    }
    
//    method pilihan pilihan2
    public static void methodPilihan2(int pilihan) {
        Scanner in = new Scanner(System.in);
        setPilihan ob = new setPilihan();
        
        ob.status = true;
        switch (pilihan) {
            case 0 :
                        System.out.println(""+ob.YELLOW_BOLD+"╠═════════════════════════════════════════════════════════════════════╣");
                        jasa_pilihan = new int[ob.getPilihan("Mau berapa pilihan")];
                        for (int i=0;i<jasa_pilihan.length;i++) {
                            jasa_pilihan[i] = ob.getPilihan("Masukan pilihan anda");
                            
                        }
                        int index = 0;
                        for (int i=0;i<jasa_pilihan.length;i++) { // 1 2 3 
                            if (jasa_pilihan[i] == 1) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[1][index] = "16R_Cetak_Kanvas";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_Cetak_Kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 200.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(200000);
                                } else {
                                    ob.jasaSementara[1][(index+1)] = "Frame_ukir_Cetak_Kanvas";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(225000);
                                }
                            } else if (jasa_pilihan[i] == 2) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[1][index] = "16Rp_Cetak_Kanvas";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_(Cetak_Kanvas)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(225000);
                                } else {
                                    ob.jasaSementara[1][(index+1)] = "Frame_ukir_(Cetak_Kanvas)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 250.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(250000);
                                }
                            } else if (jasa_pilihan[i] == 3) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[1][index] = "20R_(Cetak_Kanvas)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_(Cetak_Kanvas)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 275.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(275000);
                                } else {
                                    ob.jasaSementara[1][(index+1)] = "Frame_ukir_(Cetak_Kanvas)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 300.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(300000);
                                }
                            } else if (jasa_pilihan[i] == 4) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[1][index] = "20Rp_(Cetak_Kanvas)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_(Cetak_Kanvas)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 300.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(300000);
                                } else {
                                    ob.jasaSementara[1][(index+1)] = "Frame_ukir_(Cetak_Kanvas)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 350.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(350000);
                                }
                            } else if (jasa_pilihan[i] == 5) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[1][index] = "24R_(Cetak_Kanvas)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_(Cetak_Kanvas)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 400.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(400000);
                                } else {
                                    ob.jasaSementara[1][(index+1)] = "Frame_ukir_(Cetak_Kanvas)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 450.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(450000);
                                }
                            } else if (jasa_pilihan[i] == 6) {
                                if (index == 0) {
                                    index = index; //0
                                } else if (index > 0) {
                                    index = (index+1); // 1+1=2, 2+1=3
                                }
                                ob.jasaSementara[0][index] = "24Rp_(Cetak_Kanvas)";
                                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                                if (ob.status == true) {
                                    ob.jasaSementara[1][(index+1)] = "Frame_minimalis_(Cetak_Kanvas)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 425.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(4250000);
                                } else {
                                    ob.jasaSementara[0][(index+1)] = "Frame_ukir_(Cetak_Kanvas)";
                                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 475.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                                    ob.setHarga(475000);
                                }
                            } else {
                                System.err.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"Jasa tidak ada :("+ob.YELLOW_BOLD+"                                                                                              ║");
                            }
                            index++;
                        }
            break;
            
            case 1 :
                ob.jasa_dipesan[0][2] = "16R_(Cetak_Kanvas)";
                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_minimalis_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(225000);
                } else {
                    ob.jasa_dipesan[0][3] = "Frame_ukir_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 200.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(200000);
                }
            break;
            
            case 2 :
                ob.jasa_dipesan[0][2] = "16Rp_(Cetak_Kanvas)";
                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_minimalis_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 250.000 "+ob.YELLOW_BOLD+"                                                                                                    ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(250000);
                } else {
                    ob.jasa_dipesan[0][3] = "Frame_ukir_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 225.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(225000);
                }
            break;
            
            case 3 :
                ob.jasa_dipesan[0][2] = "20R_(Cetak_Kanvas)";
                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_minimalis_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 300.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(300000);
                } else {
                    ob.jasa_dipesan[0][3] = "Frame_ukir_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 275.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(275000);
                }
            break;
            
            case 4 :
                ob.jasa_dipesan[0][2] = "20Rp_(Cetak_Kanvas)";
                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_minimalis_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 375.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(375000);
                } else {
                    ob.jasa_dipesan[0][3] = "Frame_ukir_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 300.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(300000);
                }
            break;
            
            case 5 :
                ob.jasa_dipesan[0][2] = "24R_(Cetak_Kanvas)";
                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_minimalis_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 450.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(450000);
                } else {
                    ob.jasa_dipesan[0][3] = "Frame_ukir_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 400.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(400000);
                }
            break;
            
            case 6 :
                ob.jasa_dipesan[0][2] = "24Rp_(Cetak_Kanvas)";
                ob.status = ob.getYesOrNo("Mau dengan Frame minimalis (y) apa frame ukir (n)? ");
                if (ob.status == true) {
                    ob.jasa_dipesan[0][3] = "Frame_minimalis_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 475.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(475000);
                } else {
                    ob.jasa_dipesan[0][3] = "Frame_ukir_(Cetak_Kanvas)";
                    System.out.println(""+ob.YELLOW_BOLD+"╔═════════════════════════════════════════════════════════════════════╗");
                    System.out.println(""+ob.YELLOW_BOLD+"║ "+ob.GREEN_BOLD+"harga 425.000"+ob.YELLOW_BOLD+"                                                                                                     ║");
                    System.out.println(""+ob.YELLOW_BOLD+"╚═════════════════════════════════════════════════════════════════════╝");
                    ob.setHarga(425000);
                }
            break;
            
            default :
                System.err.println(""+ob.YELLOW_BOLD+"║ Jasa tidak ada :("+ob.YELLOW_BOLD+"                                                                                              ║");
        }
    }
}
