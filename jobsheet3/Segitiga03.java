package jobsheet3;
import java.util.Scanner;
public class Segitiga03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int alas, tinggi;
        float luas;
        System.out.println("masukan Alas : ");
        alas = sc.nextInt();
        System.out.println("Masukan Tinggi : ");
        tinggi =sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("luas Segitiga : " + luas);

    }
}