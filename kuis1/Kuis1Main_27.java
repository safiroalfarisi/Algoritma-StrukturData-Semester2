package kuis1;

import java.util.Scanner;

public class Kuis1Main_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama penyewa: ");
        String namaPenyewa = scanner.nextLine();
        System.out.print("Masukkan nomor sepeda: ");
        int nomorSepeda = scanner.nextInt();
        System.out.print("Masukkan jumlah stok: ");
        int stok = scanner.nextInt();
        System.out.print("Masukkan durasi sewa: ");
        int durasiSewa = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan nama petugas: ");
        String namaPegawai = scanner.nextLine();
        

        Kuis1_27 sepeda1 = new Kuis1_27(namaPenyewa, nomorSepeda, stok,  durasiSewa, namaPegawai);

        sepeda1.hitungBiayaSewa(durasiSewa);
        sepeda1.cetakStruk();

        System.out.print("Masukkan pengurangan stok sepeda: ");
        int jml = scanner.nextInt();

        sepeda1.hitungSisaStok(jml);

        scanner.close();
    }
}
