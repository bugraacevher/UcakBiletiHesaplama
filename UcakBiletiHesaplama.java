package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int KM,Yasi;
        int YolculukTipi;
        double mesafeUcret = 0.10, indirimTutari,geriDonusIndirimi,toplamTutar;

        Scanner i = new Scanner((System.in));

        System.out.println("Kilometre bilgisini giriniz : ");
        KM = i.nextInt();

        System.out.println("Yaz bilgisini giriniz : ");
        Yasi = i.nextInt();

        System.out.println("Yolculuk Tipiniz yaziniz(Gidis=1 Gidis Donus=2) : ");
        YolculukTipi = i.nextInt();
        double normalTutar = KM * mesafeUcret;

        if(KM > 0 && Yasi > 0){
            System.out.println("Normal Tutar : " + normalTutar);
            if (Yasi<12) {
                indirimTutari = normalTutar * 0.50;
                normalTutar = normalTutar-indirimTutari;
                System.out.println("Yas Indirimli : " + normalTutar);
            } else if (Yasi>=12 && Yasi<24) {
                indirimTutari = normalTutar * 0.10;
                normalTutar = normalTutar-indirimTutari;
                System.out.println("Yas Indirimli : " + normalTutar);
            }else if (Yasi >= 65){
                indirimTutari = normalTutar * 0.30;
                normalTutar = normalTutar-indirimTutari;
                System.out.println("Yas Indirimli : " + normalTutar);
            }

            if(YolculukTipi == 2){
                geriDonusIndirimi = normalTutar * 0.20;
                System.out.println("Gidis Donuslu Indirimli Tutar : " + geriDonusIndirimi);
                toplamTutar = (normalTutar - geriDonusIndirimi) * 2;
                System.out.println("Toplam Tutar : "+toplamTutar);
            }else{
                System.out.println("Tutar : " + normalTutar);
            }

        }else{
            System.out.println("Hatali Veri Girdiniz !");
        }
    }
}
