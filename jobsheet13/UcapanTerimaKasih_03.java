package jobsheet13;
import java.util.Scanner;

public class UcapanTerimaKasih_03 {
    public static String penerimaucapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yg di beri ucapan :");
        String namaorang = sc.nextLine();
        sc.close();
        return namaorang;
    }
    public static void Ucapanterimahkasih() {
        String nama = penerimaucapan();
        System.out.println("Thank you " + nama +"Atas kerja keras selama ini hehehe. maaf merepotkan" );
    }
    public static void main(String[] args) {
        Ucapanterimahkasih();
    }
}
