package Minggu3;

public class Kerucut {
    public double jariJariKrc;
    public double sisiMiring;

    public double hitungLpKerucut() {
        return Math.PI * jariJariKrc * (jariJariKrc + sisiMiring);
    }

    public double hitungTinggiKerucut() {
        return Math.sqrt(sisiMiring * sisiMiring - jariJariKrc * jariJariKrc);
    }

    public double hitungVolKerucut() {
        double tinggi = hitungTinggiKerucut(); 
        return (1.0 / 3) * Math.PI * jariJariKrc * jariJariKrc * tinggi;
    }
}