package cc.odev.sogutucu;

public class SogutucuKAPA implements IIslem{
    private ITusTakimi tusTakimi;

    public SogutucuKAPA(ITusTakimi tusTakimi){
        this.tusTakimi = tusTakimi;
    }
    public int islemYap() {
        System.out.println("Soğutucu kapatıldı...");
        return 1;
    }
}

