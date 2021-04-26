package ruang3d;

public class KeratanBola extends Bola {

    /*
        r  = jari-jari bola
        r1 = jari-jari bidang bawah
        r2 = jari-jari bidang atas
        t  = tinggi keratan
    */

    protected int r1, r2, t;

    public KeratanBola(int r, int r1, int r2, int t) {
        super(r);
        this.r1 = r1;
        this.r2 = r2;
        this.t = t;
    }

    @Override
    public void display() {
        System.out.println("\n   ** MENGHITUNG KERATAN BOLA **\n");
        System.out.println("  Volume Keratan Bola         = " + hitungVolume() + " cm3");
        System.out.println("  Luas Permukaan Keratan Bola = " + hitungLuasPermukaan() + " cm2");
    }

    @Override
    protected double hitungVolume() {
        double a = (pi * r1 * r1) / 2;
        double b = (pi * r2 * r2) / 2;
        double c = (pi * t * t * t) / 3;
        
        return a + b + c;
    }

    @Override
    protected double hitungLuasPermukaan() {
        double x = 2 * pi * r * t;
        double y = pi * r1 * r1; 
        double z = pi * r2 * r2; 

        return x + y + z;
    }
    
}
