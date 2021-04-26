package ruang3d;

public class KerucutTerpancung extends Kerucut {

    /*
        r  = jari-jari alas kerucut
        r2 = jari-jari atas terpancung
        t  = tinggi kerucut
        
        apotema = garis miring pada selimut kerucut
    */

    protected int r2;

    public KerucutTerpancung(int r, int r2, int t) {
        super(r, t);
        this.r2 = r2;
    }

    @Override
    public void display() {
        System.out.println("\n   ** MENGHITUNG KERUCUT TERPANCUNG **\n");
        System.out.println("  Volume Kerucut Terpancung         = " + hitungVolume() + " cm3");
        System.out.println("  Luas Permukaan Kerucut Terpancung = " + hitungLuasPermukaan() + " cm2");
    }

    @Override
    protected double hitungVolume() {
        double x = (r * r) + (r * r2) + (r2 * r2);

        return (pi * t * x) / 3;
    }

    @Override
    protected double hitungLuasPermukaan() {
        int selisihR = Math.abs(r - r2);
        double apotema = super.akar(selisihR, t);
        
        double x = r + r2;

        return pi * apotema * x;
    }
    
}
