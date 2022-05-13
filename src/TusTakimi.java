package cc.odev.sogutucu;

import java.util.Scanner;

public class TusTakimi implements ITusTakimi{

    public String veriAl(){
        Scanner input = new Scanner(System.in);
        return input.next();
    }
    public int veriAlint(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
