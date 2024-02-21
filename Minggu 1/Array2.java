import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAngka = new int[8];
        String[] nilaiHuruf = new String[8], 
        mk = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double[] bobotNilai = new double[8];
        int sks [] = {2,2,2,3,2,2,3,2};
        double nilaiTotal = 0;
        double totalSKS=0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i=0; i<mk.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " +mk[i]+ " : ");
            nilaiAngka[i] = sc.nextInt();
        } 
        
        System.out.println("==============================");
        System.out.println("Hasil konversi nilai");
        System.out.println("==============================");

        for (int i=0; i<nilaiAngka.length; i++) {
            if (nilaiAngka[i]>80 && nilaiAngka[i]<=100) {
                nilaiHuruf[i]="A";
            } if (nilaiAngka[i]>73 && nilaiAngka[i]<=80) {
                nilaiHuruf[i]="B+";
            } if (nilaiAngka[i]>65 && nilaiAngka[i]<=73) {
                nilaiHuruf[i]="B";
            } if (nilaiAngka[i]>60 && nilaiAngka[i]<=65) {
                nilaiHuruf[i]="C+";
            }if (nilaiAngka[i]>50 && nilaiAngka[i]<=60) {
                nilaiHuruf[i]="C";
            }if (nilaiAngka[i]>39 && nilaiAngka[i]<=50) {
                nilaiHuruf[i]="D";
            } else if (nilaiAngka[i]<=39) {
                nilaiHuruf[i]="E";
            }
        }

        for (int i=0; i<nilaiHuruf.length; i++) {
            if (nilaiHuruf[i].equals("A")) {
                bobotNilai[i]=4.00;
            } if (nilaiHuruf[i].equals("B+")) {
                bobotNilai[i]=3.50;
            } if (nilaiHuruf[i].equals("B")) {
                bobotNilai[i]=3.00;
            } if (nilaiHuruf[i].equals("C+")) {
                bobotNilai[i]=2.50;
            } if (nilaiHuruf[i].equals("C")) {
                bobotNilai[i]=2.00;
            } if (nilaiHuruf[i].equals("D")) {
                bobotNilai[i]=1.00;
            } else if (nilaiHuruf[i].equals("E")) {
                bobotNilai[i]=0.00;
            }
        }

        for (int i=0; i<nilaiAngka.length; i++) {
            System.out.printf("%-40s%-20s%-20s%-20s\n", mk[i], nilaiAngka[i], nilaiHuruf[i], String.format("%.2f", bobotNilai[i]));
        }

        System.out.println("==============================");

        for (int i=0; i<bobotNilai.length; i++) {
           nilaiTotal+=bobotNilai[i]*sks[i];
        }

        for (int i = 0; i < sks.length; i++) {
            totalSKS += sks[i];
    }

        double ip = nilaiTotal/totalSKS;

        System.out.printf("IP : %.2f\n", ip);

        sc.close();
    }
}
