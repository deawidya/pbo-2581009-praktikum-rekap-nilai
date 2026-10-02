import java.util.Scanner;
public class Main {
    static final int SELESAI = -1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== REKAP NILAI KELAS =====");
        System.out.println("Ketik -1 jika sudah selesai.");

        double total = 0;
        int jumlah = 0;
        int nilai = 0;

        do {
            System.out.println("Nilai Ke-" + (jumlah + 1) + " : ");
            nilai = input.nextInt();

            if (nilai == SELESAI) {
                continue;
            }
            if (nilai < 0 || nilai > 100) {
                System.out.println("Ditolak - nilai harus 0-100");
                continue;
            }

            char grade;
            if (nilai >= 90){
                grade ='A';
            }else if (nilai >= 80){
                grade ='B';
            }else if (nilai >= 70){
                grade ='C';
            }else if (nilai >= 60){
                grade ='D';
            }else {
                grade ='E';
            }

            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default -> "Tidak Lulus";
            };

            System.out.println(" Grade " + grade + " - " + keterangan);

            total += nilai;
            jumlah++;
        }while (nilai !=SELESAI);
        System.out.println();
        System.out.println("Nilai sah : " + jumlah);

        if (jumlah == 0) {
            System.out.println("Tidak ada nilai yang dimasukkan.");
        }else {
            double rata = total / jumlah;
            String status = rata >= 60 ? "LULUS" : "TIDAK LULUS";
            System.out.println("Rata-rata : " + String.format("%.2f",rata));
            System.out.println("Status: " + status);
        }
    }
}