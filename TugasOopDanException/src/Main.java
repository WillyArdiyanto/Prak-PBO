
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
        String lagi = "y";
        do {

            Scanner input = new Scanner(System.in);
            System.out.print("Menu \n1. Persegi\n2. Lingkaran\n3. Persegi Panjang\n4. Segitiga\n5. Kubus\n6. Silinder\n7. Balok\n0. Sudahi saja\n");
            int pilih = 0;

            try {
                System.out.print("Pilih : ");
                pilih = input.nextInt();
            } catch (Exception error) {
                System.out.println("Errornya adalah " + error.getMessage());
            }
            switch (pilih) {
                case 0:
                    break;
                case 1:
                    {
                        int sisi = 0;
                        try {
                            System.out.print("Masukkan sisi : ");
                            sisi = input.nextInt();
                        } catch (Exception error) {
                            System.out.println("Errornya " + error.getMessage() + ". Masukkin angka aja Bos!");
                        } finally {
                            BangunDatar persegi = new Persegi(sisi);
                            System.out.println("Luas persegi adalah " + persegi.luas() + " Satuan^2");
                            System.out.println("Keliling persegi adalah " + persegi.keliling() + " Satuan");
                        }       break;
                    }
                case 2:
                    {
                        int jari = 0;
                        try {
                            System.out.print("Masukkan jari-jari : ");
                            jari = input.nextInt();
                        } catch (Exception error) {
                            System.out.println("Errornya " + error.getMessage() + ". Masukkin angka aja Bos!");
                        } finally {
                            BangunDatar lingkaran = new Lingkaran(jari);
                            System.out.println("Luas lingkaran adalah " + lingkaran.luas() + " Satuan^2");
                            System.out.println("Keliling lingkaran adalah " + lingkaran.keliling() + " Satuan");
                        }       break;
                    }
                case 3:
                    {
                        int panjang = 0, lebar = 0;
                        try {
                            System.out.print("Masukkan panjang : ");
                            panjang = input.nextInt();
                            System.out.print("Masukkan lebar : ");
                            lebar = input.nextInt();
                        } catch (Exception error) {
                            System.out.println("Errornya " + error.getMessage() + ". Masukkin angka aja Bos!");
                        } finally {
                            BangunDatar persegiPanjang = new PersegiPanjang(panjang, lebar);
                            System.out.println("Luas persegi panjang adalah " + persegiPanjang.luas() + " Satuan^2");
                            System.out.println("Keliling persegi panjang adalah " + persegiPanjang.keliling() + " Satuan");
                        }       break;
                    }
                case 4:
                    {
                        int alas = 0, tinggi = 0;
                        try {
                            System.out.print("Masukkan alas : ");
                            alas = input.nextInt();
                            System.out.print("Masukkan tinggi : ");
                            tinggi = input.nextInt();
                        } catch (Exception error) {
                            System.out.println("Errornya " + error.getMessage() + ". Masukkin angka aja Bos!");
                        } finally {
                            BangunDatar segiTiga = new Segitiga(alas, tinggi);
                            System.out.println("Luas Segitiga adalah " + segiTiga.luas() + " Satuan^2");
                            System.out.println("Keliling Segitiga adalah " + segiTiga.keliling() + " Satuan");
                        }       break;
                    }
                case 5:
                    {
                        int sisi = 0;
                        try {
                            System.out.print("Masukkan sisi : ");
                            sisi = input.nextInt();
                        } catch (Exception error) {
                            System.out.println("Errornya " + error.getMessage() + ". Masukkin angka aja Bos!");
                        } finally {
                            BangunRuang kubus = new Kubus(sisi);
                            System.out.println("Luas kubus adalah " + kubus.luas() + " Satuan^2");
                            System.out.println("Keliling kubus adalah " + kubus.keliling() + " Satuan");
                            System.out.println("Volume kubus adalah " + kubus.volume() + " Satuan^3");
                            System.out.println("Luas permukaan kubus adalah " + kubus.luasPermukaan() + " Satuan^2");
                        }       break;
                    }
                case 6:
                    {
                        int jari = 0, tinggi = 0;
                        try {
                            System.out.print("Masukkan jari-jari : ");
                            jari = input.nextInt();
                            System.out.print("Masukkan tinggi : ");
                            tinggi = input.nextInt();
                        } catch (Exception error) {
                            System.out.println("Errornya " + error.getMessage() + ". Masukkin angka aja Bos!");
                        } finally {
                            BangunRuang silinder = new Silinder(jari, tinggi);
                            System.out.println("Volume silinder adalah " + silinder.volume() + " Satuan^3");
                            System.out.println("Luas permukaan silinder adalah " + silinder.luasPermukaan() + " Satuan^2");
                        }       break;
                    }
                case 7:
                    {
                        int panjang = 0, lebar = 0, tinggi = 0;
                        try {
                            System.out.print("Masukkan panjang: ");
                            panjang = input.nextInt();
                            System.out.print("Masukkan lebar: ");
                            lebar = input.nextInt();
                            System.out.print("Masukkan tinggi : ");
                            tinggi = input.nextInt();
                        } catch (Exception error) {
                            System.out.println("Errornya " + error.getMessage() + ". Masukkin angka aja Bos!");
                        } finally {
                            BangunRuang balok = new Balok(panjang, lebar, tinggi);
                            System.out.println("Volume balok adalah " + balok.volume() + " Satuan^3");
                            System.out.println("Luas permukaan balok adalah " + balok.luasPermukaan() + " Satuan^2");
                        }       break;
                    }
                default:
                    break;
            }
            try {
                System.out.print("Mau lagi ? (y/n)");
                lagi = input.next();
            } catch (Exception error) {
                System.out.println("Errornya " + error.getMessage());
            }

        } while (lagi.equals("y"));
        
    }

}
