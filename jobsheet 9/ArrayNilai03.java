import java.util.Scanner;

public class ArrayNilai03 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan Nilai Akhir ke-" + i + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            // Mengubah nilai kelulusan
            if (nilaiAkhir[i] >= 70) {
                nilaiAkhir[i] = 1;
            } else {
                nilaiAkhir[i] = 0;
            }
        }

        // Mencetak status kelulusan
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Nilai Akhir ke-" + i + " " + (nilaiAkhir[i] == 1 ? "lulus" : "tidak lulus"));
        }
    }
}
