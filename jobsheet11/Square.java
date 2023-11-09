package jobsheet11;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai N :");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("*");
        }
        System.out.println("----------------------------------------");
        for(int iOuter=1; iOuter<=n; iOuter++){ 
            for(int i=1; i<=n; i++){ 
             System.out.print("*"); 
            } 
            System.out.println(); 
        } 
    }
}
