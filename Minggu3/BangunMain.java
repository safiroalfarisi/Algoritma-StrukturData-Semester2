package Minggu3;

import java.util.Scanner;

public class BangunMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah kerucut yang ingin anda hitung: ");
        int l= input.nextInt();
        Kerucut[] krcArray = new Kerucut[l];
        for(int i =0; i<krcArray.length;i++){
            krcArray[i] = new Kerucut();
            System.out.println("Masukkan atribut kerucut ke-" + (i+1) + " :");
            System.out.print("Masukkan jari jari: ");
            krcArray[i].jariJariKrc=input.nextDouble();
            System.out.print("Masukkan Sisi Miring: ");
            krcArray[i].sisiMiring=input.nextDouble();
        }
        System.out.print("Masukkan jumlah bola yang ingin anda hitung: ");
        int c= input.nextInt();
        Bola[] blArray = new Bola[c];
        for(int i =0; i<blArray.length;i++){
            blArray[i] = new Bola();
            System.out.println("Masukkan atribut bola ke-" + (i+1) + " :");
            System.out.print("Masukkan jari jari: ");
            blArray[i].jariJari=input.nextDouble();
        }
        System.out.print("Masukkan jumlah limas yang ingin anda hitung: ");
        int v= input.nextInt();
        Limas[] lmsArray = new Limas[v];
        for(int i =0; i<lmsArray.length;i++){
            lmsArray[i] = new Limas();
            System.out.println("Masukkan atribut kerucut ke-" + (i+1) + " :");
            System.out.print("Masukkan sisi: ");
            lmsArray[i].sisi=input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            lmsArray[i].tinggi=input.nextDouble();
        }

        for(int i =0; i<krcArray.length;i++){
            System.out.println("Luas Permukaan Bangun Kerucut ke-" + (i + 1) + ": " + krcArray[i].hitungLpKerucut());
            System.out.println("Volume Bangun Kerucut ke-" + (i + 1) + ": " + krcArray[i].hitungVolKerucut());
        }

        for(int i =0; i<blArray.length;i++){
            System.out.println("Luas Permukaan Bangun Bola ke-" + (i + 1) + ": " + blArray[i].hitungLpBola());
            System.out.println("Volume Bangun Bola ke-" + (i + 1) + ": " + blArray[i].hitungVolBola()); 
        }

        for(int i =0; i<lmsArray.length;i++){
            System.out.println("Luas Permukaan Bangun Limas ke-" + (i + 1) + ": " + lmsArray[i].hitungLpLimas());
            System.out.println("Volume Bangun Limas ke-" + (i + 1) + ": " + lmsArray[i].hitungVolLimas()); 
        }

        input.close();
    }
}