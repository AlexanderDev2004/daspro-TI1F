import java.util.Scanner;

public class LinearSearch03 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int n;
        int[] arraylnt;
        int key;
        int hasil = 0;

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
        }

        // Input key yang ingin dicari
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        // Pencarian elemen key
        for (int i = 0; i < arraylnt.length; i++) {
            if (arraylnt[i] == key) {
                hasil = i;
                break;
            }
        }

        // Cetak indeks posisi elemen key
        if (hasil != 0) {
            System.out.println("Key ada di dlm array pada posisi indeks ke- " + hasil);
        } else {
            System.out.println("key tidak ditemukan");
        }
    }
}
