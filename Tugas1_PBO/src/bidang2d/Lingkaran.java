package bidang2d;

public class Lingkaran implements Bidang2d {

    // r = jari-jari lingkaran
    
    protected int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    @Override
    public double hitungKeliling() {
        return 2 * pi * this.r;
    }

    @Override
    public double hitungLuas() {
        return pi * this.r * this.r;
    }

    @Override
    public void display() {
        System.out.println("\n   ** MENGHITUNG LINGKARAN **\n");
        System.out.println("  Luas Lingkaran     = " + hitungLuas() + " cm2");
        System.out.println("  Keliling Lingkaran = " + hitungKeliling() + " cm");
    }
}
