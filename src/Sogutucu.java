package cc.odev.sogutucu;

public class Sogutucu {

    private ITusTakimi tusTakimi;
    private IVeritabani veritabani;
    private IBaglantiTesti baglanti;



    boolean result = false;

    public static final int SICAKLIK_GOSTER = 1;
    public static final int SOGUTUCU_AC = 2;
    public static final int SOGUTUCU_KAPA = 3;
    public static final int CIKIS = 4;

    public Sogutucu(){
        tusTakimi = new TusTakimi();
        veritabani = new Veritabani();
        baglanti = new BaglantiTesti();

    }

    public void basla() {
        while (result == false) {
            System.out.println("Kullanıcı adınızı giriniz...");
            String kullanici_adi = tusTakimi.veriAl();
            System.out.println("Şifrenizi giriniz...");
            String sifre = tusTakimi.veriAl();

            boolean result = veritabani.kullanici_dogrulama(kullanici_adi, sifre);

            if (result == true) {
                break;
            }
        }
        baglanti.baglantiTesti();
        islemSecimi();
    }

        private void islemSecimi() {
            int secim;
            do {
                secim = anaMenuyuGoster();
                switch (secim) {
                    case SICAKLIK_GOSTER:
                        IIslem sicaklik = new Sicaklik();
                        sicaklik.islemYap();
                        break;
                    case SOGUTUCU_AC:
                        IIslem sogutucuac = new SogutucuAC(tusTakimi);
                        sogutucuac.islemYap();
                        break;

                    case SOGUTUCU_KAPA:
                        IIslem sogutucukapa = new SogutucuKAPA(tusTakimi);
                        sogutucukapa.islemYap();
                        break;

                    case CIKIS:
                        System.out.println("Çıkılıyor...");
                        break;
                    default:
                        System.out.println("1 ile 4 arasında bir sayı girmelisiniz...");
                }
            }while (secim != 4);
        }
        private int anaMenuyuGoster()
        {
            System.out.println("**********************************************");
            System.out.println("Ana Menu");
            System.out.println("1-Sıcaklığı Göster");
            System.out.println("2-Soğutucuyu Aç");
            System.out.println("3-Soğutucuyu Kapat");
            System.out.println("4-Cikis");
            System.out.println("Seciminiz:");
            System.out.println("**********************************************");
            return tusTakimi.veriAlint();
        }




}
