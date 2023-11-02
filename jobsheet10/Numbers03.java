package jobsheet10;
import java.util.Arrays;

public class Numbers03 {
    public static void main(String[] args) {
        int[][] mynumber = new int[3][];
        mynumber[0] = new int[5];
        mynumber[1] = new int[3];
        mynumber[2] = new int[1];

        

        for (int i = 0; i < mynumber.length; i++) {
            System.out.println(Arrays.toString(mynumber[i]));
        }
        for (int i = 0; i < mynumber.length; i++) {
            System.out.println("panjang baris ke - " + (i + 1) + ":" + mynumber[i].length);
        }
        
    }
}
