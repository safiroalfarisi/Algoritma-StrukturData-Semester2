import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM: ");
        long nim = input.nextLong();

        // Dapatkan 2 digit terakhir NIM
        int n = (int) (nim % 100);

        // Tambahkan 10 jika n kurang dari 10
        if (n < 10) {
            n += 10;
        }

        // Cetak deretan bilangan
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i==6||i==10) {
                    continue;
                }else{
                    System.out.print(i + " ");
                }
            } else {
                System.out.print("* ");
            }
        }

        System.out.println();
        input.close();
    }
}
