package jobsheet10;
public class Bioskop03 {
    public static void main(String[] args) {

        String[][] penontong = new String[4][2];

        penontong[0][0] = "amin";
        penontong[0][1] = "alex";
        penontong[1][0] = "bebek";
        penontong[1][1] = "ayam";
        penontong[2][0] = "sisi";
        penontong[2][1] = "serigala";
        penontong[3][0] = "sophia";
        penontong[3][1] = "sisi";

        System.out.printf("%s \t %s \n", penontong[0][0], penontong[0][1]);
        System.out.printf("%s \t %s \n", penontong[1][0], penontong[1][1]);
        System.out.printf("%s \t %s \n", penontong[2][0], penontong[2][1]);
        System.out.printf("%s \t %s \n", penontong[3][0], penontong[3][1]);

        System.out.println("----------------------------");
        System.out.println(penontong.length);
        System.out.println(penontong[0].length);
        System.out.println(penontong[1].length);
        System.out.println(penontong[2].length);
        System.out.println(penontong[3].length);
        System.out.println("--------------------------------");
        System.out.println(penontong.length);
        for (int i = 0; i<penontong.length; i++) {
            System.out.println("Panjang baris ke - " + (i+1) + ":" + penontong[i].length) ;
        }
        System.out.println("-------------------------------");
        System.out.println(penontong.length);
        for (String[] barispenonton : penontong) {
            System.out.println("Panjang baris : " +barispenonton.length) ;
        }
        System.out.println("----------------------------------------");
        System.out.println("penontong baris ke 3");
        for (String i : penontong[2]) {
            System.out.println(i);
        }  
        System.out.println("---------------------------");
        for (int i = 0; i<penontong.length; i++) {
            System.out.println("Penontong baris ke "+ (i+1)+ ":" + String.join(",", penontong[i]));
        }
        
    }
}
