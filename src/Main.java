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

        // Perulangan untuk memasukkan nilai
        do {
            System.out.println("Nilai Ke-" + (jumlah + 1) + " : ");
            nilai = input.nextInt();

            // Menghentikan proses jika pengguna memasukkan -1
            if (nilai == SELESAI) {
                continue;
            }

            // Memeriksa apakah nilai berada dalam rentang 0-100
            if (nilai < 0 || nilai > 100) {
                System.out.println("Ditolak - nilai harus 0-100");
                continue;
            }

            // Menentukan grade berdasarkan nilai
            char grade;

            if (nilai >= 90) {
                grade = 'A';
            } else if (nilai >= 80) {
                grade = 'B';
            } else if (nilai >= 70) {
                grade = 'C';
            } else if (nilai >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            // Memberikan keterangan berdasarkan grade
            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default -> "Tidak Lulus";
            };

            System.out.println(" Grade " + grade + " - " + keterangan);

            // Menambahkan nilai ke total dan jumlah nilai valid
            total += nilai;
            jumlah++;

        } while (nilai != SELESAI);

        System.out.println();
        System.out.println("Nilai sah : " + jumlah);

        if (jumlah == 0) {
            // Menampilkan pesan jika tidak ada nilai yang valid
            System.out.println("Tidak ada nilai yang dimasukkan.");
        } else {
            // Menghitung rata-rata nilai
            double rata = total / jumlah;

            // Menentukan status kelulusan
            String status = rata >= 60 ? "LULUS" : "TIDAK LULUS";

            System.out.println("Rata-rata : " + String.format("%.2f", rata));
            System.out.println("Status: " + status);
        }
    }
}