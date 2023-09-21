import java.util.Scanner;
public class HargaBayar03 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int harga, jumlah, lmbr;
        double disc, total, bayar, jmlDis;
        String merk;


        System.out.println("Masukan merek buku anda : ");
        merk = Input.next();
        System.out.println("Masukan lembar buku : ");
        lmbr = Input.nextInt();
        System.out.println("Masukan harga Barang yg di beli : ");
        harga = Input.nextInt();
        System.out.println("Masukan jumlah Barang yg di beli : ");
        jumlah = Input.nextInt();
        System.out.println("Masukan Discon Buku : ");
        disc = Input.nextDouble();

        total= harga*jumlah;
        jmlDis= total*disc;
        bayar= total-jmlDis;

        System.out.println("Nama Buku anda adalah : " + merk);
        System.out.println("diskon yang Anda dapat : " + jmlDis);
        System.out.println("yang harus di bayar : " + bayar);

    }
}