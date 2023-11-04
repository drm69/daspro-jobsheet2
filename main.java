import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        System.out.println("====================================================================================================================");
        System.out.println("   _____ _____  _____ _______ ______ __  __   _____  ______ _____  _____            _         _  __          _   _ ");
        System.out.println("  / ____|_   _|/ ____|__   __|  ____|  \\/  | |  __ \\|  ____|  __ \\|  __ \\ /\\       | |  /\\   | |/ /    /\\   | \\ | |");
        System.out.println(" | (___   | | | (___    | |  | |__  | \\  / | | |__) | |__  | |__) | |__) /  \\      | | /  \\  | ' /    /  \\  |  \\| |");
        System.out.println("  \\___ \\  | |  \\___ \\   | |  |  __| | |\\/| | |  ___/|  __| |  _  /|  ___/ /\\ \\ _   | |/ /\\ \\ |  <    / /\\ \\ | . ` |");
        System.out.println("  ____) |_| |_ ____) |  | |  | |____| |  | | | |    | |____| | \\ \\| |  / ____ \\ |__| / ____ \\| . \\  / ____ \\| |\\  |");
        System.out.println(" |_____/|_____|_____/   |_|  |______|_|  |_| |_|    |______|_|  \\_\\_| /_/    \\_\\____/_/    \\_\\_|\\_\\/_/    \\_\\_| \\_|");
        System.out.println("====================================================================================================================");
Scanner input=new Scanner(System.in);
        int pajak;
        System.out.println("_____________________________");
        System.out.println("_____________________________");
        System.out.println(" Selamat Datang di Kalkulator");
        System.out.println("            Pajak            ");
        System.out.println("    D-IV Teknik Informatika  ");
        System.out.println("             2023            ");
        System.out.println("_____________________________");
        System.out.println("_____________________________");
        System.out.println("=============================");
        System.out.println("|Input  |Jenis Pajak        |");
        System.out.println("| 1     | PPh               |");
        System.out.println("| 2     | PBB               |");
        System.out.println("| 3     | Pajak Kendaraan   |");
        System.out.println("=============================");        
        System.out.print("Masukkan jenis pajak: ");
        pajak=input.nextInt();

        if(pajak==1){
            Scanner sc= new Scanner(System.in);
            int gaji, tanggungan=4500000,PTKP, pribadi=54000000, pkp, totpajak;
            double PPh1=0.05,PPh2=0.15,PPh3=0.25,PPh4=0.3;
            byte jmltanggungan;
            String status;

            System.out.print("Apakah anda sudah menikah?: ");
            status=sc.nextLine();
            
            if(status.equalsIgnoreCase("iya")){
                System.out.println("masukkan gaji bersih selama 1 tahun:");
                gaji=sc.nextInt();
                System.out.println("masukkan jumlah tanggungan");
                System.out.print("(anak + istri):");
                jmltanggungan=sc.nextByte();

                PTKP=(jmltanggungan*tanggungan)+pribadi;
                pkp=gaji-PTKP;
                
                if(pkp<50000000){
                    totpajak=(int)(pkp*PPh1);
                    System.out.println("Total pajak anda: " + totpajak);
                }else if(pkp>=50_000_000&&pkp<250_000_000){
                    totpajak=(int)(pkp*PPh2);
                    System.out.println("Total pajak anda: " + totpajak);
                }else if(pkp>=250_000_000&&pkp<500_000_000){
                    totpajak=(int)(pkp*PPh3);
                    System.out.println("Total pajak anda: " + totpajak);
                }else if(pkp>=500_000_000){
                    totpajak=(int)(pkp*PPh4);
                    System.out.println("Total pajak anda: " + totpajak);
                }
            }else {
                System.out.println("masukkan gaji bersih selama 1 tahun:");
                gaji=sc.nextInt();
                System.out.println("masukkan jumlah tanggungan");
                System.out.print("(anak angkat jika ada):");
                jmltanggungan=sc.nextByte();

                PTKP=(jmltanggungan*tanggungan)+pribadi;
                pkp=gaji-PTKP;
                if(pkp<50000000){
                    totpajak=(int)(pkp*PPh1);
                    System.out.println("Total pajak anda: " + totpajak);
                }else{
                    totpajak=(int)(pkp*PPh2);
                    System.out.println("Total pajak anda: " + totpajak);
                }
            }
        }else if(pajak==2){
            Scanner scan=new Scanner(System.in);
            int bumi, bangunan;
            int NJOP, NJKP, totPBB, nilaiaset, tetapan2=12000000;
            int luasbangunan, luasbumi, hargabumi, hargabangunan;
            double tetapan1=0.2, tetapan3=0.4, PBB=0.005;

            System.out.print("Masukkan luas bangunan anda  :");
            luasbangunan=scan.nextInt();
            System.out.print("Masukkan luas tanah anda     :");
            luasbumi=scan.nextInt();
            System.out.print("Masukkan harga tanah/meter   :");
            hargabumi=scan.nextInt();
            System.out.print("Masukkan harga bangunan/meter:");
            hargabangunan=scan.nextInt();
            
            bumi=luasbumi*hargabumi;
            bangunan=luasbangunan*hargabangunan;
            NJOP=bumi+bangunan;
            nilaiaset=NJOP-tetapan2;

            if(nilaiaset < 1000000000){
                NJKP=(int)(nilaiaset*tetapan1);
                totPBB=(int)(NJKP*PBB);
                System.out.println("Total pajak anda: " + totPBB);
            }else{
                NJKP=(int)(nilaiaset*tetapan3);
                totPBB=(int)(NJKP*PBB);
                System.out.println("Total pajak anda: " + totPBB);
            }
        }else if(pajak==3){
            Scanner scan=new Scanner(System.in);
            String jenPKB;        
            System.out.print("Masukkan jenis PKB: ");
            jenPKB=scan.nextLine();

            if(jenPKB.equalsIgnoreCase("motor")){
                int cc, PKB, koefBobot, operasi1;
                int TNKB, administrasi=50000, terbitSTNK, totPajak1, totPajak2;
                float progresif=0.5f, presentase;
                byte urutKendaraan;
                
                System.out.print("Kendaraan ke-                     : ");
                urutKendaraan=scan.nextByte();
                System.out.print("Masukkan koefisien bobot kendaraan: ");
                koefBobot=scan.nextInt();
                System.out.print("Masukkan nilai PKB kendaraan      : ");
                PKB=scan.nextInt();
                System.out.print("Masukkan cc kendaraan             : ");
                cc=scan.nextInt();
                System.out.print("Masukkan biaya pengesahan STNK    : ");
                TNKB=scan.nextInt();
                System.out.print("Masukkan biaya penerbitan STNK    : ");
                terbitSTNK=scan.nextInt();

                if(cc<250){
                    presentase=((urutKendaraan*progresif)+1)/100;
                    operasi1=((PKB/2)*100)*koefBobot;
                    totPajak1=(int)(operasi1*presentase);
                    totPajak2= totPajak1+TNKB+terbitSTNK+35000+administrasi;
                    System.out.println("Total pajak anda          : "+ totPajak1);
                    System.out.println("Total pajak 5 tahunan anda: "+ totPajak2);

                }else{
                    presentase=(urutKendaraan*progresif)+1;
                    operasi1=((PKB/2)*100)*koefBobot;
                    totPajak1=(int)(operasi1*presentase);
                    totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi;
                    System.out.println("Total pajak anda          : "+ totPajak1);
                    System.out.println("Total pajak 5 tahunan anda: "+ totPajak2);
                }
            }else{
                    //mobil
            }
    }
}
}