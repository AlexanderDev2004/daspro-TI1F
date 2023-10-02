import java.util.Scanner;
public class PemilihanPercobaan103 {

    public static void main(String[] args) {
        Scanner Input00 = new Scanner(System.in);
        System.out.println("Masukan Angka: ");
        int Angka = Input00.nextInt();
        if (Angka % 2 == 0) {
            System.out.println("Angka"+Angka+ "Bilangan Gelap " );
        } else {
            System.out.println("Angka "+Angka+"Bilangan ganjil");            
        }
    }
}