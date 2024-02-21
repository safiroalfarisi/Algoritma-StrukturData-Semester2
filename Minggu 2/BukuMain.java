public class BukuMain {
    public static void main(String[] args) {
        
        
        
        Buku27 bk1 = new Buku27();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku27 bk2 = new Buku27("Self Reward", "Maheera", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku27 bkFiro = new Buku27("Negeri 5 Menara", "Andrea Hirata", 416, 15, 65000);
        bkFiro.tampilInformasi();
        bkFiro.restock(50);
        bkFiro.terjual(9);
        bkFiro.gantiHarga(60000);
        bkFiro.tampilInformasi();
    }
}
