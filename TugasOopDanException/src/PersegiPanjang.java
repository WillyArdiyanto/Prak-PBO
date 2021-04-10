/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class PersegiPanjang extends BangunDatar{
    int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    double luas(){
        return panjang*lebar;
    }
    
    @Override
    double keliling(){
        return 2*panjang+2*lebar;
    }
}
