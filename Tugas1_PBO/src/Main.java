/* 
    Anggota Kelompok :
        -> Vincentius Willy Ardiyanto (123190100)
        -> Galih Agung Nugraha (123190122)
        -> Harya Anggitama (12390125)
        -> Kevin Bimo Saputro (123190126)

    **NOTE** jika program error mungkin bisa menghapus method clearConsole() 
    beserta pemanggilan method-nya.
    Karena sepertinya tidak bekerja untuk semua device / IDE.
*/

import java.util.Scanner;
import bidang2d.Lingkaran;
import ruang3d.Tabung;
import ruang3d.Kerucut;
import ruang3d.KerucutTerpancung;
import ruang3d.Bola;
import ruang3d.JuringBola;
import ruang3d.TemberengBola;
import ruang3d.KeratanBola;
import ruang3d.CincinBola;

public class Main {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repeat = true;
        boolean catchError = false;
        char forRepeat = 'y';

        while (repeat) {
            catchError = false;

            clearConsole();
             
            System.out.println("\n == MENU OPERASI ==\n");
            System.out.println("  1. Lingkaran");
            System.out.println("  2. Tabung");
            System.out.println("  3. Kerucut");
            System.out.println("  4. Kerucut Terpancung");
            System.out.println("  5. Bola");
            System.out.println("  6. Juring Bola");
            System.out.println("  7. Tembereng Bola");
            System.out.println("  8. Keratan Bola");
            System.out.println("  9. Cincin Bola");
            System.out.println("  0. Exit Program\n");

            System.out.print("-> Pilih Menu : ");
            int select = 0;
            try {
                select = userInput.nextInt();
            } catch (Exception e) {
                System.out.println("\n----------------------------------------\n");
                System.err.println(" (( inputan yang anda masukan bukan angka ))");
                repeat = false;
                catchError = true;
            }
            
            if (repeat) {
                System.out.println("\n----------------------------------------\n");
                switch (select) {
                    case 1: {catchError = operasiLingkaran(); break;}
                    case 2: {catchError = operasiTabung(); break;}
                    case 3: {catchError = operasiKerucut(); break;}
                    case 4: {catchError = operasiKerucutTerpancung(); break;}
                    case 5: {catchError = operasiBola(); break;}
                    case 6: {catchError = operasiJuringBola(); break;}
                    case 7: {catchError = operasiTemberengBola(); break;}
                    case 8: {catchError = operasiKeratanBola(); break;}
                    case 9: {catchError = operasiCincinBola(); break;}
                    
                    case 0: {
                        System.out.println(" (( Exit Program ))");
                        System.exit(0);
                    }

                    default: {
                        System.err.println(" (( inputan yang anda masukan salah ))");
                        break;
                    }   
                }
            }
            System.out.println("\n----------------------------------------");
            System.out.print("\n-> Ulangi Program? (y/n) : ");
            forRepeat = userInput.next().charAt(0);

            if (catchError) {
                forRepeat = userInput.next().charAt(0);
            }

            if (forRepeat == 'y') {
                repeat = true;
            } else {
                repeat = false;
            }
        }
        
