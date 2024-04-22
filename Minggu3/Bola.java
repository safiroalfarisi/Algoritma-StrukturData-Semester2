package Minggu3;

public class Bola {
    public double jariJari;

    public double hitungLpBola() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolBola() {
        return 4 / 3 * Math.PI * jariJari * jariJari * jariJari;
    }
}