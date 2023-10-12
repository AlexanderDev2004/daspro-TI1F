package jobsheet5;
import java.util.Scanner;
public class PemilihanPercobaan103 {

    public static void main(String[] args) {
        Scanner Input00 = new Scanner(System.in);
            // code sebelumnya
            //System.out.println("Masukan Angka: ");
            //int Angka = Input00.nextInt();
            //if (Angka % 2 == 0) {
                //System.out.println("Angka"+Angka+ "Bilangan Gelap " );
            //} else {
                //System.out.println("Angka "+Angka+"Bilangan ganjil");            
            //}

            // memakai Ternary Operator
            System.out.println("Masukan Angka: ");
            int Angka = Input00.nextInt();
            if (Angka % 2 == 0) {
                System.out.println("Angka"+Angka+ "Bilangan Gelap " );
            } else {
                System.out.println("Angka "+Angka+"Bilangan ganjil");            
            }

    }
}