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
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai Akhir " + total + " Sehingga " + message);
    }
}