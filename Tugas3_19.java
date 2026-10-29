import java.util.Scanner;

public class Tugas3_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko : ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1");

        } else {
            int nomorToko = 1;
            int jumlahPelanggan = 0;
            int jumlahBarang = 0;
            int totalBarangSemuaToko = 0;
            int barangTerbanyak = -1;
            int nomorTokoTerbanyak = -1;

            while (nomorToko <= jumlahToko) {
                System.out.println("\nToko " + nomorToko);

                do {
                    System.out.print("Jumlah pelanggan : ");
                    jumlahPelanggan = sc.nextInt();

                    if (jumlahPelanggan < 0) {
                        System.out.println(" Jumlah pelanggan tidak boleh negatif");
                    }

                    System.out.print("Total barang: ");
                    jumlahBarang = sc.nextInt();

                } while (jumlahPelanggan < 0);
                totalBarangSemuaToko += jumlahBarang;

                if (jumlahBarang > barangTerbanyak) {
                    barangTerbanyak = jumlahBarang;
                    nomorTokoTerbanyak = nomorToko;
                }

                nomorToko++;
            }

            System.out.println("========================================");
            System.out.println("Total barang seluruh toko : " + totalBarangSemuaToko);
            System.out.println("Toko dengan barang terbanyak : " + nomorTokoTerbanyak);

        }
        sc.close();

    }
}