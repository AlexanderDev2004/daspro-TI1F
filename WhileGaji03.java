import java.util.Scanner;

public class WhileGaji03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahkaryawan, jumlahjamlembur;
        double totalgajilembur = 0;
        String jabatan;

        System.out.println("Masukan Jumlah karyawan: ");
        jumlahkaryawan = sc.nextInt();

        for (int i = 0; i < jumlahkaryawan; i++) {
            System.out.println("Pilih jabatan (Direktur/Manajer/Karyawan): ");
            System.out.println("Pilih jabatan karyawan ke " + (i + 1) + ": ");
            jabatan = sc.next();
            System.out.println("Masukan Jam lembur: ");
            jumlahjamlembur = sc.nextInt();

            double gajilembur = 0;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajilembur = jumlahjamlembur * 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajilembur = jumlahjamlembur * 750000;
            }

            totalgajilembur += gajilembur;
        }
        System.out.println("Total gaji lembur: " + totalgajilembur);
    }
}
