import java.util.Scanner;

public class ForKelipatan03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kelipatan;
        int counter = 0, total = 0;
        System.out.println("Masukkan Bilangan kelipatan (1-9) : ");
        kelipatan = sc.nextInt();
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }
        System.out.println("Banyaknya kelipatan dari 1-50 adalah : " + counter);
        System.out.println("Total kelipatan dari 1-50 adalah : " + total);
    }
}
