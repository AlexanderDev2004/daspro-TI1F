package jobsheet14;
public class JumlahMarmutRekursif03 {

    // Fungsi rekursif untuk menghitung jumlah pasangan marmut pada bulan ke-n
    static int jumlahMarmutRekursif(int bulan) {
        // Basis case: pada bulan ke-1 dan ke-2, hanya ada satu pasangan marmut
        if (bulan == 1 || bulan == 2) {
            return 1;
        }

        // Panggil fungsi rekursif untuk bulan ke-(n-1) dan ke-(n-2), lalu jumlahkan hasilnya
        return jumlahMarmutRekursif(bulan - 1) + jumlahMarmutRekursif(bulan - 2);
    }

    public static void main(String[] args) {
        System.out.println("Jumlah pasangan marmut pada setiap bulan:");

        for (int bulan = 1; bulan <= 12; bulan++) {
            int jumlahMarmut = jumlahMarmutRekursif(bulan);
            System.out.println("Bulan ke-" + bulan + ": " + jumlahMarmut + " pasangan marmut");
        }
    }
}
