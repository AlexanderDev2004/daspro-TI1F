import java.util.Scanner;

public class tugas03 {
    public static void main(String[] args) {
        int n;
        int[] arraylnt;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;
        int total = 0;

        // Input banyaknya elemen array
        System.out.print("Masukkan banyaknya elemen array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // Inisialisasi array
        arraylnt = new int[n];

        // Input isi array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + ": ");
            arraylnt[i] = sc.nextInt();

            // Periksa nilai tertinggi
            nilaiTertinggi = Math.max(nilaiTertinggi, arraylnt[i]);

            // Periksa nilai terendah
            nilaiTerendah = Math.min(nilaiTerendah, arraylnt[i]);

            // Hitung total
            total += arraylnt[i];
        }

        // Cetak nilai tertinggi
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);

        // Cetak nilai terendah
        System.out.println("Nilai terendah: " + nilaiTerendah);

        // Cetak rata-rata
        System.out.println("Rata-rata: " + (total / n));
    }
}
