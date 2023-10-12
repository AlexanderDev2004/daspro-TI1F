package jobsheet4;
import java.util.Scanner;
public class Gaji03 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        int Jmlmasuk, jmlTdkMasuk, totgaji;
        int gaji ,  potGaji ;
        
        System.out.println("Masukan Jumlah hari kerja anda : ");
        Jmlmasuk = Input.nextInt();
        System.out.println("Masukan Jumlah hari Tidak kerja anda : ");
        jmlTdkMasuk = Input.nextInt();
        System.out.println("Masukan Gaji hari anda  : ");
        gaji = Input.nextInt();
        System.out.println("Masukan Jumlah gaji potongan  : ");
        potGaji = Input.nextInt();

        totgaji=(Jmlmasuk * gaji)-(jmlTdkMasuk * potGaji);

        System.out.println("Gaji Yg anda terimah " + totgaji);



    }
}