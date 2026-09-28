import java.util.Locale;
import java.util.Scanner;

public class RekapNilai {
    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===== REKAP NILAI KELAS =====");
        System.out.println("Ketik -1 kalau sudah selesai.");

        int nomor = 1;
        int nilai = 0;
        double total = 0;

        do {
            System.out.print("Nilai ke-" + nomor + " : ");

            if (!in.hasNextInt()) {
                System.out.println("input harus berupa angka");
                in.next();
                continue;
            }

            nilai = in.nextInt();

            if (nilai == SELESAI) {
                break;
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println("nilai harus 0-100");
                continue;
            }

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

            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default -> "Tidak Lulus";
            };

            System.out.println("  Grade " + grade + " — " + keterangan);

            total += nilai;
            nomor++;

        } while (nilai != SELESAI);

        int sah = nomor - 1;

        System.out.println();

        // Jika langsung -1, tidak ada nilai sah sehingga tidak boleh membagi dengan nol.
        if (sah == 0) {
            System.out.println("Belum ada nilai yang dimasukkan.");
            return;
        }

        double rata = total / sah;
        String status = rata >= 60 ? "LULUS" : "TIDAK LULUS";

        System.out.println("Nilai sah   : " + sah);
        System.out.println("Rata-rata   : "
                + String.format(Locale.forLanguageTag("id-ID"), "%.2f", rata));
        System.out.println("Status      : " + status);
    }
}

        }
}
