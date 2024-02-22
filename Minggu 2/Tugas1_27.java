public class Tugas1_27 {
    String judul,pengarang;
    int halaman, stok, harga, hargaTotal, hargaBayar;
    double diskon;

    public Tugas1_27(String jud, String pg, int hal, int stok, int har){
        judul=jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp." + harga);
        for (int i=0;i<30;i++){
            System.out.print("=");
        }
        
    }

    void terjual(int jml) {
        if (stok>0) {
            stok-= jml;
        }else{
            System.out.println("Stok barang habis");
        }
    }

    void restock(int jml){
        stok+= jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
    
    void hitungHargaTotal(int jml){
        hargaTotal = harga*jml;
        System.out.println("\nJumlah barang: " + jml);
        System.out.println("Harga: " + hargaTotal);
    }

    void hitungDiskon(){
        if (hargaTotal>150000) {
            diskon = hargaTotal * 0.12;
            System.out.println("Diskon: " + diskon);
        }else if (hargaTotal >= 75000 && hargaTotal<=150000) {
            diskon = hargaTotal * 0.05;
            System.out.println("Diskon: " + diskon);
        }else if (hargaTotal >= 75000) {
            diskon = hargaTotal * 0;
            System.out.println("Diskon: " + diskon);
        }
    }

    void hitungHargaBayar(){
        hargaBayar = (int) (hargaTotal-diskon);
        System.out.println("Harga Bayar: " + hargaBayar);
        System.out.println("==============================");
    }
}
