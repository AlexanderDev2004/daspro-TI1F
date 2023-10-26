import java.util.Scanner;

public class ArrayBilangan03 {
    public static void main(String[] args) {
        int[] bil = new int[4];

        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);

        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
            break;
        }

        // Deklarasi array dengan inisialisasi
        // double[] bil = { 5.0, 12867.0, 7.5, 2000000.0 };

        // Mencetak nilai array
        // for (int i = 0; i < bil.length; i++) {
        // System.out.println(bil[i]);
        // }
    }
}
