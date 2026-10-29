import java.util.Scanner;

public class Tugas1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAngka = 0;

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            totalAngka += i;
            System.out.println();
        }

        System.out.println("Total banyaknya angka yang telah dicetak = " + totalAngka);

        sc.close();
    }
}