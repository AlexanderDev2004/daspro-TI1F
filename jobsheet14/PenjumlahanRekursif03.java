package jobsheet14;
public class PenjumlahanRekursif03 {
      // Fungsi rekursif untuk menghitung penjumlahan bilangan
      static int penjumlahanRekursif(int n) {
        // Basis case: jika n adalah 0, kembalikan 0
        if (n == 0) {
            return 0;
        }
        
        // Panggil fungsi rekursif untuk n-1 dan tambahkan n
        return n + penjumlahanRekursif(n - 1);
    }

    public static void main(String[] args) {
        // Contoh penggunaan fungsi rekursif untuk menghitung penjumlahan bilangan
        int f = 8; // Ganti dengan bilangan yang diinginkan
        int hasil = penjumlahanRekursif(f);

        System.out.println("Penjumlahan dari 1 sampai " + f + " adalah: " + hasil);
    }
}

