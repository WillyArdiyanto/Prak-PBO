package ruang3d;

public class JuringBola extends Bola {

    /*
        r  = jari-jari bola
        r2 = jari-jari dasar juring
        t  = tinggi juring
    */
    
    protected int r2, t;

    public JuringBola(int r, int r2, int t) {
        super(r);
        this.r2 = r2;
        this.t = t;
    }

    @Override
    public void display() {
        System.out.println("\n   ** MENGHITUNG JURING BOLA **\n");
        System.out.println("  Volume Juring Bola         = " + hitungVolume() + " cm3");
        System.out.println("  Luas Permukaan Juring Bola = " + hitungLuasPermukaan() + " cm2");
    }

    @Override
    protected double hitungVolume() {
        return (2 * pi * r * r * t) / 3;
    }

    @Override
    protected double hitungLuasPermukaan() {
        double x = 2 * pi * r * t;
        double y = pi * r * r2; 

        return x + y;
    }
    
}
