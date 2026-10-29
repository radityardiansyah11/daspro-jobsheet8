import java.util.Scanner;

public class Tugas2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long jumlah = 0;

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.print("Nilai n harus minimal 3");

        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    System.out.print(hasil + "\t");

                    jumlah += hasil;
                }
                System.out.println();
            }

            System.out.println("Jumlah seluruh angka: " + jumlah);
        }

        sc.close();
    }
}