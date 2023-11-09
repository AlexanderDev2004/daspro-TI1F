package jobsheet11;
import java.util.Scanner;

public class SegitigaAngka {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Menambahkan spasi sebelum angka
                for (int j = 1; j <= N - i; j++) {
                    System.out.print("  ");
                }
                // Mencetak angka
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                    // Menambahkan spasi antar angka
                    if (k < i) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        input.close();
    }
}