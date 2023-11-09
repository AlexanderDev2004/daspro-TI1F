package jobsheet11;
import java.util.Scanner;

public class porsenipolinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] dataAtlet = new String[4][2];

        // Nama cabang olahraga
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};

        // Memasukkan nama atlet 1 dan 2 untuk setiap cabang olahraga
        for (int i = 0; i < dataAtlet.length; i += 2) {
            int cabangIndex = i / 2;
            System.out.print("Masukkan nama Atlet 1 untuk cabang " + cabangOlahraga[cabangIndex] + ": ");
            dataAtlet[i][0] = input.nextLine();
            dataAtlet[i][1] = cabangOlahraga[cabangIndex];

            System.out.print("Masukkan nama Atlet 2 untuk cabang " + cabangOlahraga[cabangIndex] + ": ");
            dataAtlet[i + 1][0] = input.nextLine();
            dataAtlet[i + 1][1] = cabangOlahraga[cabangIndex];
        }

        // Mengurutkan array secara ascending berdasarkan nama atlet
        for (int i = 0; i < dataAtlet.length - 1; i++) {
            for (int j = 0; j < dataAtlet.length - i - 1; j++) {
                if (dataAtlet[j][0].compareTo(dataAtlet[j + 1][0]) > 0) {
                    // Swap jika nama atlet sekarang lebih besar dari nama atlet berikutnya
                    String[] temp = dataAtlet[j];
                    dataAtlet[j] = dataAtlet[j + 1];
                    dataAtlet[j + 1] = temp;
                }
            }
        }

        // Menampilkan informasi nama atlet dan cabang olahraga
        System.out.println();
        System.out.println("\nInformasi Atlet Porseni 2024:");
        System.out.println();
        for (String[] atlet : dataAtlet) {
            System.out.println();
            System.out.println("Nama: " + atlet[0] + ", Cabang: " + atlet[1]);
        }

        input.close();
    }
}
