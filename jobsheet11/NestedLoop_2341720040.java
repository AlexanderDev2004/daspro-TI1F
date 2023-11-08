package jobsheet11;
import java.util.Scanner;

public class NestedLoop_2341720040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[2][7];
        double total = 0.0;

        // Input temperatures for each city and day
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
                total += temps[i][j]; 
            }
            System.out.println();
        }

        
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }

       
        for (int i = 0; i < temps.length; i++) {
            double rata = total / temps[i].length;
            System.out.println("Rata-Rata Suhu kota ke-" + (i + 1) + ": " + rata);
        }

        sc.close(); 
    }
}
