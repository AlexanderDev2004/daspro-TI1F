package jobsheet14;
import java.util.Scanner;

public class CekPrimaRekursif03 {

    // Fungsi rekursif untuk mengecek apakah suatu bilangan adalah bilangan prima
    static boolean cekPrimaRekursif(int n, int i) {
        // Basis case: jika n kurang dari atau sama dengan 1, kembalikan false
        if (n <= 1) {
            return false;
        }

        // Basis case: jika i sampai setengah dari n tidak ada yang habis dibagi n, kembalikan true
        if (i == 1) {
            return true;
        }

        // Jika n habis dibagi i, kembalikan false
        if (n % i == 0) {
            return false;
        }

        // Panggil fungsi rekursif untuk i-1
        return cekPrimaRekursif(n, i - 1);
    }

    public static void main(String[] args) {
        // Menerima input dari pengguna
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = sc.nextInt();

        // Memanggil fungsi rekursif untuk mengecek bilangan prima
        boolean hasil = cekPrimaRekursif(bilangan, bilangan / 2);

        // Menampilkan hasil apakah bilangan tersebut prima atau bukan
        if (hasil) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

        // Menutup scanner
        sc.close();
    }
}
