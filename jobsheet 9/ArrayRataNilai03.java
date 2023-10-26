import java.util.Scanner;

public class ArrayRataNilai03 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] Nilaimhs = new int[10];
            int jml_lulus = 0;
            int jml_tidak_lulus = 0;
            double total_lulus = 0;
            double total_tidak_lulus = 0;
            double rata2_lulus;
            double rata2_tidak_lulus;

            System.out.print("Masukkan jumlah mahasiswa: ");
            int jml_mhs = sc.nextInt();

            for (int i = 0; i < jml_mhs; i++) {
                System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + ": ");
                Nilaimhs[i] = sc.nextInt();

                if (Nilaimhs[i] >= 70) {
                    jml_lulus++;
                    total_lulus += Nilaimhs[i];
                } else {
                    jml_tidak_lulus++;
                    total_tidak_lulus += Nilaimhs[i];
                }
            }

            rata2_lulus = total_lulus / jml_lulus;
            rata2_tidak_lulus = total_tidak_lulus / jml_tidak_lulus;

            System.out.println("Rata-rata nilai kelulusan: " + rata2_lulus);
            System.out.println("Rata-rata nilai tidak kelulusan: " + rata2_tidak_lulus);
        }
    }
}
