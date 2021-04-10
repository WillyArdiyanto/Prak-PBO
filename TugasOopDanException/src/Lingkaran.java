/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Lingkaran extends BangunDatar{
     int jari;

    public Lingkaran(int jari) {
        this.jari = jari;
    }
    
    @Override
    double luas(){
        return Math.PI*jari*jari;
    }
    
    @Override
    double keliling(){
        return 2*Math.PI*jari;
    } 
}
