package ruang3d;

import bidang2d.Lingkaran;

public class Bola extends Lingkaran {

    // r = jari-jari bola

    public Bola(int r) {
        super(r);
    }

    @Override
    public void display() {
        System.out.println("\n   ** MENGHITUNG BOLA **\n");
        System.out.println("  Volume Bola         = " + hitungVolume() + " cm3");
        System.out.println("  Luas Permukaan Bola = " + hitungLuasPermukaan() + " cm2");
    }

    protected double hitungVolume() {
        return (4 * pi * r * r * r) / 3;
    }

    protected double hitungLuasPermukaan() {
        return 4 * pi * r * r;
    }
    
}
