package jobsheet13;
import java.util.Scanner;

public class  Percobaan603 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L, Vol;

        System.out.println("Masukan Panjang ");
        p = input.nextInt();
        System.out.println("Masukan lebar ");
        l = input.nextInt();
        System.out.println("Masukan Tinggi ");
        t = input.nextInt();
        
        L = p*l;
        System.out.println("Luas Persergi Panjang Adalah "+ L);
        
        Vol = p*l*t;
        System.out.println("volume Persergi Panjang Adalah "+ Vol);
    }
    static int hitungluas (int pjg, int lb) {
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungvolume (int tinggi , int a , int b) {
        int volume= hitungluas(a, b) * tinggi;
        return volume;
    }

}
