package jobsheet11;
import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            int attempts = 0; 

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                attempts++;

                if (answer == number) {
                    success = true;
                    System.out.println("Selamat! Anda berhasil menebak angka " + number + " dalam " + attempts + " percobaan.");
                } else if (answer < number) {
                    System.out.println("Angka terlalu kecil. Coba lagi.");
                } else {
                    System.out.println("Angka terlalu besar. Coba lagi.");
                }

            } while (!success);

            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
