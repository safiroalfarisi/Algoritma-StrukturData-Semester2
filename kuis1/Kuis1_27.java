package kuis1;

public class Kuis1_27 {
    private String namaPenyewa;
    private int nomorSepeda;
    private int stok;
    private int durasiSewa;
    private String namaPegawai;

    public Kuis1_27(String namaPenyewa, int nomorSepeda, int stok, int durasiSewa, String namaPegawai) {
        this.namaPenyewa = namaPenyewa;
        this.nomorSepeda = nomorSepeda;
        this.stok = stok;
        this.durasiSewa = durasiSewa;
        this.namaPegawai = namaPegawai;
    }

    public float hitungBiayaSewa(int durasiSewa) {
        float biayaSewa = 5000 * durasiSewa;
        return biayaSewa;
    }

    public void cetakStruk() {
        System.out.println("------ Struk Transaksi ------");
        System.out.println("Nama Penyewa: " + namaPenyewa);
        System.out.println("Nomor Sepeda: " + nomorSepeda);
        System.out.println("Durasi Sewa: " + durasiSewa + " hari");
        System.out.println("Biaya Sewa: Rp" + hitungBiayaSewa(durasiSewa));
        System.out.println("Petugas: " + namaPegawai);
        System.out.println("------ Terima Kasih ------");
    }

    public void hitungSisaStok(int jml) {
        int sisaStok = stok - jml;
        System.out.println("Sisa stok adalah: " + sisaStok);
    }

}
