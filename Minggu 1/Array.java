import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 0 = Pancasila   4 = Bing
        // 1 = KTI         5 = Daspro
        // 2 = CTPS        6 = Pdaspro
        // 3 = MatDas      7 = K3
        String [] mk = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int[] SKS = {2,2,2,3,2,2,3,2};
        double[] nilaiAngka = new double[8];
        double[] bobotNilai = new double[8];
        String[] nilaiHuruf = new String[8];
        double totalNilai=0,IP;

        System.out.println("======================");
        System.out.println("\nProgram Menghitung IP Semester");
        System.out.println("======================");
        System.out.print("\nMasukkan nilai angka untuk MK Pancasila : ");
        nilaiAngka[0] = input.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Konsep Teknologi Informasi : ");
        nilaiAngka[1]= input.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Critical Thinking and Problem Solving : ");
        nilaiAngka[2]= input.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Matematika Dasar : ");
        nilaiAngka[3]= input.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Bahasa Inggris : ");
        nilaiAngka[4]= input.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Dasar Pemrograman : ");
        nilaiAngka[5]= input.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Praktikum Dasar Pemrograman : ");
        nilaiAngka[6]= input.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Keselamatan dan Kesehatan Kerja : ");
        nilaiAngka[7]= input.nextDouble();

        for (int i = 0; i < 8; i++) {
            if (nilaiAngka[i] <= 100 && nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiAngka[i] <= 80 && nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] <= 73 && nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiAngka[i] <= 65 && nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] <= 60 && nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiAngka[i] <= 50 && nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }
        System.out.println("======================");
        System.out.println();
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.println();
        System.out.printf("%-40s %-12s  %-8s    %-13s\n","MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.printf("%-43s %.2f          %-12s %.2f\n",mk[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }


        System.out.println();
        System.out.println("======================");
        System.out.println();
        for (int i = 0; i < bobotNilai.length; i++) {
            totalNilai += (bobotNilai[i]*SKS[i]);
        }
        IP = totalNilai / 18;
        System.out.printf("IP = %.2f",IP);

        input.close();
    }
}