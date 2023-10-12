import java.util.Scanner;
public class Pemilihan2Percobaan103 {

    public static void main(String[] args) {
        Scanner Input03 = new Scanner(System.in);

        int tahun;

        System.out.println("Masukan Tahun : ");
        tahun = Input03.nextInt();

        if ((tahun % 4 == 0))  
        if ((tahun % 400) == 0){
            System.out.println("Tahun kabinet");

        } else {
            System.out.println("Bukan tahun kabinet");   
        } else {
            System.out.println("tahun");
        }
        
    }
}