import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        // Input nilai
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai Kuis: ");
        double nilaiKuis = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();
        System.out.println("======================");
        System.out.println("======================");

        // Pengecekan Validasi Nilai
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid!");
            System.out.println("======================");
            System.out.println("======================");
            return;
        }

        // Perhitung nilai akhir
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);

        // Konversi Nilai
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // Tampilan Akhir
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("======================");
        System.out.println("======================");
        if ((nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C"))) {
            System.out.println("Keterangan: " + "LULUS" );
        } else{
            System.out.println("Keterangan: " + "TIDAK LULUS" );
        }
        
        input.close();
    }
}
