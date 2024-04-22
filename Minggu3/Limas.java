package Minggu3;

public class Limas {
    public double sisi;
    public double tinggi;

    public double hitungTinggiSisiSegitiga() {
        return Math.sqrt((sisi/2)*(sisi/2)+tinggi*tinggi);
    }
    
    public double hitungLpLimas() {
        double tinggiSisi = hitungTinggiSisiSegitiga();
        return sisi * sisi + 4 * (sisi * tinggiSisi) / 2;
    }

    public double hitungVolLimas() {
        return 1 / 3 * sisi * sisi * tinggi;
    }
}