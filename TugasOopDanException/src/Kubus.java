/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Kubus extends BangunRuang {

    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }

    @Override
    double volume() {
        return Math.pow(sisi, 3);
    }

    @Override
    double luasPermukaan() {
        return sisi*sisi*6;
    }
}
