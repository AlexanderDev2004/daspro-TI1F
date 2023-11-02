package jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner03 {

    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        Scanner sc = new Scanner(System.in);
        String next = ""; // Initialize next

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("Masukan nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Masukan baris: ");
                    int baris = Integer.parseInt(sc.nextLine());
                    System.out.println("Masukan kolom: ");
                    int kolom = Integer.parseInt(sc.nextLine());

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom kursi tidak tersedia. Silakan masukkan ulang.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi tersebut sudah ditempati oleh penonton lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil dimasukkan.");
                    }

                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] == null) {
                                System.out.println("Kursi " + (i + 1) + "-" + (j + 1) + ": ***");
                            } else {
                                System.out.println("Kursi " + (i + 1) + "-" + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu tidak valid. Silakan masukkan ulang.");
            }

            System.out.print("Lanjutkan (Y/N): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
