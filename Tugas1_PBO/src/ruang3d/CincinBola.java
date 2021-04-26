package ruang3d;

public class CincinBola extends Bola {

    /*
        r  = jari-jari bola
        r1 = jari-jari bidang bawah
        r2 = jari-jari bidang atas
        t  = tinggi cincin
    */

    protected int r1, r2, t;

    public CincinBola(int r, int r1, int r2, int t) {
        super(r);
        this.r1 = r1;
        this.r2 = r2;
        this.t = t;
    }

    @Override
    public void display() {
        System.out.println("\n   ** MENGHITUNG CINCIN BOLA **\n");
        System.out.println("  Volume Cincin Bola         = " + hitungVolume() + " cm3");
        System.out.println("  Luas Permukaan Cincin Bola = " + hitungLuasPermukaan() + " cm2");
    }

    @Override
    protected double hitungVolume() {
        return (pi * t * hitungTaliBusur() * hitungTaliBusur()) / 6;
    }

    @Override
    protected double hitungLuasPermukaan() {
        double x = 2 * pi * r * t;
        double y = pi * hitungTaliBusur() * (r1 + r2);

        return x + y;
    }

    private double hitungTaliBusur() {
        int alas = Math.abs(r1 - r2);

        return akar(alas, t);
    }

    private double akar(int x, int y) {
        return Math.sqrt( (x * x) + (y * y) );
    }
    
}
