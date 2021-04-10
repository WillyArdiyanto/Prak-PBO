/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Balok extends BangunRuang{
    int panjang, lebar, tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    double volume(){
        return panjang*lebar*tinggi;
    }
    
    @Override
    double luasPermukaan(){
        return ((2*(panjang*lebar))+(2*(lebar*tinggi))+(2*(panjang*tinggi)));
    }
}
