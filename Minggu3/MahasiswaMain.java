package Minggu3;

import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Mahasiswa[] mArray = new Mahasiswa[3];

        for(int i=0; i<3; i++){
            mArray[i]= new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama mahasiswa: ");
            mArray[i].nama= sc.nextLine();
            System.out.print("Masukkan NIM: ");
            mArray[i].nim= sc.nextInt();
            System.out.print("Masukkan jenis kelamin: ");
            mArray[i].kelamin= sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            mArray[i].ipk=sc.nextFloat();
            sc.nextLine();
        } 

        Mahasiswa.tampilInformasi(mArray);

        float rataRataIPK = Mahasiswa.hitungRataRataIPK(mArray);
        System.out.println("\nRata-rata IPK: " + rataRataIPK);

        Mahasiswa.tampilkanIPKTerbesar(mArray);

        sc.close();
    }
    
}
