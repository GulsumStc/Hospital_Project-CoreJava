package HastaneProjectDevTeam03_EnSonHal;

import java.util.Scanner;

public class HastaneService {

    static Scanner scanner = new Scanner(System.in);

    public void hastaneMenu() {
        Scanner scanner = new Scanner(System.in);
        HastaService hastaService = new HastaService();
        DoktorService doktorservice = new DoktorService();
        doktorservice.firstList();
        hastaService.firstList();
        RandevuService randevuService = new RandevuService();
        slowPrint("\033[34m============== DEV TEAM 03 HASTANESINE HOSGELDİNİZ ================\033[0m\n", 20);
        slowPrint("\033[34m================ SAGLIGINIZ BİZİM ICIN ONEMLIDIR ==================\033[0m\n", 20);
        int secim = -1;
        do {

            System.out.println("LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ:\n\t=> 1-DOKTOR MENUSU:\n\t=> 2-HASTA MENUSU:\n\t" +
                    "=> 3-RANDEVU MENUSU: \n\t=> 0-CIKIS");


            try {
                secim = scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("LUTFEN SIZE SUNULAN SECENEKLERIN DISINDA VERI GIRISI YAPMAYINIZ!");
                continue;
            }

            switch (secim) {
                case 1:
                    doktorservice.menu();
                    break;
                case 2:

                    hastaService.menu();
                    break;
                case 3:
                    randevuService.haftalikRandevuTableList(randevuService.haftalikRandevuTable());
                    break;
                case 0:
                    slowPrint("BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDER SAGLIKLI GUNLER DILERIZ", 20);
                    System.out.println();
                    slowPrint("\033[32m===================== DEV TEAM 03 HASTANESI ====================\033[0m\n", 20);
                    break;
                default:
                    System.err.print("HATALI GIRIS, TEKRAR DENEYINIZ!");

            }

        } while (secim != 0);

    }

    public static void slowPrint(String message, int delay) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
