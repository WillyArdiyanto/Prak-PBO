package ruang3d;

public class TemberengBola extends Bola {

    /*
        r  = jari-jari bola
        r1 = jari-jari bidang dasar
        r2 = jari-jari bidang atas
        t  = tinggi tembereng
    */

    protected int r1, r2, t;

    public TemberengBola(int r, int r1, int r2, int t) {
        super(r);
        this.r1 = r1;
        this.r2 = r2;
        this.t = t;
    }

    @Override
    public void display() {
        System.out.println("\n   ** MENGHITUNG TEMBERENG BOLA **\n");
        System.out.println("  Volume Tembereng Bola         = " + hitungVolume() + " cm3");
        System.out.println("  Luas Permukaan Tembereng Bola = " + hitungLuasPermukaan() + " cm2");
    }

    @Override
    protected double hitungVolume() {
        double x = (3 * r1 * r1) + (3 * r2 * r2) + (t * t);
        
        return (pi * t * x) / 6;
    }

    @Override
    protected double hitungLuasPermukaan() {
        double x = 2 * pi * r * t;
        double y = pi * r1 * r1; 

        return x + y;
    }
    
}
