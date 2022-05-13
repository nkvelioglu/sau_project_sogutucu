package cc.odev.sogutucu;

public class BaglantiTesti implements IBaglantiTesti {
    public void baglantiTesti(){
        System.out.println("Baglantı test ediliyor...");
        Araclar.bekle(100);
        System.out.println("Bağlantı kuruldu...");
    }
}
