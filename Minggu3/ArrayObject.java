package Minggu3;

import java.util.Scanner;
public class ArrayObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan panjang array: ");
        int j= sc.nextInt();
        PersegiPanjang27[] ppArray = new PersegiPanjang27[j];
        // PersegiPanjang27[] ppArray = new PersegiPanjang27[3];

        

        for(int i=0; i<3; i++){
            ppArray[i] = new PersegiPanjang27();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i=0; i<3; i++){
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }

        sc.close();

        // ppArray[0] = new PersegiPanjang27();
        // ppArray[0].panjang=110;
        // ppArray[0].lebar=20;

        // ppArray[1] = new PersegiPanjang27();
        // ppArray[1].panjang=80;
        // ppArray[1].lebar=40;

        // ppArray[2] = new PersegiPanjang27();
        // ppArray[2].panjang=100;
        // ppArray[2].lebar=20;

        // System.out.println("Persegi panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        // System.out.println("Persegi panjang ke-1, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        // System.out.println("Persegi panjang ke-2, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    }
}
