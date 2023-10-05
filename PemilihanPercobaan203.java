import java.util.Scanner;

public class PemilihanPercobaan203 {

    public static void main(String[] args) {
        Scanner Input00 = new Scanner(System.in);

        System.out.println("Nilai Uas    :");
        float uas = Input00.nextInt();
        System.out.println("Nilai Uts    :");
        float uts = Input00.nextInt();
        System.out.println("Nilai kuis    :");
        float kuis = Input00.nextInt();
        System.out.println("Nilai tugas    :");
        float tugas = Input00.nextInt();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 60 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai Akhir " + total + " Sehingga " + message);

        // membuat variable dahulu
        String nilaiHuruf;
        String kualifikasi;
        String nilaisetara;
        // memakai  (if...ifelse....else)
        if (total >= 85) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
            nilaisetara = "4";
        } else if (total >= 70) {
            nilaiHuruf = "B+";
            kualifikasi = "lebih Baik";
            nilaisetara = "3.5";
        } else if (total >= 65) {
            nilaiHuruf = "b";
            kualifikasi = "baik";
            nilaisetara = "3";
        } else if (total >= 60) {
            nilaiHuruf = "c+";
            kualifikasi = "lebih cukup";
            nilaisetara = "2.5";
        } else if (total >= 50) {
            nilaiHuruf = "c";
            kualifikasi = "cukup";
            nilaisetara = "2";
        } else if (total >= 39) {
            nilaiHuruf = "D";
            kualifikasi = "kurang";
            nilaisetara = "1";
        } else {
            nilaiHuruf = "e";
            kualifikasi = "Kurang";
            nilaisetara = "0";
        }
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
        System.out.println("Nilai Setara: " + nilaisetara);

    }
}