package jobsheet5;
import java.util.Scanner;

public class PemilihanPercobaan303 {

    public static void main(String[] args) {
        Scanner Input00 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukan Angka pertama: ");
        angka1 = Input00.nextDouble();
        System.out.println("Masukan Angka kedua: ");
        angka2 = Input00.nextDouble();
        System.out.println("Masukan operator (+ - * /): ");
        operator = Input00.next().charAt(0);

        switch (operator) {
            // tanpa berak 
           // case '+':
             //   hasil = angka1 + angka2;
               // System.out.println(angka1 + " + " + angka2 + "=" + hasil);
                
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                break;

        }
    }
}