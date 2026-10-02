import java.util.Scanner;

public class Main {

    // Nilai -1 digunakan untuk mengakhiri input
    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== REKAP NILAI KELAS =====");
        System.out.println("Ketik -1 jika sudah selesai.");

        double total = 0;
        int jumlah = 0;
        int nilai = 0;

        // Perulangan untuk memasukkan nilai siswa
        do {
            System.out.println("Nilai Ke-" + (jumlah + 1) + " : ");
            nilai = input.nextInt();

            // Jika nilai -1, input dihentikan
            if (nilai == SELESAI) {
                continue;
            }

        } while (nilai != SELESAI);
    }
}