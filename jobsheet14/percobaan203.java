package jobsheet14;
import java.util.Scanner;

public class percobaan203 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bilangan Yg di hitung : ");
        int Bilangan = sc.nextInt();
        System.out.println("Pangkat : ");
        int Pangkat = sc.nextInt();
        
        System.out.print("Hasil perhitungan: ");
        System.out.println(Bilangan + " = " + hitungpangkat(Bilangan, Pangkat));
        
    }

    static int hitungpangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(x + "x");
            return x * hitungpangkat(x, y-1);
        }
    }
}
