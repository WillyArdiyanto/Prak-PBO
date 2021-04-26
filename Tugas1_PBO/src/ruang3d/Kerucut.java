package ruang3d;

import bidang2d.Lingkaran;

public class Kerucut extends Lingkaran {

    /*
        r = jari-jari alas kerucut
        t = tinggi kerucut
    */

    protected int t;

    public Kerucut(int r, int t) {
        super(r);
        this.t = t;
    }

    @Override
    public void display() {
        System.out.println("\n   ** MENGHITUNG KERUCUT **\n");
        System.out.println("  Volume Kerucut         = " + hitungVolume() + " cm3");
        System.out.println("  Luas Permukaan Kerucut = " + hitungLuasPermukaan() + " cm2");
    }

    protected double hitungVolume() {
        return (pi * r * r * t) / 3;
    }

    protected double hitungLuasPermukaan() {
        double apotema = akar(r, t);
        double x = r + apotema;

        return pi * r * x;
    }

    protected double akar(int a, int b) {
        return Math.sqrt( (a * a) + (b * b));
    }
    
}
