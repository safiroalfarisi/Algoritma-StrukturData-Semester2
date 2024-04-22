package Minggu5;

import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelService rooms = new HotelService();
        Hotel h1 = new Hotel("Alley", "Malang", 160000, (byte)1);
        Hotel h2 = new Hotel("Olympus", "Malang", 200000, (byte)5);
        Hotel h3 = new Hotel("Nirvana", "Malang", 250000, (byte)3);
        Hotel h4 = new Hotel("Wangshu", "Malang", 185000, (byte)2);
        Hotel h5 = new Hotel("Morax", "Malang", 198000, (byte)4);
        
        rooms.tambah(h1);
        rooms.tambah(h2);
        rooms.tambah(h3);
        rooms.tambah(h4);
        rooms.tambah(h5);

        System.out.println("Data Hotel tersedia: ");
        rooms.tampil();

        System.out.println("Urutkan hotel berdasar(1:Harga/2:Rating): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Data Hotel dimulai dari harga terendah: ");
                rooms.selectionSortHarga();
                rooms.tampil();
                break;
            case 2:
                System.out.println("Data Hotel dimulai dari rating tertinggi: ");
                rooms.bubbleSortRating();
                rooms.tampil();
            default:
                System.out.println("Pilihan tidak valid!!!");
                break;
        }

        sc.close();
    }
}
