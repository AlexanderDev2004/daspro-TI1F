package jobsheet14;
public class DeretDescendingRekursif03 {

    // Fungsi rekursif
    static void deretDescendingRekursif(int n) {
        // Basis case
        if (n < 0) {
            return;
        }
        
        // Tampilkan nilai n
        System.out.print(n + " ");

        // Panggil fungsi rekursif untuk nilai n-1
        deretDescendingRekursif(n - 1);
    }

    // Fungsi iteratif
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        // Contoh pemanggilan fungsi rekursif
        System.out.println("Menggunakan Rekursif:");
        deretDescendingRekursif(5); // Ganti 5 dengan nilai n yang diinginkan
        System.out.println();

        // Contoh pemanggilan fungsi iteratif
        System.out.println("Menggunakan Iteratif:");
        deretDescendingIteratif(5); // Ganti 5 dengan nilai n yang diinginkan
    }
}
