public class Buku27 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stok;

    public Buku27(String kodeBuku2, String judulBuku, int tahunTerbit, String pengarang, int stok){
        this.kodeBuku = kodeBuku2;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    public void tampilDataBuku(){
        System.out.println("==========================");
        System.out.println("Kode buku : " + kodeBuku);
        System.out.println("Judul buku : " + judulBuku);
        System.out.println("Tahun terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stok : " + stok);
    }
}
