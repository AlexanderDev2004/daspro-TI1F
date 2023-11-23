package jobsheet13;
import java.util.Scanner;

public class Ucapan_03 {
    public static String penerimaucapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yg di beri Ucapan");
        String namaorang = sc.nextLine();
        sc.close();
        return namaorang;
    }
    public static void main(String[] args) {
        String Alex = penerimaucapan();
        System.out.print("Thankyou" + Alex + "\n I Love you ");
    }
}
