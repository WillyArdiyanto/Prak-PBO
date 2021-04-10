/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Segitiga extends BangunDatar{
    int alas, tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    @Override
    double luas(){
        return (0.5*alas*tinggi);
    }
    
    @Override
    double keliling(){
        return Math.sqrt(Math.pow(alas/2, 2)+Math.pow(tinggi, 2))*2+alas;
    }
}
