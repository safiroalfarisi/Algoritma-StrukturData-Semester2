import java.util.Scanner;

public class BukuMain27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        PencarianBuku27 data = new PencarianBuku27();
        int jumBuku = 5;

        System.out.println("------------------------------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari Kode Buku Terkecil : ");
        for (int i=0; i<jumBuku; i++){
            System.out.println("--------------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku= sc1.nextLine();
            System.out.print("Judul Buku \t: ");
            String judulBukuBuku= sc1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit= sc.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang= sc1.nextLine();
            System.out.print("Stok \t: ");
            int stok= sc.nextInt();

            Buku27 m = new Buku27(kodeBuku, judulBukuBuku, tahunTerbit, pengarang, stok);
            data.tambah(m);
        }
        System.out.println("----------------------------------------------");
        System.out.println("Data Keseluruhan Buku");
        data.tampil();

        System.out.println();
        System.out.println();
        System.out.print("Cari buku berdasarkan judul: ");
        String cariJudul = sc1.nextLine();
        System.out.println("menggunakan sequential search");
        data.sort();
        int posisi = data.findSeqSearchJudul(cariJudul);
        data.tampilData(cariJudul, posisi);
        System.out.println("==================================");
        System.out.println("menggunakan binary search");
        posisi = data.findJudulBinarySearch(cariJudul, 0, data.listBk.length - 1);
        data.tampilData(cariJudul, posisi);
        sc.close();
        sc1.close();
    }
}
