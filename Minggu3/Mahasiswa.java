package Minggu3;

public class Mahasiswa {
    public String nama;
    public int nim;
    public char kelamin;
    public float ipk;

    public static void tampilInformasi(Mahasiswa[] mArray){
        for(int i=0; i<3; i++){
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama : " + mArray[i].nama);
            System.out.println("Nim : " + mArray[i].nim);
            System.out.println("Jenis Kelamin : " + mArray[i].kelamin);
            System.out.println("Nilai IPK : " + mArray[i].ipk);
        }
    }

    public static float hitungRataRataIPK(Mahasiswa[] mArray) {
        float totalIPK = 0;
        for (Mahasiswa mahasiswa : mArray) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mArray.length;
    }

    public static void tampilkanIPKTerbesar(Mahasiswa[] mArray) {
        float maxIPK = mArray[0].ipk;
        Mahasiswa mahasiswaTerbesar = mArray[0];
        for (Mahasiswa mahasiswa : mArray) {
            if (mahasiswa.ipk > maxIPK) {
                maxIPK = mahasiswa.ipk;
                mahasiswaTerbesar = mahasiswa;
            }
        }
        System.out.println("\nMahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + mahasiswaTerbesar.nama);
        System.out.println("NIM: " + mahasiswaTerbesar.nim);
        System.out.println("Jenis Kelamin: " + mahasiswaTerbesar.kelamin);
        System.out.println("Nilai IPK: " + mahasiswaTerbesar.ipk);
    }
}
