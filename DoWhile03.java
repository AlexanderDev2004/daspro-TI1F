import java.util.Scanner;

public class DoWhile03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int jatahcuti, jumlahhari;
        String konfirmasi;

        System.out.println("Masukkan Jatah cuti: ");
        jatahcuti = sc.nextInt();

        do {
            System.out.println("Apakah kamu mengambil Cuti (Y/N): ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("Y")) {
                System.out.println("Masukkan Jumlah Hari: ");
                jumlahhari = sc.nextInt();

                if (jumlahhari <= jatahcuti) {
                    jatahcuti -= jumlahhari;
                    System.out.println("Sisa jatah cuti anda adalah " + jatahcuti);
                } else {
                    System.out.println("Sisa jatah cuti tidak mencukupi.");
                    break;
                }
            } else {
                System.out.println("Terima kasih, Anda tidak mengambil cuti.");
                break;
            }
        } while (jatahcuti > 0);

        sc.close();
    }
}
