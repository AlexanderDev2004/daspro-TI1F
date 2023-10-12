package jobsheet3;
import java.util.Scanner;
public class Bank03 {

    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        int jml_tabungan_Awal, Lama_Menambung;
        double Prosentase_bunga = 0.02, bunga, jml_tabungan_Akhir;
        System.out.println("Masukan Jumlah Tabungan Anda :");
        jml_tabungan_Awal = Input.nextInt();
        System.out.println("Masukan Lama Menambung Anda : ");
        Lama_Menambung = Input.nextInt();
        bunga= Lama_Menambung * Prosentase_bunga * jml_tabungan_Awal;
        jml_tabungan_Akhir=bunga+jml_tabungan_Awal;
        System.out.println("Bunga Adalah " + bunga);
        System.out.println("Jumlah tabungan Akhir adalah : " + jml_tabungan_Akhir);


    }
}