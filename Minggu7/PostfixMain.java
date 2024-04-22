package Minggu7;

import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String P, Q;

    System.out.println("Masukkan ekspresi matematika (infix): ");
    Q = scan.nextLine();
    Q = Q.trim();
    Q = Q + ")";

    int total = Q.length();

    Postfix27 post = new Postfix27(total);
    P = post.konversi(Q);
    System.out.println("Postfix: " + P);
    }
}