        System.out.println("\n (( Exit Program ))");
    }

    public static boolean operasiLingkaran() {
        boolean catchError = false;
        int r = 0; 
        
        try {
            System.out.print(" -> Masukan jari-jari lingkaran (cm) : ");
            r = userInput.nextInt();
        
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            Lingkaran lingkaran = new Lingkaran(r);
            lingkaran.display();
        }

        return catchError;
    }

    public static boolean operasiTabung() {
        boolean catchError = false;
        int r = 0, t = 0;

        try { 
            System.out.print(" -> Masukan jari-jari alas tabung (cm) : ");
            r = userInput.nextInt();
            
            System.out.print(" -> Masukan tinggi tabung (cm)         : ");
            t = userInput.nextInt();
        
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            Tabung tabung = new Tabung(r, t);
            tabung.display();
        }

        return catchError;
    }

    public static boolean operasiKerucut() {
        boolean catchError = false;
        int r = 0, t = 0;

        try {
            System.out.print(" -> Masukan jari-jari alas kerucut (cm) : ");
            r = userInput.nextInt();
            
            System.out.print(" -> Masukan tinggi kerucut (cm)         : ");
            t = userInput.nextInt();
        
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            Kerucut kerucut = new Kerucut(r, t);
            kerucut.display();
        }

        return catchError;
    }

    public static boolean operasiKerucutTerpancung() {
        boolean catchError = false;
        int r = 0, r2 = 0, t = 0;

        try {
            System.out.print(" -> Masukan jari-jari alas kerucut (cm)    : ");
            r = userInput.nextInt();
            
            System.out.print(" -> Masukan jari-jari atas kerucut (cm)    : ");
            r2 = userInput.nextInt();
            
            System.out.print(" -> Masukan tinggi kerucut terpancung (cm) : ");
            t = userInput.nextInt();
       
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(r, r2, t);
            kerucutTerpancung.display();
        }

        return catchError;
    }

    public static boolean operasiBola() {
        boolean catchError = false;
        int r = 0; 
        
        try {
            System.out.print(" -> Masukan jari-jari bola (cm) : ");
            r = userInput.nextInt();
       
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            Bola bola = new Bola(r);
            bola.display();
        }

        return catchError;
    }

    public static boolean operasiJuringBola() {
        boolean catchError = false;
        int r = 0, r2 = 0, t = 0; 
        
        try {
            System.out.print(" -> Masukan jari-jari bola (cm)         : ");
            r = userInput.nextInt();

            System.out.print(" -> Masukan jari-jari dasar juring (cm) : ");
            r2 = userInput.nextInt();

            System.out.print(" -> Masukan tinggi juring (cm)          : ");
            t = userInput.nextInt();
        
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            JuringBola juringBola = new JuringBola(r, r2, t);
            juringBola.display();
        }

        return catchError;
    }

    public static boolean operasiTemberengBola() {
        boolean catchError = false;
        int r = 0, r1 = 0, r2 = 0, t = 0; 
        
        try {
            System.out.print(" -> Masukan jari-jari bola (cm)         : ");
            r = userInput.nextInt();

            System.out.print(" -> Masukan jari-jari bidang dasar (cm) : ");
            r1 = userInput.nextInt();

            System.out.print(" -> Masukan jari-jari bidang atas (cm)  : ");
            r2 = userInput.nextInt();

            System.out.print(" -> Masukan tinggi tembereng (cm)       : ");
            t = userInput.nextInt();
        
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            TemberengBola temberengBola = new TemberengBola(r, r1, r2, t);
            temberengBola.display();
        }

        return catchError;
    }

    public static boolean operasiKeratanBola() {
        boolean catchError = false;
        int r = 0, r1 = 0, r2 = 0, t = 0; 
        
        try {
            System.out.print(" -> Masukan jari-jari bola (cm)         : ");
            r = userInput.nextInt();

            System.out.print(" -> Masukan jari-jari bidang bawah (cm) : ");
            r1 = userInput.nextInt();

            System.out.print(" -> Masukan jari-jari bidang atas (cm)  : ");
            r2 = userInput.nextInt();

            System.out.print(" -> Masukan tinggi keratan (cm)         : ");
            t = userInput.nextInt();
        
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            KeratanBola keratanBola = new KeratanBola(r, r1, r2, t);
            keratanBola.display();
        }

        return catchError;
    }

    public static boolean operasiCincinBola() {
        boolean catchError = false;
        int r = 0, r1 = 0, r2 = 0, t = 0; 
        
        try {
            System.out.print(" -> Masukan jari-jari bola (cm)         : ");
            r = userInput.nextInt();

            System.out.print(" -> Masukan jari-jari bidang bawah (cm) : ");
            r1 = userInput.nextInt();

            System.out.print(" -> Masukan jari-jari bidang atas (cm)  : ");
            r2 = userInput.nextInt();

            System.out.print(" -> Masukan tinggi cincin (cm)          : ");
            t = userInput.nextInt();
        
        } catch (Exception e) {
            System.err.println("\n  (( inputan yang anda masukan bukan angka ))");
            catchError = true;
        }

        if (!catchError) {
            CincinBola cincinBola = new CincinBola(r, r1, r2, t);
            cincinBola.display();
        }

        return catchError;
    }

    public final static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
