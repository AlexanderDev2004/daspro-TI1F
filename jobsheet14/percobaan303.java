package jobsheet14;
import java.util.Scanner;

public class percobaan303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Jumlah saldo awal ");
        int saldoAwal = sc.nextInt();
        System.out.println("lama inventasi (tahun) ");
        int tahun = sc.nextInt();

        System.out.println("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.println(hitunglaba(saldoAwal, tahun));
    }

    static double hitunglaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return 1.11 * hitunglaba(saldo, tahun - 1);
        }
    }
}
