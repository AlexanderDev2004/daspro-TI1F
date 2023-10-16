package jobsheet7;
import java.util.Scanner;
public class logindowhile {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean berhasi = false;
        String usernama, password;

        while (berhasi = false) {
            System.out.println("Masukan Username Anda : ");
            usernama = input.nextLine();
            System.out.println("Masukan Password Anda : ");
            password = input.nextLine();

            if (usernama.equalsIgnoreCase("Alex") && password.equalsIgnoreCase("Alex123")) {
                System.out.println("Login Berhasil Bro");
            } else {
                System.out.println("Input Error");
            }
        }
    }
}
