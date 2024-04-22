package Minggu4;

public class Mobil {
    String merk, tipe;
    int tahun;
    double topAcceleration, topPower;

    public Mobil(String merk, String tipe, int tahun, double topAcceleration, double topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    public static double cariAkselerasiMax(Mobil[] data, int low, int high) {
        if (low == high) {
            return data[low].topAcceleration;
        } else {
            int mid = (low + high) / 2;
            double leftMax = cariAkselerasiMax(data, low, mid);
            double rightMax = cariAkselerasiMax(data, mid + 1, high);
            return Math.max(leftMax, rightMax);
        }
    }

    public static double cariAkselerasiMin(Mobil[] data, int low, int high) {
        if (low == high) {
            return data[low].topAcceleration;
        } else {
            int mid = (low + high) / 2;
            double leftMin = cariAkselerasiMin(data, low, mid);
            double rightMin = cariAkselerasiMin(data, mid + 1, high);
            return Math.min(leftMin, rightMin);
        }
    }

    public static double hitungRataRataTopPower(Mobil[] data) {
        double totalPower = 0;
        for (Mobil mobil : data) {
            totalPower += mobil.topPower;
        }
        return totalPower / data.length;
    }
}
