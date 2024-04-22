package Minggu7;

import java.util.Scanner;

public class Utama27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tentukan kapasitas gudang: ");
        int n = scan.nextInt();
        Gudang27 gudang = new Gudang27(n);
        
        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang teratas");
            System.out.println("5. Tampilkan barang terbawah");
            System.out.println("6. Cari barang (kode/nama)");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scan.nextLine();
                    Barang27 barangBaru = new Barang27(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                case 4:
                    gudang.lihatBarangTeratas();
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("Masukkan nama/kode barang yang dicari: ");
                    String cari = scan.nextLine();
                    gudang.cariBarang(cari);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
                    break;
            }
        }
    }    
}