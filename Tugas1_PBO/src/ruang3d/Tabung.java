package ruang3d;

import bidang2d.Lingkaran;

public class Tabung extends Lingkaran {

    /*
        r = jari-jari alas tabung
        t = tinggi tabung
    */

    protected int t;

    public Tabung(int r, int t) {
        super(r);
        this.t = t;
    }

    @Override
    public void display() {
        System.out.println("\n   ** MENGHITUNG TABUNG **\n");
        System.out.println("  Volume Tabung         = " + hitungVolume() + " cm3");
        System.out.println("  Luas Permukaan Tabung = " + hitungLuasPermukaan() + " cm2");
    }

    protected double hitungVolume() {
        return pi * r * r * t;
    }

    protected double hitungLuasPermukaan() {
        double x = r + t;
        
        return 2 * pi * r * x;
    }
    
}
