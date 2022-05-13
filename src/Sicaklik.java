package cc.odev.sogutucu;

import java.util.Random;

public class Sicaklik implements IIslem {

    Random rand = new Random();

    public int islemYap(){
        int rng = rand.nextInt(40);
        System.out.println("Sicaklik " + rng + " derece");
        return rng;
    }
}
