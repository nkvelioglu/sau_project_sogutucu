package cc.odev.sogutucu;

public class SogutucuAC implements IIslem {
    private ITusTakimi tusTakimi;

    public SogutucuAC(ITusTakimi tusTakimi){
        this.tusTakimi = tusTakimi;
    }
    public int islemYap(){
        System.out.println("Soğutucu açıldı...");
        return 1;
    }
}
