package jobsheet6;
import java.util.Scanner;
public class Pemilihan2Percobaan303 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kategori;
        int penghasilan, gajibersih;
        double pajak = 0;

        System.out.println("Masukkan kategori (pekerja/pembisnis): ");
        kategori = input.nextLine();
        System.out.println("Masukkan besarnya penghasilan: ");
        penghasilan = input.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan bersih: " + gajibersih);
        } else if (kategori.equalsIgnoreCase("pembisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 35000000)
                pajak = 0.2;
            else
                pajak = 0.25;
            double gajibersihDouble = penghasilan - (pajak * penghasilan);
            System.out.println("Penghasilan bersih: " + gajibersihDouble);
        } else {
            System.out.println("Kategori salah, Bro");
        }

        
    }
}
