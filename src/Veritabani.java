package cc.odev.sogutucu;

public class Veritabani implements IVeritabani{

    public boolean kullanici_dogrulama(String nik, String sifre){
        if (nik.equals("nkv") && sifre.equals("sakarya")){
            System.out.println("Veritabanı üzerinden kontrol ediliyor...");
            Araclar.bekle(100);
            System.out.println("Hesap doğrulandı...");
            return true;
        }
        else{
            System.out.println("Veritabanı üzerinden kontrol ediliyor...");
            Araclar.bekle(100);
            System.out.println("Hatalı giriş. Tekrar deneyiniz...");
            return false;


        }
    }


}


