

public class Bintang1 {
    public static void main(String[] args) {

        int n = 10;
        int i = 1;

        do {
            int j = 1;

           
            while (j <= i) {
                // Cetak karakter bintang
                System.out.print("*");

                // Tambahkan nilai j dengan 1
                j++;
            }
            System.out.println();
            i++;
        } while (i <= n);
    }
}
