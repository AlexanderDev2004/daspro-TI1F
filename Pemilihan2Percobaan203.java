import java.util.Scanner;
public class Pemilihan2Percobaan203 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalsudut;

        System.out.print("Masukkan sudut1: ");
        sudut1 = input03.nextFloat();
        System.out.print("Masukkan sudut2: ");
        sudut2 = input03.nextFloat();
        System.out.print("Masukkan sudut3: ");
        sudut3 = input03.nextFloat();

        totalsudut = sudut1 + sudut2 + sudut3;
        
        if (totalsudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                System.out.println("Segitiga adalah segitiga siku-siku");
            } else {
                System.out.println("Segitiga bukan segitiga siku-siku");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }

       //if (totalsudut == 180 && sudut1 > 0 && sudut2 > 0 && sudut3 > 0) {
        //if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
          //  System.out.println("Segitiga adalah segitiga siku-siku");
        //} else if (sudut1 == sudut2 && sudut2 == sudut3) {
           // System.out.println("Segitiga adalah segitiga sama sisi");
        //} else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut3 == sudut1) {
          //  System.out.println("Segitiga adalah segitiga sama kaki");
        //} else {
          //  System.out.println("Segitiga adalah segitiga sembarang");
        //}
    //} else {
      //  System.out.println("Bukan segitiga");
    //}
    }
}
