package uts;

import java.util.Scanner;

public class Nimgenap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String USaha;
        double pajak = 0, penghasilan = 0;

        System.out.println("Apakah anda memiliki USaha (Y/N) : ");
        USaha = sc.nextLine();

        if (USaha.equalsIgnoreCase("Y")) {
            // Pengguna memiliki usaha
            System.out.println("Masukan penghasilan Setahun Anda Selama 1 Tahun : ");
            penghasilan = sc.nextDouble();
            pajak = 0.15;

            // jenis harta
            System.out.println("Masukan jenis Harta Anda (kendaraan/perhiasan) : ");
            String jenisHarta = sc.next();

            if (jenisHarta.equalsIgnoreCase("kendaraan")) {
                System.out.print("Masukkan nama kendaraan: ");
                String namaKendaraan = sc.next();
                System.out.print("Masukkan nilai jual saat ini: ");
                double nilaiKendaraan = sc.nextDouble();

                // Proses perhitungan pajak berdasarkan nilai kendaraan
                double total = (0.15 * penghasilan) + (0.5 * nilaiKendaraan);
                System.out.println("Total Pajak Kendaraan Anda Adalah: " + total);
            } else if (jenisHarta.equalsIgnoreCase("perhiasan")) {
                System.out.print("Masukkan jenis perhiasan: ");
                String jenisPerhiasan = sc.next();
                System.out.print("Masukkan nilai jual saat ini: ");
                double nilaiPerhiasan = sc.nextDouble();

                // Proses perhitungan pajak berdasarkan nilai perhiasan
                double total = (0.15 * penghasilan)+  + (0.5 * nilaiPerhiasan);
                System.out.println("Total pajak perhiasan : " + total);
            }
        } else if (USaha.equalsIgnoreCase("N")) {
            // Pengguna tidak memiliki usaha
            System.out.println("Masukan penghasilan Setahun Anda Selama 1 Tahun : ");
            penghasilan = sc.nextDouble();
            pajak = 0.1; // Misalnya, pajak 10% jika tidak memiliki usaha

        } else {
            System.out.println("Input salah");
        }
        // Tambahkan pertanyaan tentang status keluarga
        System.out.println("Apakah Anda sudah berkeluarga (Y/N) : ");
        String statusKeluarga = sc.next();

        if (statusKeluarga.equalsIgnoreCase("Y")) {
            System.out.println("Berapa anak Anda yang kuliah? : ");
            int anakKuliah = sc.nextInt();
            System.out.println("Berapa anak Anda yang SMA? : ");
            int anakSMA = sc.nextInt();

            // Tambahkan perhitungan pajak berdasarkan kondisi keluarga dan pendidikan anak
            if (anakKuliah == 1 && anakSMA == 1) {
                if (penghasilan > 0) {
                    pajak -= 0.10 * pajak; // Potongan pajak 10%
                }
            }
        }

        System.out.println("Total pajak yang harus dibayarkan: " + (pajak * penghasilan));
    }
}
